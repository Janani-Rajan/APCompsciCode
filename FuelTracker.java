/**
 * The FuelTracker class tracks the fuel in a vehicle's tank. 
 * @author Janani Rajan
 * @version 10.2.2020
 */
public class FuelTracker {
	private int fuelEfficiency;
	private double fuelAmount;
	
	/**
	 * Constructs an empty FuelTracker with the default values of 0 mpg fuel efficiency and 0 fuel in the tank
	 */
	public FuelTracker() {
		this.fuelEfficiency = 0;
		this.fuelAmount = 0; 
	}
	
	/**
	 * Constructs a FuelTracker with a specified fuel efficiency in miles per gallon (mpg) and a specified fuel amount in gallons.
	 * @param fuelEfficiency the fuel efficiency of the car in mpg
	 * @param fuelAmount the amount of fuel in the car in gallons
	 */
	public FuelTracker(int fuelEfficiency, double fuelAmount) {
		this.fuelEfficiency = fuelEfficiency;
		this.fuelAmount = fuelAmount;
	}
	
	/**
	 * Reduces the amount of fuel in a tank based on the vehicle's fuel efficiency and how much it has driven.
	 * @param miles the number of miles the car is going to drive
	 */
	public void drive(double miles) {
		this.fuelAmount -= (miles/this.fuelEfficiency);
	}
	
	/**
	 * Adds a certain number of gallons to the fuel tank of the car
	 * @param gallons the number of gallons to be added to the fuel tank
	 */
	public void addFuel(double gallons) {
		this.fuelAmount += gallons;
	}
	
	/**
	 * Returns the amount of fuel in the car
	 * @return the amount of fuel in the car, in gallons
	 */
	public double getFuel() {
		return this.fuelAmount;
	}
	
	/**
	 * Returns the fuel efficiency of the vehicle, in mpg
	 * @return the fuel efficiency of the vehicle, in mpg
	 */
	public int getFuelEfficiency() {
		return this.fuelEfficiency;
	}
	
	/**
	 * Returns a string representation of the FuelTracker object which contains the fuel efficiency in mpg and the fuel amount in gallons.
	 * @return a string representation of the FuelTracker object
	 */
	
	@Override
	public String toString() {
		return "Fuel Efficiency (mpg): " + this.fuelEfficiency + "\nFuel Amount (gallons): " + this.fuelAmount;
	}
}
