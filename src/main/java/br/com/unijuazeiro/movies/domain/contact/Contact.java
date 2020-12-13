package br.com.unijuazeiro.movies.domain.contact;

import java.util.UUID;

public class Contact {
	private String id;
	private String title;
	private Double price;

	public Contact() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		return ((Contact) o).getId().equals(this.id);
	}
}
