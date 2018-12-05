package javalearning;

public class MovieComparable implements Comparable<MovieComparable> {
	
	private String name;
	private double rating;
	private int year;
	
	
	public MovieComparable(String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
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
	
	//this is one compare per bean it is like binding one pojo to the one type of comperition that is
	//it will always sort in the ascending order but based on the value return it will be arranged in the ascending or descending order  
	@Override
	public int compareTo(MovieComparable o) {
		if(this.year>o.getYear())
			return -1;
		else if(this.year<o.getYear())
			return 1;
		else
			return 0;
	}
	
	
	@Override
	public String toString() {
		return "name::"+this.name+"::year::"+this.year+"::rating::"+this.rating;
	}
	
	

}
