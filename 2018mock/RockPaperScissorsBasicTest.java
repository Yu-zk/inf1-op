import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class RockPaperScissorsBasicTest {

    @Test
    public void isValidSymbolTest() {
        boolean result = RockPaperScissors.isValidSymbol('A');
    }

    @Test
    public void parseMatchupsTest() {
        List<Matchup> result = RockPaperScissors.parseMatchups(new String[0]);
    }

    @Test
    public void decideOutcomeTest() {
        String result = RockPaperScissors.decideOutcome(new Matchup('R', 'P')); 
    }
    
    @Test
    public void countOutcomesTest() {
	List<Matchup> input = new ArrayList<Matchup>();
        Map<String, Integer> result = RockPaperScissors.countOutcomes(input);
    }
}
