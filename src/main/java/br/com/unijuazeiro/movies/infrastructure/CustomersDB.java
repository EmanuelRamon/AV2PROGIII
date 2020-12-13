package br.com.unijuazeiro.movies.infrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

import br.com.unijuazeiro.movies.domain.customer.Customer;

@ApplicationScoped
public class CustomersDB {

	private List<Customer> customersList = new ArrayList<>();

	public CustomersDB() {}

	public void save(Customer customer) {
		this.customersList.add(customer);
	}

	public Customer findById(String id) {
		Customer found = null;
		for (Customer customer : customersList) {
			if (customer.getId().equals(id)) {
				found = customer;
				break;
			}
		}
		return found;
	}

	public Customer findByName(String name) {
		Customer found = null;
		for (Customer customer : customersList) {
			if (customer.getName().equalsIgnoreCase(name)) {
				found = customer;
				break;
			}
		}
		return found;
	}

	public Customer findByCpf(String cpf) {
		return this.customersList.stream().filter(customer -> customer.getCpf().equals(cpf)).findFirst().orElse(null);
	}

	public void update(Customer customer) {

		for (int i = 0; i < customersList.size(); i++) {
			if (customersList.get(i).getId().equals(customer.getId())) {
				customersList.set(i, customer);
				break;
			}
		}

	}

	public List<Customer> listAll() {
		return customersList;
	}

	public void delete(String id) {
		customersList.removeIf(customer -> customer.getId().equals(id));
	}

}
