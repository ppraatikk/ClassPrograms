package com.array_Assignment;



public class Problem8 {
	 public static int negativeElement(int arr[])
	 {
		 int count =0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<0)
			 {
				 System.out.println(arr[i]);
				 count++;
			 }
		 }
		return count++; 
	 }

	public static void main(String[] args) {
		
		int arr[] = {1,2,-14,-44,7,99,345,-347};
		
		int count=Problem8.negativeElement(arr);
		System.out.println("negative Number Count is :"+count);
	}

}
