package com.stringAssignment;



public class RemoveSpace {
	public static void removeAllSpace(String str)
	{
		String temp="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			else 
			{
				temp=temp+ch[i];
			}
		}
		System.out.println(temp);
	}
	public static void removeExtraSpace(String str)
	{
		String temp="";
	   String st[]=str.split("\\s+");
	   //System.out.println(Arrays.toString(st));
	   for(int i=0;i<st.length;i++)
	   {
		 temp=temp+st[i]+" ";
	   }
	   System.out.println(temp);
	}
	public static void removeExtraSpace1(String str)
	{
		String temp=""; 
		String temp1="";
		char[]ch=str.toCharArray();
		//System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i] !=' ')
			{
				temp1=temp1+ch[i];
			}
			else
			{
				if(temp1!="")
				{
					temp=temp+temp1+" ";
					temp1="";
				}	
			}	
		}
		System.out.print(temp);	
	}

	public static void main(String[] args) {
		
		String str = " My   Name iS  Pratik";

		 RemoveSpace.removeAllSpace(str);
		 RemoveSpace.removeExtraSpace(str);
		 RemoveSpace.removeExtraSpace1(str);
		 
	}

}
