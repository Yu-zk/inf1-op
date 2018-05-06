
public class Seller {
	private double weightSold = 0;
	private String name;
  protected boolean saleCalled = false;

	public Seller() {
		this("");
	}
	
	public Seller(String n) {
		name = n;
	}

	public double getWeightSold() {
		return weightSold;
	}

	public void sale (double d) {
		weightSold += d;
		saleCalled = true;
	}

	public String toString() {
		return "BOO!"+name; // May change to give total weight sold too, depends on customer decision
	}
}
