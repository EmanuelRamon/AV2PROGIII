package br.com.unijuazeiro.movies.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.unijuazeiro.movies.application.CustomersApplication;
import br.com.unijuazeiro.movies.domain.customer.Customer;
import br.com.unijuazeiro.movies.exceptions.BusinessException;
import br.com.unijuazeiro.movies.web.annotations.Auth;

import javax.inject.Inject;

@Controller
@Path("customers")
public class CustomersController {

	@Inject
	private CustomersApplication customerApplication;

	@Inject
	private Result result;

	@Get("new")
	public void newCustomer() {

	}

	@Auth
	@Get("")
	public void getAll() {
		result.include("customersList", this.customerApplication.listAll());
	}

	@Auth
	@Get("id/{id}")
	public void getOne(String id) {
		result.include("customer", this.customerApplication.findById(id));
	}

	@Post("save")
	public void save(Customer customer) {
		try {
			this.customerApplication.save(customer);
			result.redirectTo(this).getAll();
		} catch (BusinessException ex) {
			result.include("error", ex.getMessage());
			result.include("customer", customer);
			result.redirectTo(this).newCustomer();
		}
	}

	@Auth
	@Post("update")
	public void update(Customer customer) {		
		this.customerApplication.update(customer);
		result.redirectTo(this).getAll();
	}

	@Auth
	@Post("delete")
	public void delete(Customer customer) {
		this.customerApplication.delete(customer.getId());
		result.redirectTo(this).getAll();
	}

	@Get("json")
	public void listAsJson() {
		result.use(Results.json()).from(this.customerApplication.listAll()).serialize();
	}

}
