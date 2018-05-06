import org.junit.Before;
import org.junit.Test;

public class BonusSellerTest {

	private BonusSeller b;

	@Before
	public void setUp() {
		b = new BonusSeller("Perdita Stevens");
	}

	@Test
	public void testSale() {
		b.sale("Ian Stark", 45.09);
	}

	@Test
	public void testToString() {
		String s = b.toString();
	}

	@Test
	public void testCalculateBonus() {
		int bonus = b.calculateBonus();
	}

}
