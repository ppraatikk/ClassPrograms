package com.superkey;

class Tv{
	Tv()
	{
		System.out.println("TV");
	}
}
class SonyTv extends Tv{
	 SonyTv()
	 {
		super();
	 }
}
public class Constructor {

	public static void main(String[] args) {
		
		SonyTv t = new SonyTv();
	}

}
