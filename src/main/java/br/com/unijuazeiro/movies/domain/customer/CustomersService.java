package br.com.unijuazeiro.movies.domain.customer;

import br.com.unijuazeiro.movies.exceptions.BusinessException;
import br.com.unijuazeiro.movies.infrastructure.CustomersDB;

import java.util.List;
import javax.ejb.ApplicationException;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CustomersService {

    @Inject
    private CustomersDB customersDB;

    public void save(Customer customer) {
        Customer found = this.customersDB.findByCpf(customer.getCpf());
        if (found != null) {
            throw new BusinessException("CPF já cadastrado");
        }
        this.customersDB.save(customer);
    }

    public Customer findById(String id) {
        return this.customersDB.findById(id);
    }

    public void update(Customer customer) {
        this.customersDB.update(customer);

    }

    public void delete(String id) {
        this.customersDB.delete(id);
    }

    public List<Customer> listAll() {
        return this.customersDB.listAll();
    }
}
