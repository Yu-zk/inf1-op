import org.junit.Before;
import org.junit.Test;

public class LucasTest {

	@Before
	public void setup() {
		Lucas.upto(2);
	}
	
	@Test
	public void testUpto() {
		Lucas.upto(2);
	}

	@Test
	public void testPrimes() {
		Lucas.primes();
	}

	@Test
	public void testMaxDiffClosedForm() {
		double d = Lucas.maxDiffClosedForm();
	}

	@Test
	public void testMain() {
		String[] args = { "2" };
		Lucas.main(args);
	}
}
