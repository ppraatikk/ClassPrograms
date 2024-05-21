package com.Pratice;

public class Problem7 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,5,1,2,4,9,7,6,4,5,3,4,3,2};
		System.out.println(arr.length);

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
				System.out.println(arr[i]+" "+count);
			}
		}
	}

}
