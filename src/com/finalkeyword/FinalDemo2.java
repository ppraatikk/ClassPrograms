package com.finalkeyword;
class State{
	 final void show()               // final method cannot override
	{
		System.out.println("State");
	}
}
class Maharashtra extends State{
//	@Override
//	 void show()   /// final method cannot override
//	{
//		System.out.println("Maharashtra");
//	}
	
}

public class FinalDemo2 {

	public static void main(String[] args) {
		
		Maharashtra mh = new Maharashtra();
		mh.show();
	}                                                                                                                                                      

}
