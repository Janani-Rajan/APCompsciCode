//Janani Rajan, 9/17/2020
public class PersonalInformation {
	
	private String name;
	private String address;
	private int age;
	private String phone;
	
	public PersonalInformation() {
		name = "";
		address = "";
		age = 0;
		phone = "";
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phone;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public void setAddress(String s) {
		address = s;
	}
	
	public void setAge(int i) {
		age = i;
	}
	
	public void setPhoneNumber(String s) {
		phone = s;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\n Address: " + address + "\n Age: " + age + "\n Phone: " + phone;
	}
}
