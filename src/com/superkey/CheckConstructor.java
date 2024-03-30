package com.superkey;


class District{
	District()
	{
		System.out.println("District");
	}
}
class Latur extends District{
	Latur()
	{
		super();
		System.out.println("Latur");
	}
}
public class CheckConstructor {

	public static void main(String[] args) {
		Latur ltr = new Latur();
			

	}

}
