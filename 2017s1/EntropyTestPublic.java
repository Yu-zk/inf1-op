import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EntropyTestPublic { 
	@Test 
	public void testCharCount() {
		int [] c = Entropy.charCount("Hello");
	}
	@Test 
	public void testCharCountArray() {
		int [][] c = Entropy.charCountArray(new String[] { "Hello", "there" });
	}
	@Test 
	public void testNormalise() {
		double [] p = Entropy.normalise(new int[] {1});
	}
	@Test 
	public void testEntropy() {
		double e = Entropy.entropyOf(new double[] { 0.5, 0.5 });
	}
	@Test
	public void testMain() {
		String[] inputs = {"hello","there"};
		Entropy.main(inputs);
	}
}