import org.junit.Before;
import org.junit.Test;

public class RabbitTest {

	private Rabbit r;

	@Before
	public void setUp() {
		r = new Rabbit(2);
		r.init();
	}
	
	@Test
	public void testToString() {
		String s = r.toString();
	}

	@Test
	public void testSubsequenceIndex() {
		Integer[] target = { 1 };
		int i = r.subsequenceIndex(target);
	}

	@Test
	public void testMain() {
		String[] args = { "2" };
		Rabbit.main(args);
	}
}
