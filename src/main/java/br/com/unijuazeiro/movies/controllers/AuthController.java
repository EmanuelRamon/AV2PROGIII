package br.com.unijuazeiro.movies.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.unijuazeiro.movies.domain.customer.Customer;
import br.com.unijuazeiro.movies.infrastructure.CustomersDB;
import br.com.unijuazeiro.movies.web.components.AuthSession;

@Controller
public class AuthController {

	@Inject
	private CustomersDB customersDB;

	@Inject
	private Result result;

	@Inject
	private AuthSession session;

	@Get("login")
	public void login() {

	}

	@Post("auth")
	public void authenticate(Customer customer) {
		System.out.println(customer.getName());
		System.out.println(customer.getPassword());
		Customer user = this.customersDB.findByName(customer.getName());
		if (user != null) {
			if (user.getPassword().equals(customer.getPassword())) {
				this.session.setUsername(user.getName());
				this.result.redirectTo(MoviesController.class).getAll();
			}
		} else {
			result.include("msgLoginError", "Usuário/senha inválidos");
			result.redirectTo(this).login();
		}
	}
//   
//   @Get("logout")
//   public void logout(){
//       this.session.logout();
//       result.redirectTo(this).login();
//   }
}
