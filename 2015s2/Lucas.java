import java.util.Arrays;

public class Lucas {
	private static long[]lucas;
	private static double phiPlus=(Math.sqrt(5)+1)/2;
	private static double phiMinus=(Math.sqrt(5)-1)/2;
	public static void upto(int n) {
		if (n<2)return;
		lucas=new long[n];
		lucas[0]=2;
		lucas[1]=1;
		for (int i=2;i<n;i++) {
			lucas[i]=lucas[i-1]+lucas[i-2];
		}
		
	}
	public static boolean isPrime(long l) {
		if (l==1) return false;
		for (long i=2;i<(Math.round(Math.sqrt(l))+1);i++) {
			if (l%i==0) return false;
		}
		return true;
	}
	public static void primes() {
		for (int i=0;i<lucas.length;i++) {
			if (isPrime(lucas[i])){
				System.out.println(String.format("L(%d)=%d",
						i,lucas[i]));
			}
		}
	}
	public static double maxDiffClosedForm() {
		double[]l=new double[lucas.length];
		for (int i=0;i<lucas.length;i++) {
			l[i]=(Math.pow(phiPlus, i)+Math.pow(-phiMinus, i));
		}
		double max=0;
		for (int i=0;i<lucas.length;i++) {
//			System.out.println(l[i]);
			if (max<Math.abs(lucas[i]-l[i])) {
				max=Math.abs(lucas[i]-l[i]);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
//		upto(10);
//		primes();
		if (Integer.parseInt(args[0])>=2&&Integer.parseInt(args[0])<=42) {
			upto(Integer.parseInt(args[0]));
			primes();
			System.out.print(String.format("%.15f", maxDiffClosedForm()));
		}
	}
}
