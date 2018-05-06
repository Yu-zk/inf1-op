import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PremiumCustomerTest {

	private PremiumCustomer p;

	@Before
	public void setUp() {
		Map<String, String> m = new HashMap<String,String>();
		p = new PremiumCustomer("Perdita Stevens", m);
	}

	@Test
	public void testGiftsFrom() {
		p.giftsFrom("printer cartridge", 3);
	}

	@Test
	public void testToString() {
		String s = p.toString();
	}

	@Test
	public void testChocolateGifts() {
		int choccies = p.chocolateGifts();
	}

}
