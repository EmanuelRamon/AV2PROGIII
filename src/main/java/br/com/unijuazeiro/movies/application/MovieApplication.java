package br.com.unijuazeiro.movies.application;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.unijuazeiro.movies.domain.movie.Movie;
import br.com.unijuazeiro.movies.domain.movie.MoviesService;

@ApplicationScoped
public class MovieApplication {

	@Inject
	private MoviesService moviesService;
	
	public void save(Movie movie) {
		this.moviesService.save(movie);
	}

	public List<Movie> listAll() {
		return this.moviesService.listAll();
	}

	public Movie findByTitle(String title) {
		return this.moviesService.findByTitle(title);
	}
	
	public Movie findById(String id) {
		return this.moviesService.findById(id);
	}

	public void update(Movie movie) {
		this.moviesService.update(movie);
	}

	public void delete(String id) {
		this.moviesService.delete(id);
	}

}
