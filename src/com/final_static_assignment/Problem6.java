package com.final_static_assignment;

public class Problem6 {
	int id;
	String name;
	Problem6(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{   
		System.out.println(id+"  "+name);
		this.show('X');
	}
    void show(char ch)
    {
    	System.out.println("show method  "+ch);
    }
    Problem6()
    {
    	this(11,"asdf");
    	System.out.println("Parameter less Constructor");
    }
    
	public static void main(String[] args) {
		Problem6 p = new Problem6();
		p.display();

	}

}
