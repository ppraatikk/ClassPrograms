package com.interfaceDemo;

public class Information implements Hideable {
	
	public void hide()
	{
		System.out.print("hide ");
	}

	public static void main(String[] args) {
		
		Hideable h = new Information();
		h.hide();
	}

}
