//Janani Rajan, 9/17/2020
public class TestPersonalInfo {
	public static void main(String [] args) {
		PersonalInformation a = new PersonalInformation();
		PersonalInformation b = new PersonalInformation();
		PersonalInformation c = new PersonalInformation();
		
		a.setName("Janani Rajan");
		a.setAddress("1 Blah Lane, West Windsor NJ, 08550");
		a.setAge(15);
		a.setPhoneNumber("(123)456-7890");
		
		b.setName("Joe shmoe");
		b.setAddress("2333 Blah Lane, West Windsor NJ, 08550");
		b.setAge(25);
		b.setPhoneNumber("(987)654-3210");
		
		c.setName("Bloooobfish");
		c.setAddress("111 No U Drive, Plainsboro NJ, 22222");
		c.setAge(112);
		c.setPhoneNumber("(321)654-0987");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
}
