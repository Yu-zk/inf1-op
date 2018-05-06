
public class Customer {
	
	private String name;
	private String id;
	
	public Customer(String n) {
		name = n; //may need to set id too, not decided yet
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "BOO!"+name;  // May change to give id too, depends on later decision
	}

}
