public class Rabbit {
	private Integer[][] r; //integer.max
	private int n;
	public Rabbit(int n) {
		this.n=n;
		r=new Integer[n][];
	}
	public void init() {
		if (n>=2) {
			r=new Integer[n][];
		}else return;
		int[] a=new int[n];
		a[0]=1;
		a[1]=2;
		for (int i=2;i<n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		for (int i=0;i<n;i++) {
			r[i]=new Integer[a[i]];
		}
		
		r[0][0]=1;
		r[1][0]=1;
		r[1][1]=0;
		
		for (int i=2;i<n;i++) {
			for (int j=0;j<a[i-1];j++) {
				r[i][j]=r[i-1][j];
			}
			for (int j=0;j<a[i-2];j++) {
				r[i][a[i-1]+j]=r[i-2][j];
			}
		}
	}
	public String toString() {
		String s="";
		for (Integer[] i:r) {
			s=s+"[";
			for (int j=0;j<i.length-1;j++) {
				s=s+String.format("%d, ",i[j]);
			}
			s=s+String.format("%d]\n", i[i.length-1]);
		}
		return s;
	}
	public int subsequenceIndex(Integer[] target) {
		boolean b=true;
		if (n==0) return -1;
		if (target.length==0) return -1;
		if (r[n-1].length<target.length) return -1;
		for (int i=0;i<r[n-1].length-target.length;i++) {
			b=true;
			for (int j=0;j<target.length;j++) {
				b=b&&(r[n-1][i+j]==target[j]) ;
			}
			if (b) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		Rabbit r=new Rabbit(a);
		r.init();
		System.out.print(r.toString());
		System.out.println(r.subsequenceIndex(new Integer[] {1,1,0}));
		System.out.println(r.subsequenceIndex(new Integer[] {1,1,1}));
	}
}
