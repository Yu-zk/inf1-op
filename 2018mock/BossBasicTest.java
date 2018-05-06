import org.junit.Before;
import org.junit.Test;

public class BossBasicTest {

    private Boss b;

    @Before
    public void setUp() {
        b = new Boss(500, 50);
    }

	@Test
    public void testConstructor() {
        Boss bossMonster = new Boss(500, 50);
    }

    @Test
	public void testTakeDamage() {
        b.takeDamage(10);
	}

    @Test
	public void testToString() {
        String output = b.toString();
	}

}
