import java.util.ArrayList;
import java.util.Arrays;

public class Entropy {
	public static int[] charCount(String s) {
		if (s.equals(null)||s.length()==0) {
			return null;
		}
		char[] c=s.toCharArray();
		Arrays.sort(c);
		ArrayList<Integer> a=new ArrayList<Integer>();
		int t=1;
		for (int i=0;i<c.length-1;i++) {
			if (c[i]==c[i+1]) {
				t++;
			}else {
				a.add(t);
				t=1;
			}
		}
		a.add(t);
		int[]r=new int[a.size()];
		for(int i=0;i<a.size();i++) {
			r[i]=a.get(i);
		}
		return r;
	}
	public static double[] normalise(int[] c) {
		if (c==null) return null;
		if (c.length==0) return null;
		int sum=0;
		for (int i:c) {
			sum=sum+i;
		}
		double[]r=new double[c.length];
		for(int i=0;i<r.length;i++) {
			r[i]=1.0*c[i]/sum;
		}
		return r;
	}
	public static double entropyOf(double[] p) {
		 double s=0;
		 for (double i:p) {
			 s=s-i*Math.log(i);
		 }
		 return s;
	}
	public static boolean contains(String[] a,int n,char c) {
		boolean b=true;
		for (int i=0;i<a.length;i++) {
			if (i!=n) {
				for(char j:a[i].toCharArray()) {
					if (j==c) return false;
				}
			}
		}
		return true;
	}
	public static int[][] charCountArray(String[] a){
		String[]s=new String[a.length];
		for(int i=0;i<s.length;i++) {
			s[i]="";
			for(char j:a[i].toCharArray()) {
				if(contains(a,i,j)) {
					s[i]=s[i]+j;
				}
			}
		}
		int[][]r=new int[a.length][];
		for (int i=0;i<a.length;i++) {
			r[i]=charCount(s[i]);
		}
		return r;	
	}
	
	
	public static void main(String[] args) {
		String s1=args[0];
		String s2=args[1];
		
		System.out.println(String.format("Character Probabilities in %s : %s",
				s1,Arrays.toString(normalise(charCount(s1)))));
		System.out.println(String.format("Entropy of %s : %f", 
				s1,entropyOf(normalise(charCount(s1)))));
		System.out.println(String.format("Entropy of %s : %f", 
				s2,entropyOf(normalise(charCount(s2)))));
		String[] s= {s1,s2};
		int[][] a=charCountArray(s);
		System.out.println(String.format("Entropy of unique chars in %s : %f", 
				s1,entropyOf(normalise(a[0]))));
		System.out.println(String.format("Entropy of unique chars in %s : %f", 
				s2,entropyOf(normalise(a[1]))));
	}

}
