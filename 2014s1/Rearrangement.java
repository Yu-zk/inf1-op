import java.util.Arrays;

public class Rearrangement {
	public static int dotWith(int[] a, int[] b) {
		int r=0;
		if (a.length==b.length) {
			for (int i=0;i<a.length;i++) {
				r=r+a[i]*b[i];
			}
		}else {
			r=0;
		}
		return r;
	}
	
	public static void rotate(int[] b) {
		int[] temp=new int[b.length];
		for (int i=0;i<b.length-1;i++) {
			temp[i+1]=b[i];
		}
		temp[0]=b[b.length-1];
		for (int i=0;i<b.length;i++) {
			b[i]=temp[i];
		}
	}
	public static int useRotations(int[] a, int[] b) {
		int max=0;
		for (int i=0;i<a.length;i++) {
			if (max<dotWith(a,b)) max=dotWith(a,b);
			rotate(b);
		}
		return max;
	}
	public static int useSorted(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		return useRotations(a,b);
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] imput=new int[2*n+1];
		for (int i=0;i<2*n+1;i++) {
			imput[i]=Integer.parseInt(args[i]);
		}
		int[] a=Arrays.copyOfRange(imput, 1, n+1);
		int[] b=Arrays.copyOfRange(imput, n+1, 2*n+1);
		System.out.printf("dotWith gave: %d\n",dotWith(a,b));
		System.out.printf("useRotations gave: %d\n",useRotations(a,b));
		System.out.printf("useSorted gave: %d\n",useSorted(a,b));
	}

}
