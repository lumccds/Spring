import { Component, OnInit } from '@angular/core';
import { Produto } from '../model/produto';
import { ProdutoService } from '../servicos/produto.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listagem',
  templateUrl: './listagem.component.html',
  styleUrls: ['./listagem.component.css']
})
export class ListagemComponent implements OnInit {

  lista: Produto[];

  constructor(private srv:ProdutoService, private route: Router) { }

  ngOnInit() {
    if (localStorage.getItem("isiToken")) {
      this.srv.getAllProdutos().subscribe(
        (res: Produto[]) => {
          this.lista = res;
        },
        (err) => {
          this.route.navigate(['/inicio']);
        }
      );
    }
    else {
      this.route.navigate(['/inicio']);
    }
  }
}
