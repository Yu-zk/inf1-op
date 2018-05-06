import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Beads {
	public static Set<Integer> sums(ArrayList<Integer> a,int n){
		Set<Integer> s= new HashSet<Integer>();
		if (a.size()==0||n<1) {
			return s;
		}
		int sum=0;
		for (int i=0;i<a.size();i++) {
			for (int j=0;j<n;j++) {
				sum=sum+a.get((i+j)%a.size());
			}
			s.add(sum);
			sum=0;
		}
		return s;
	}
	public static Set<Integer> allSums(ArrayList<Integer> a){
		Set<Integer> s=new HashSet<Integer>();
		int sum=0;
		for (int i=1;i<=a.size();i++) {
			s.addAll(sums(a,i));
		}
		return s;
	}
	public static int findMax(Set<Integer> s) {
		int m=1;
		while (s.contains(m)) {
			m++;
		}
		return m-1;
	}
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (String s:args) {
			a.add(Integer.parseInt(s));
		}
		System.out.println(findMax(allSums(a)));
		
	}

}
