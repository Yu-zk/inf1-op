import java.util.Arrays;

public class Inequalities {

	public static int dotProduct(int[] a, int[] b) {
		if (!(a.length==b.length)) return 0;
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i]*b[i];
		}
		return sum;
	}
	
	public static int[] concatenate (int[] a, int[] b) {
//		Arrays.sort(a);
//		Arrays.sort(b);
		int[] c=new int[a.length+b.length];
		for (int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		int j=0;
		for (int i=a.length;i<c.length;i++) {
			c[i]=b[j];
			j++;
		}
		return c;
	}
	public static boolean cs(int[] a, int[] b) {
		int lhs=(int) Math.pow(dotProduct(a,b), 2);
		int rhs=dotProduct(a,a)*dotProduct(b,b);
		if ((a.length==b.length)&&(lhs<=rhs)){
			return true;
		}
		return false;
		
	}
	public static boolean amgm(int[] a) {
		int sum=0;
		for (int i:a) {
			sum=sum+i;
		}
		double am=1.0*sum/a.length;
		int product=1;
		for (int i:a) {
			product=product*i;
		}
		double gm=Math.pow(product, 1.0/a.length);
		return (am>=gm);
	}
	
	public static void main (String[] args) {
		int n=Integer.parseInt(args[0]);
		int[]a=new int[n];
		int[]b=new int[n];
		int j=1;
		for (int i=0;i<n;i++) {
			a[i]=Integer.parseInt(args[j]);
			j++;
		}
		for (int i=0;i<n;i++) {
			b[i]=Integer.parseInt(args[j]);
			j++;
		}
		System.out.println("CS held: "+cs(a,b));
		System.out.println("AMGM held: "+amgm(concatenate(a,b)));
//		int[] a1 = new int[] {77, 6};
//		int[] b1 = new int[] {};
//		int[]cc=concatenate(a1, b1);
//		System.out.println(Arrays.toString(cc));
	}
}
