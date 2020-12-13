package br.com.unijuazeiro.movies.application;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.unijuazeiro.movies.domain.customer.Customer;
import br.com.unijuazeiro.movies.domain.customer.CustomersService;

@ApplicationScoped
public class CustomersApplication {

	@Inject
	private CustomersService customersService;

	public void save(Customer customer) {
		this.customersService.save(customer);
	}

	public List<Customer> listAll() {
		return this.customersService.listAll();
	}

	public Customer findById(String id) {
		return this.customersService.findById(id);
	}

	public void update(Customer customer) {
		this.customersService.update(customer);
	}

	public void delete(String id) {
		this.customersService.delete(id);
	}

}
