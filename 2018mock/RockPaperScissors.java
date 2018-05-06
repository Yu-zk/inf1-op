import java.util.Map;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class RockPaperScissors {

    /**
     * Returns if a given symbol is a valid symbol for the
     * game.
     * @param symbol the symbol to be checked
     * @return true if the given symbol is valid, false otherwise
     */
    public static boolean isValidSymbol(char symbol) {
        return symbol == 'R' || symbol == 'P' || symbol == 'S';
    }

    public static List<Matchup> parseMatchups(String[] args) {
        // IMPLEMENT ME
//    	MatchUp m=new MatchUp()
    	ArrayList<Matchup> a=new ArrayList<Matchup>();
    	for (String s:args) {
    		if (s.length()==2&&isValidSymbol(s.charAt(0))&&isValidSymbol(s.charAt(1))) {
    			a.add(new Matchup(s.charAt(0),s.charAt(1)));
    		}
    	}
        return a;
    }

    /**
     * Returns the outcome of a given matchup as String.
     *
     * @param match The matchup to be decided.
     * @return a String representation of the matchup result; R, P, S or DRAW
     * @throws IllegalArgumentException if the given matchup parameter is null
     */
    public static String decideOutcome(Matchup match) {
        if(match == null)
            throw new IllegalArgumentException("Given match must not be null!");

        String res = "" + match.getPlayerOne() + match.getPlayerTwo();

        if (res.equals("RP") || res.equals("PR")) return "P";
        if (res.equals("RS") || res.equals("SR")) return "R";
        if (res.equals("PS") || res.equals("SP")) return "S";

        return "DRAW";
    }

    public static Map<String, Integer> countOutcomes(List<Matchup> matches) {
        // IMPLEMENT ME
    	Hashtable<String,Integer> h=new Hashtable<String,Integer>();
    	for (Matchup m:matches) {
    		if (h.containsKey(decideOutcome(m))) {
    			int a=h.get(decideOutcome(m))+1;
    			h.put(decideOutcome(m), a);
    		}else {
    			h.put(decideOutcome(m), 1);
    		}
    	}
    	int max=0;
    	String l="";
    	for (String s:h.keySet()) {
    		if (h.get(s)>max) {
    			max=h.get(s);
    			l=s;
    		}
    	}
    	if (h.size()>0) {
    		System.out.println(String.format("Most outcomes: %s", l));
    	}
        return h;
    } 

    /**
     * Executes different functionality for the game RockPaperScissors.
     *
     * @param args A series of matchups encoded as pairs of single characters.
     * The series of matchups can be empty.
     */
    public static void main(String[] args) {
        List<Matchup> matches = parseMatchups(args);
        System.out.println(matches);
    
        if(matches != null) {
            System.out.println(matches.size() + " matches parsed.");

            System.out.println("\nCount outcomes per symbol...");
            Map<String, Integer> outcomesPerSymbol = countOutcomes(matches);
            System.out.println(outcomesPerSymbol);
        }
        
//    	System.out.println(countOutcomes( parseMatchups(new String[] {"PgtP", "SS", "RS", "PR", "SP", "RR"})));
        
        
    }

}
