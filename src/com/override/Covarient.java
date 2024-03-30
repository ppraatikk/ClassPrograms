package com.override;
import java.util.*;

class Wildanimal{
	public Animal getAnimal()
	{
		return new Animal();
	}
	
}
class Doganimal extends Wildanimal{
	@Override
	public Lion getAnimal()
	{
		return new Lion();
	}
}
public class Covarient {

	public static void main(String[] args) {
			Wildanimal wa = new Doganimal();
			Lion l=(Lion)(wa.getAnimal());
			//Lion l = wa.getAnimal();
			l.eat();
			
	}

}
