package com.SetDemo;
import java.util.*;
public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
		lhs.add(12);
		lhs.add(13);
		lhs.add(21);
		
		LinkedHashSet<Integer>lhss=new LinkedHashSet<>();
		lhss.add(21);
		lhss.add(22);
		lhss.add(23);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		boolean ans=lhs.contains(num);
		boolean ans1=lhss.contains(num);
		
		if(ans && ans1)
			System.out.println("Present in both set");
		else
			System.out.println("Not Present in both set");
		
		

		
	}

}
