import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Question1Test {

	@Test
	public void testCayley() {
		ArrayList<Integer> answer = Question1.cayley();
	}

	@Test
	public void testCountVowels() {
		String[] inputs = {"HELLO","world"};
		int[] outputs = Question1.countVowels(inputs);
	}

	@Test
	public void testMostVowels() {
		String[] inputs = {"HELLO","world"};
		String answer = Question1.mostVowels(inputs);
	}

	@Test
	public void testMain() {
		String[] inputs = {"HELLO","world"};
		Question1.main(inputs);
	}

}
