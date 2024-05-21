
package com.Pratice;

public class Car {
	
    private String color;
    private int speed;

   
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    
    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    
    // Method to accelerate
    public void accelerate(int increment) {
        speed += increment;
    }
    
    
    // Method to display car details
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }


	
	 public static void main(String[] args) {
	        
	        Car myCar = new Car("Red", 60);

	        
	        myCar.display(); // Display initial details
	        myCar.accelerate(20); // Accelerate the car
	        myCar.setColor("Blue"); // Change the color
	        myCar.display(); // Display updated details
	    }
	

}
