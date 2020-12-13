package br.com.unijuazeiro.movies.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.unijuazeiro.movies.application.MovieApplication;
import br.com.unijuazeiro.movies.domain.movie.Movie;
import br.com.unijuazeiro.movies.exceptions.BusinessException;
import br.com.unijuazeiro.movies.web.annotations.Auth;

@Controller
@Path("movies")
@Auth
public class MoviesController {
	
	@Inject
	private MovieApplication movieApplication;
	
	@Inject
	private Result result;

	@Get("")
	public void getAll() {
		result.include("movieList", this.movieApplication.listAll());
	}

	@Get("id/{id}")
	public void getOne(String id) {
		result.include("movie", this.movieApplication.findById(id));
	}

	@Get("new")
	public void newMovie() {
		
	}
	
	@Post("save")
	public void create(Movie movie) {
		try {
			this.movieApplication.save(movie);
			result.redirectTo(this).getAll();
		} catch (BusinessException ex) {
			result.include("error", ex.getMessage());
			result.include("movie", movie);
			result.redirectTo(this).newMovie();
		}
	}

	@Post("update")
	public void update(Movie movie) {
		this.movieApplication.update(movie);
		result.redirectTo(this).getAll();
	}

	@Post("delete")
	public void delete(Movie movie) {
		this.movieApplication.delete(movie.getId());
		result.redirectTo(this).getAll();
	}
}
