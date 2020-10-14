//Janani Rajan, 9/15/2020
public class Pet {
	private String name;
	private String type;
	private int age;
	
	public Pet() {
		name = "";
		type = "";
		age = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public void setType(String s) {
		type = s;
	}
	
	public void setAge(int i) {
		age = i;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\n Type: " + type + "\n Age: " + age;
	}
}

