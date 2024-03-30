package com.interfaceDemo;

interface Writeable{
	void write();
}
interface Readable{
	void read();
}
interface Printable{
	String name ="ss";
	void print();  //abstract method
	static void show()   //static method
	{
		System.out.println("show ");
	}
	default void display()   //default method
	{
		System.out.println("display ");	
	}
}
class Data implements Printable,Hideable,Readable,Writeable{
	String name ="QW";
	public void print()
	{
		System.out.println("print "+name+"  "+Printable.name);
	}
	public void hide()
	{
		System.out.println("hideeeee");
	}
	public void read()
	{
		System.out.println("Read");
	}
	public void write()
	{
		System.out.println("Write");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Printable p = new Data();
		p.print();
		p.display();
		Printable.show(); //calling using interface name because of static method
		
		Hideable h = new Data();
		h.hide();
		
		Readable r = new Data();
		r.read();
		
		Writeable w = new Data();
		w.write();
	}

}
