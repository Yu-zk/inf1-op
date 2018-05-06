import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;


public class AdvancedTutorialTest {
	
	private AdvancedTutorial a;

	@Before
	public void setUp() {
		a = new AdvancedTutorial("Loops", "John", "11am");
	}

	@Test
	public void testToString() {
		String s = a.toString();
	}

	@Test
	public void testCouldCombineWith() {
		AdvancedTutorial t = new AdvancedTutorial("Loops", "Jane", "11am");
		boolean b = a.couldCombineWith(t);
	}

	@Test
	public void testConstruct() {
		String[] s = {"Loops","John","11am"};
		HashMap<String, ArrayList<AdvancedTutorial>> m = AdvancedTutorial.construct(s);
	}

	@Test
	public void testMain() {
		String[] s = {"Arrays", "Jane", "10am", "Loops", "John", "11am"};
		AdvancedTutorial.main(s);
	}

}
