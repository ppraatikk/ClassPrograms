package com.Queue;
import java.util.*;
public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> p = new PriorityQueue<>(); 
		p.add(97);
		p.add(76);
		p.add(101);
		p.add(13);
		p.add(37);
		
		System.out.println(p);
		p.poll();
		System.out.println(p);
		p.poll();
		System.out.println(p);
		p.poll();
		System.out.println(p);
		
	}

}
