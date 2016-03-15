package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.pricecodes.PriceCode;

public class Movie {
	private String movieTitle;
	private PriceCode priceCode;

	public Movie(String title, PriceCode priceCode) {
		movieTitle = title;
		this.priceCode = priceCode;
	}

	public PriceCode getPriceCode()	{
		return priceCode;
	}
	
	public void setPriceCode(PriceCode value) {
		priceCode = value;
	}

	public String getTitle() {
		return movieTitle;
	}
}

