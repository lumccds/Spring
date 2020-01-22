import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { InicioComponent } from '../app/inicio/inicio.component';
import { LoginComponent } from '../app/login/login.component';
import { ListagemComponent } from '../app/listagem/listagem.component';
import { LogoutComponent } from '../app/logout/logout.component';


const routes: Routes = [
  { path: '', component: InicioComponent },
  { path: 'login', component: LoginComponent },
  { path: 'listagem', component: ListagemComponent },
  { path: 'inicio', component: InicioComponent },
  { path: 'logout', component: LogoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }