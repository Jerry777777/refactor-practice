package com.twu.refactoring;

public class Movie {

	public  abstract  class Movie {
	private String title;

	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}
	abstract double getCharge(int daysRented);
	abstract int getFrequentRenterPoints(int daysRented);

	public String getTitle () {
		return title;
	}
}

