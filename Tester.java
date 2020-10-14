public class Tester {
	
	public static void main(String [] args) {
		FuelTracker ft = new FuelTracker();
		System.out.println("Default values: " + ft.toString());
		System.out.println("Fuel Amount: " + ft.getFuel() + " gallons");
		System.out.println("Fuel Efficiency: " + ft.getFuelEfficiency() + "miles per gallon");
		
		ft = new FuelTracker(15, 15.5);
		System.out.println("AFTER VALUE CHANGE: " + ft.toString());
		System.out.println("Fuel Amount: " + ft.getFuel() + " gallons");
		System.out.println("Fuel Efficiency: " + ft.getFuelEfficiency() + "miles per gallon");
		
		ft.drive(30);
		System.out.println( "AFTER DRIVING 30 MILES: " + ft.toString());
		System.out.println("Fuel Amount: " + ft.getFuel() + " gallons");
		System.out.println("Fuel Efficiency: " + ft.getFuelEfficiency() + "miles per gallon");
		
		ft.addFuel(5.5);
		System.out.println( "AFTER FILLING UP TANK: " + ft.toString());
		System.out.println("Fuel Amount: " + ft.getFuel() + " gallons");
		System.out.println("Fuel Efficiency: " + ft.getFuelEfficiency() + "miles per gallon");
	}
}
