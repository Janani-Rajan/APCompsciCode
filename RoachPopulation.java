package janani.apcs;
/**
 * The RoachPopulation class models an environment in which the population of cockroaches increases 
 * or decreases depending on their breeding patterns and when they are sprayed by pesticides.
 * @author Janani Rajan
 * @version 10.01.2020
 */
public class RoachPopulation {
	private int population;
	
	/**
	 * Constructs an empty Roach Population.
	 */
	public RoachPopulation() {
		this.population = 0;
	}
	
	/**
	 * Constructs a RoachPopulation with a specified initial population
	 * @param population the initial population of a specific Roach Population
	 */
	public RoachPopulation(int population) {
		this.population = population;
	}
	
	/**
	 * Doubles the population of the roaches.
	 */
	public void breed() {
		this.population *= 2;
	}
	
	/**
	 * Decreases the population of the cockroaches by the specified percentage.
	 * @param percent the percentage that the population of the roaches will be decreased by
	 */
	public void spray(double percent) {
		this.population = (int) (this.population * ((100 - percent)/100));	
	}
	
	/**
	 * Returns the current roach population.
	 * @return the current roach population
	 */
	public int getPopulation() {
		return this.population;
	}
	
	/**
	 * Returns a String representation of the RoachPopulation object
	 * @return the string representation of the object
	 */
	@Override
	public String toString() {
		String str = "Cockroach Population: " + this.population;
		return str;
	}
}
