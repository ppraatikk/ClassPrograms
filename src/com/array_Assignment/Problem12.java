package com.array_Assignment;

public class Problem12 {
	public static void uniqueElement(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(arr[i]==arr[k])
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(arr[i]);
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,2,3,4,6,7,9,8,10,11,23,};
		
		Problem12.uniqueElement(arr);

	}

}
