/*
 * Janani Rajan
 * 9/15/2020
 */
public class Car {
	private int yearModel;
	private String make;
	private int speed;
	
	public Car() {
		yearModel = 0;
		make = "";
		speed = 0;
	}
	public Car(int ym, String m, int s) {
		yearModel = ym;
		make = m;
		speed = s;
	}
	
	public int getYearModel() {
		return yearModel;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void accellerate() {
		speed += 5;
	}
	
	public void brake() {
		speed -= 5;
	}
	
	@Override
	public String toString() {
		return "Year Model: " + yearModel + "\n" + "Make: " + make + "\n" + "Current Speed: " + speed;
		
	}

}
