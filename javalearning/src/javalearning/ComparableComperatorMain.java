package javalearning;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class ComparableComperatorMain {

	public static void main(String args[]) {

		//Comparable start:-
		/*
		 * In this the compare to method of the comparable is called which is override 
		 * in the pojo which need to be compare 
		 * Same class only one type of comparison use this else use comparator
		 */
		List<MovieComparable> movieComperablesList = new LinkedList<>();
		MovieComparable movieComperable1 = new MovieComparable("HP1", 5.0, 2000);
		MovieComparable movieComperable2 = new MovieComparable("HP2", 4.5, 2001);
		MovieComparable movieComperable3 = new MovieComparable("HP3", 5, 2002);
		MovieComparable movieComperable4 = new MovieComparable("HP4", 3.4, 2003);
		MovieComparable movieComperable5 = new MovieComparable("HP5", 2.0, 2004);
		MovieComparable movieComperable6 = new MovieComparable("HP6", 3.5, 2005);
		MovieComparable movieComperable7 = new MovieComparable("HP7", 5.0, 2006);

		movieComperablesList.add(movieComperable1);
		movieComperablesList.add(movieComperable6);
		movieComperablesList.add(movieComperable3);
		movieComperablesList.add(movieComperable4);
		movieComperablesList.add(movieComperable5);
		movieComperablesList.add(movieComperable2);
		movieComperablesList.add(movieComperable7);
		Collections.sort(movieComperablesList);
		System.out.println(movieComperablesList);
		//Comparable end
		
		//Comparator Start:--
		/*
		 * In this the compare method of the comparator is called
		 * and we can write the n number comparison no need to have the one comparison specific to the class or pojo as the 
		 * comparable
		 * 
		 *  We can write in three ways 
		 *  1.create class implement comparator and override the compare() method
		 *  2.give the direct implementation as the inner class
		 *  3.using the lamda operation 
		 */
		
		List<Movie> movieList = new LinkedList<>();
		Movie movie1 = new Movie("HP1", 5.0, 2000);
		Movie movie2 = new Movie("HP2", 4.5, 2001);
		Movie movie3 = new Movie("HP3", 5, 2002);
		Movie movie4 = new Movie("HP4", 3.4, 2003);
		Movie movie5 = new Movie("HP5", 2.0, 2004);
		Movie movie6 = new Movie("HP6", 3.5, 2005);
		Movie movie7 = new Movie("HP7", 5.0, 2006);

		movieList.add(movie1);
		movieList.add(movie6);
		movieList.add(movie3);
		movieList.add(movie4);
		movieList.add(movie5);
		movieList.add(movie2);
		movieList.add(movie7);
		
		movieList.sort(new Name());
		System.out.println("Name::::::::::::"+movieList);
		movieList.sort(new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				if(o1.getYear()<o2.getYear())return -1;
				else if(o1.getYear()>o2.getYear())return 1;
				else return 0;
			}
		});
		
		System.out.println("YEAR:::::::::::::"+movieList);
		
		
		movieList.sort((o1,o2)->{
			if(o2.getRating()<o1.getRating())return -1;
			else if(o2.getRating()>o1.getRating()) return 1;
			else return 0;
		});
		
		System.out.println("RATING:::::::::::::"+movieList);
		
		//Comparator end

	}

}

//1st way of the comparator
class Name implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
