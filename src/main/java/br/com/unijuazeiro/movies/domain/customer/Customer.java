package br.com.unijuazeiro.movies.domain.customer;

import java.util.UUID;

public class Customer {
	private String id;
	private String name;
	private String cpf;
	private String password;
	private String birth;

	public Customer() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public boolean equals(Object o) {
		return ((Customer) o).getId().equals(this.id);
	}

}
