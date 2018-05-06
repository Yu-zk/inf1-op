import java.util.ArrayList;
import java.util.Arrays;

public class Divergence {

	public static int[] charCount(String s) {
		if (s == null || s.length() == 0)
			return null;
		char[] c = s.toCharArray();
		Arrays.sort(c);
		int t = 1;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				t++;
			} else {
				a.add(t);
				t = 1;
			}
		}
		a.add(t);
		int[] r = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			r[i] = a.get(i);
		}
		return r;
	}

	public static double[] normalise(int[] c) {
		if (c == null || c.length == 0)
			return null;
		int sum = 0;
		for (int i : c) {
			sum = sum + i;
		}
		double[] r = new double[c.length];
		for (int i = 0; i < r.length; i++) {
			r[i] = 1.0 * c[i] / sum;
		}
		return r;
	}

	public static double kld(double[] p, double[] q) {
		// if (p==null||p.length==0) return 0;
		double sum = 0;
		for (int i = 0; i < p.length; i++) {
			sum = sum + 1.0 * p[i] * Math.log(1.0 * p[i] / q[i]);
		}
		return sum;
	}

	public static boolean isContain(String[] a, char c) {
		for (String i : a) {
			if (!i.contains("" + c))
				return false;
		}
		return true;
	}

	public static int[][] charCountArray(String a[]) {
		String[] b = new String[a.length];
		int n = 0;
		for (String i : a) {
			String s = "";
			for (char j : i.toCharArray()) {
				if (isContain(a, j))
					s = s + j;
			}
			b[n] = s;
			n++;
		}
		int[][] r = new int[a.length][];
		for (int i = 0; i < r.length; i++) {
			r[i] = charCount(b[i]);
		}
		return r;
	}

	public static void main(String[] args) {
		String[] s = { args[0], args[1] };
		System.out.println(String.format("Counting %s : %s", s[0], Arrays.toString(charCount(s[0]))));
		System.out.println(
				String.format("Symbol probabilities in %s : %s", s[0], Arrays.toString(normalise(charCount(s[0])))));
		System.out.println(
				String.format("Symbol probabilities in %s : %s", s[1], Arrays.toString(normalise(charCount(s[1])))));
		System.out.println(String.format("Shared Symbol Count : [%s, %s]", Arrays.toString(charCountArray(s)[0]),
				Arrays.toString(charCountArray(s)[1])));
		double[] a = normalise(charCountArray(s)[0]);
		double[] b = normalise(charCountArray(s)[1]);
		System.out.println(String.format("Divergence PQ : %s", kld(a, b)));
	}
}
