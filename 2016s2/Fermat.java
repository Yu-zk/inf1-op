import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Fermat {
	public static Set<ArrayList<String>> threadings(int n, Set<String> s) {
		if (n<1) {
			Set<ArrayList<String>> r=new HashSet<ArrayList<String>>();
			r.add(new ArrayList<String>());
			return r;
		}else {
			Set<ArrayList<String>> in=threadings(n-1,s);
			Set<ArrayList<String>> r=new HashSet<ArrayList<String>>();
			for (ArrayList<String> a:in) {
				for (String j:s) {
					ArrayList<String> aa=new ArrayList<String>();
					aa.addAll(a);
					aa.add(j);
					r.add(aa);
				}
			}
			return r;
		}
		
	}
	public static boolean isEquiv(ArrayList<String> a, ArrayList<String> b) {
		for (int i=0;i<a.size();i++) {
//			String s="";
//			s=a.get(0);
//			for (int j=0;j<a.size()-1;j++) {
//				a.add(j,a.get(j+1));
//			}
//			a.add(a.size()-1,s);
//			if (a.equals(b)) return true;
			ArrayList<String> c=new ArrayList<String>();
			for (int j=1;j<a.size();j++) {
				c.add(a.get(j));
			}
			c.add(a.get(0));
			if (a.equals(b)) return true;
			a=c;
		}
		
		//rotate
		ArrayList<String> d=new ArrayList<String>();
		for (int i=0;i<a.size();i++) {
			d.add(a.get(a.size()-i-1));
		}
		a=d;
		//System.out.println(a);
		for (int i=0;i<a.size();i++) {
			ArrayList<String> c=new ArrayList<String>();
			for (int j=1;j<a.size();j++) {
				c.add(a.get(j));
			}
			c.add(a.get(0));
			if (a.equals(b)) return true;
			a=c;
		}
		
		
		return false;
	}
	public static void analyse(Set<ArrayList<String>> s) {
		for (ArrayList<String> a:s) {
			int n=0;
			for (ArrayList<String> b:s) {
				if (isEquiv(a,b)) n++;
			}
			if (n==1) {
				System.out.println(a+" is a singleton");
			}
		}
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		HashSet<String> h=new HashSet<String>(0);
		for (int i=1;i<args.length;i++) {
			h.add(args[i]);
		}

		analyse(threadings(n,h));
		
	}
}
