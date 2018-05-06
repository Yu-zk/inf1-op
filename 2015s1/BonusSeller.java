import java.util.HashMap;

public class BonusSeller extends Seller{
	private HashMap<String ,Double> sales=new HashMap<String,Double>(10);
	public BonusSeller(String n) {
		super(n);
		
	}
	public void sale(String name,double d) {
		super.sale(d);
//		d=super.getWeightSold();
		if (sales.containsKey(name)) {
			d =sales.get(name)+d;
			sales.put(name, d);
		}else {
			sales.put(name, d);
		}
	}
	public String toString() {
		String s=super.toString();
		s=s+"\n";
		s=s+"Sales per customer:\n";
		for (String i:sales.keySet()) {
			s=s+String.format("%s:%dkg\n", i,(int)(Math.round(sales.get(i))));
		}
		return s;
		
	}
	public int calculateBonus() {
		int sum=0;
		for (String i:sales.keySet()) {
			if (sales.get(i)>=20) sum++;
		}
		if (sum<5) return 0;
		if (sum<10) return 5;
		return 7;
	}

}
