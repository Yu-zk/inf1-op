import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class FermatTest {

	private ArrayList<String> redGreen;
	private ArrayList<String> greenRed;
	
	@Before
	public void setUp() {
		redGreen = new ArrayList<String>();
		redGreen.add("red");
		redGreen.add("green");
		greenRed = new ArrayList<String>();
		greenRed.add("green");
		greenRed.add("red");
	}
	
	@Test
	public void testThreadings() {
		Set<String> arg = new HashSet<String>();
		arg.add("red");
		Set<ArrayList<String>> s = Fermat.threadings(1, arg);
	}

	@Test
	public void testIsEquiv() {
		boolean b = Fermat.isEquiv(redGreen, greenRed);
	}

	@Test
	public void testAnalyse() {
		Set<ArrayList<String>> arg = new HashSet<ArrayList<String>>();
		arg.add(redGreen);
		arg.add(greenRed);
		Fermat.analyse(arg);
	}

	@Test
	public void testMain() {
		String[] inputs = {"1","red"};
		Fermat.main(inputs);
	}
}
