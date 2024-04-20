package com.labSession;
import java.util.*;

class Movie implements Comparable<Movie> {

	int id;
	String name;
	double rating;
	public Movie(int id, String name, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	public int compareTo(Movie m)
	{
		return m.name.compareTo(this.name);
	}
	
	

	
//	public static void sameName(ArrayList<Movie>List)
//	{
//		Iterator<Movie>itr=List.iterator();
//		while(itr.hasNext())
//		{
//			Movie m=itr.next();
//			if(m.name.equals("Animal"))
//			{
//			 System.out.println(m);	
//			}
//		}
//	}
	
}
class nameComparator implements Comparator<Movie>
{
	public int compare(Movie m1,Movie m2)
	{
		if(m1.rating==m2.rating)
		{
			return m1.name.compareTo(m2.name);
		}
		else
			return (int)(m1.rating-m2.rating);
	}
}
public class SameRating {

	public static void main(String[] args) {
		
		ArrayList<Movie>list=new ArrayList<>();
		list.add(new Movie(1,"Animal",4.5));
		list.add(new Movie(2,"Maidaan",3.1));
		list.add(new Movie(3,"Crew",4.5));
		
		System.out.println(list);
		System.out.println("//////////////////");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("//////////////////");
		Collections.sort(list,new nameComparator());
		System.out.println(list);
		
		
		//System.out.println("//////////////////");
		//Movie.sameName(list);
		
			          
	}

}
