import java.util.ArrayList;

public class Question1 {
	public static ArrayList<Integer>  cayley() {
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (int i=1;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (i*j+i+j==10*i+j) a.add(10*i+j);
			}
		}
		return a;
	}
	public static int[] countVowels(String[] s) {
		int sum=0;
		int[] r=new int[s.length];
		//String v="aeiouAEIOU";
		for (int i=0;i<s.length;i++) {
			sum=0;
			for (int j=0;j<s[i].length();j++) {
				if (s[i].charAt(j)=='a') sum++;
				if (s[i].charAt(j)=='A') sum++;
				if (s[i].charAt(j)=='e') sum++;
				if (s[i].charAt(j)=='E') sum++;
				if (s[i].charAt(j)=='i') sum++;
				if (s[i].charAt(j)=='I') sum++;
				if (s[i].charAt(j)=='o') sum++;
				if (s[i].charAt(j)=='O') sum++;
				if (s[i].charAt(j)=='u') sum++;
				if (s[i].charAt(j)=='U') sum++;
			}
			r[i]=sum;
			
		}
		return r;
		
	}
	
	public static String mostVowels(String[] s) {
		int[] a = countVowels(s);
		int max=0;
		int t=0;
		for (int i=0;i<a.length ;i++) {
			if (a[i]>max) {
				max=a[i];
				t=i;
			}
		}
		return s[t];
	}

	public static void main(String[] args) {
		System.out.println(cayley());
		String[] a= args;
		int[] m=countVowels(a);
		System.out.print("[");
		for (int i=0;i<m.length-1;i++) {
			System.out.print(m[i]+", ");
		}
		System.out.println(m[m.length-1]+"]");
		System.out.println(mostVowels(a));

	}

}
