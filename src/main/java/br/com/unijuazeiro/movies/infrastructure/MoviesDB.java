package br.com.unijuazeiro.movies.infrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

import br.com.unijuazeiro.movies.domain.customer.Customer;
import br.com.unijuazeiro.movies.domain.movie.Movie;

@ApplicationScoped
public class MoviesDB {

	private List<Movie> movieList = new ArrayList<>();

	public MoviesDB() {

	}

	public List<Movie> listAll() {
		return movieList;
	}

	public void save(Movie movie) {
		this.movieList.add(movie);
		System.out.println(movieList);
	}

	public Movie findById(String id) {
		Movie found = null;
		for (Movie movie : movieList) {
			if (movie.getId().equals(id)) {
				found = movie;
				break;
			}
		}
		return found;
	}

	public Movie findByTitle(String title) {
		Movie found = null;

		for (Movie movie : movieList) {
			if (movie.getTitle().equalsIgnoreCase(title)) {
				found = movie;
				break;
			}
		}

		return found;
	}

	public void update(Movie movie) {
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getId().equals(movie.getId())) {
				movieList.set(i, movie);
				break;
			}
		}
	}

	public void delete(String id) {
		movieList.removeIf(movie -> movie.getId().equals(id));
	}
}
