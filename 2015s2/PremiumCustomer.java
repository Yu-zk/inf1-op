import java.util.Map;

public class PremiumCustomer extends Customer{
	private Map<String,String> freeGifts;

	public PremiumCustomer(String n,Map<String,String> m) {
		super(n);
		this.freeGifts=m;
	}
	public void giftsFrom(String s,int q) {
		if (s==null) return;
		if (this.freeGifts.containsKey(s)) {
			System.out.println(String.format("%s x %d", 
					this.freeGifts.get(s),q));
		}
	}
	public String toString() {
		String s="";
		s=s+super.toString()+"\n";
		s=s+"Free gifts:\n";
		for (String i:this.freeGifts.keySet()) {
			s=s+String.format("%s on ordering %s\n",
					this.freeGifts.get(i),i);
		}
		s.trim();
		return s;
	}
	public int chocolateGifts() {
		int r=0;
		for (String i:this.freeGifts.keySet()) {
			if (this.freeGifts.get(i).contains("chocolate")) r++;
		}
		return r;
	}

}
