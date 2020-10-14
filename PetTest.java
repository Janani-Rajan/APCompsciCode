//Janani Rajan, 9/15/2020
import java.util.Scanner;

public class PetTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Pet pet = new Pet();
		System.out.println("Enter Pet Name: ");
		String nameinput = input.nextLine();
		pet.setName(nameinput);
		System.out.println("Enter 1 if your pet is a Dog, 2 if it is a Cat, and 3 if it is a bird.");
		int typeinput = input.nextInt();
		String t = "";
		switch (typeinput) {
		case 1:
			t = "Dog";
			break;
		case 2:
			t = "Cat";
			break;
		case 3:
			t = "Bird";
			break;
		}
		pet.setType(t);
		System.out.println("Enter Pet Age: ");
		int ageinput = input.nextInt();
		pet.setAge(ageinput);
		
		System.out.println("PET INFORMATION");
		System.out.println("Age: " + pet.getAge());
		System.out.println("Type: " + pet.getType());
		System.out.println("Name: " + pet.getName());
		
	}

}
