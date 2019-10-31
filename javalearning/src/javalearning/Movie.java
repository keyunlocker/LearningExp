package javalearning;

public class Movie {

	private String name;
	private double rating;
	private int year;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public Movie(String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "name::"+this.name+"::year::"+this.year+"::rating::"+this.rating;
	}
}
