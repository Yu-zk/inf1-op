import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DivergenceTestPublic { 
	@Test(timeout=1000)
		public void testCharCount() {
		int [] c = Divergence.charCount("hello");
	}
	@Test(timeout=1000)
	public void testCharCountArray() {
		int[][] p = Divergence.charCountArray(new String[] {"hello", "there"});
	}
	@Test(timeout=1000)
	public void testNormalise() {
		double [] p = Divergence.normalise(new int[] {1});
	}
	@Test(timeout=1000)
	public void testDivergence() {
		double d = Divergence.kld(new double[] { 0.5, 0.5 }, new double[] {0.5, 0.5});
	}
	@Test(timeout=1000)
	public void testMain() {
		String[] inputs = {"hello","there"};
		Divergence.main(inputs);
	}
}