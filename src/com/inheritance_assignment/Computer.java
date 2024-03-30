package com.inheritance_assignment;
class Laptop{
	 private int usbPort;
	 private int speed;
	public void setUsbPort(int usbPort)
	{
		this.usbPort=usbPort;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public int getUsbPort()
	{
		return usbPort;
	}
	public int getSpeed()
	{
		return speed;
	}
}
public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop hp = new Laptop();
		hp.setUsbPort(3);
		hp.setSpeed(15);
		
		System.out.println("Laptop Hp USB Port : "+hp.getUsbPort());
		System.out.println("Laptop Hp Speed : "+hp.getSpeed());
	}

}
