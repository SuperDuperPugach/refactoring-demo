package com.scrumtrek.simplestore;

import java.util.HashMap;
import java.util.Map;

public class Rental {
	private Map<Movie, Integer> movies;
	private int m_DaysRented;

	public Rental () {
		movies = new HashMap<>();
	}


	public Rental(Movie movie, int daysRented) {
		movies = new HashMap<>();
		addMovie(movie, daysRented);
	}

	public int getDaysRented() {
		return m_DaysRented;
	}

	public Map<Movie, Integer> getMovies() {
		return movies;
	}

	public void addMovie(Movie movie, int daysRented) {
		movies.put(movie, daysRented);
	}
}

