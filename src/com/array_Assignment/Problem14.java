package com.array_Assignment;

public class Problem14 {
	public static void frequency(int arr[])
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
				System.out.println(arr[i]+"      "+count);
			}
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,4,5,6,3,2,8,7,5,9,7,6,4,5,4};
		
		Problem14.frequency(arr);
	}

}
