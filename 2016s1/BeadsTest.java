import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class BeadsTest {

	@Test
	public void testAllSums() {
		ArrayList<Integer> arg = new ArrayList<Integer>();
		arg.add(3);
		Set<Integer> s = Beads.allSums(arg);
	}

	@Test
	public void testSums() {
		ArrayList<Integer> arg = new ArrayList<Integer>();
		arg.add(3);
		Set<Integer> s = Beads.sums(arg, 1);
	}

	@Test
	public void testFindMax() {
		Set<Integer> arg = new HashSet<Integer>();
		arg.add(3);
		int i = Beads.findMax(arg);
	}

	@Test
	public void testMain() {
		String[] inputs = {"6","1","3"};
		Beads.main(inputs);
	}

}
