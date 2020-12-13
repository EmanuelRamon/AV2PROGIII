package br.com.unijuazeiro.movies.domain.contact;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.management.relation.Role;

import br.com.unijuazeiro.contact.exceptions.BusinessException;
import br.com.unijuazeiro.movies.exceptions.BusinessException;
'import br.com.unijuazeiro.contact.infrastructure.ContactDB;

@ApplicationScoped
public class ContactService {

	@Inject
	private ContactDB contactDB;

	public void save(Contact contact) throws BusinessException {
		Contact found = this.contactDB.findByTitle(contact.getTitle());
		if (found != null) {
			throw new BusinessException("Contato já cadastrado");
		}
//		para cadastrar um contato tem que ser ADM role == 1;
		
//		if (role != 1) {
//			do nothing
//		throw new BusinessException("Usuario negado");
//		}
		this.contactDB.save(contact);
	}
	
	public Contact findById(String id) throws BusinessException {
		Contact found = this.contactDB.findById(id);
		
		if (found == null) {
			throw new BusinessException("Contato não Localizado");
		}
		
		return found;
	}

	public Contact findByTitle(String title) throws BusinessException {
		Contact found = this.contactDB.findByTitle(title);
		
		if (found == null) {
			throw new BusinessException("Contato não Localizado");
		}
		
		return found;
	}

	public void update(Contact contact) {
		this.contactDB.update(contact);
	}

	public void delete(String id) {
		this.contactDB.delete(id);
	}

	public List<Contact> listAll() {
		return this.contactDB.listAll();
	}
}
