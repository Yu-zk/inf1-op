import org.junit.Before;
import org.junit.Test;

public class UG1StudentTest {

	private UG1Student u, u2;
	private Course c;

	@Before
	public void setUp() {
		u = new UG1Student("David Parnas", "s0000000", 'O');
		u2 = new UG1Student();
		c = new Course();
	}

	@Test
	public void testToString() {
		String s = u.toString();
	}

	@Test
	public void testAddCourse() {
		boolean b = u.addCourse(c);
	}

	@Test
	public void testAddCourses() {
		Course cs[] = { c };
		boolean b = u.addCourses(cs);
	}

}
