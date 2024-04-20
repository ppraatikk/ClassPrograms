package com.labSession;
import java.util.*;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,List<String>>map=new HashMap<>();
		
		
		
		map.put('A',(Arrays.asList("Apple","Add")));
		map.put('B',(Arrays.asList("Bat","Bold")));
		map.put('C',(Arrays.asList("Car","Cup","Cat")));
		map.put('D',(Arrays.asList("Doll","Dog")));
		
		for(Map.Entry<Character,List<String>>m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
		
		           
		
		
	}

}
