package com.inheritance_assignment;

class Iplteam{
	void play()
	{
	System.out.println("IPL Matches");
	}
}
class CSK extends Iplteam{
	
}
class RCB extends Iplteam{
	
}
public class Cricket {

	public static void main(String[] args) {
		
		CSK c = new CSK();
		c.play();
		RCB r = new RCB();
		r.play();
	}

}
