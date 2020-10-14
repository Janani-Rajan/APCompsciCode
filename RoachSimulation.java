package janani.apcs;
public class RoachSimulation {
	public static void main(String [] args) {
		RoachPopulation rp = new RoachPopulation(10);
		System.out.println("Initial Roach Population: " + rp.getPopulation() + "\n");
		
		for (int i = 0; i < 3; i++) {
			rp.breed();
			System.out.println("Population after breeding: " + rp.getPopulation());
			rp.spray(10);
			System.out.println("Population after spraying: " + rp.getPopulation() + "\n");
		}
		
	}
}
