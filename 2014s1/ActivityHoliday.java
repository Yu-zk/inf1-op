import java.util.HashMap;

public class ActivityHoliday extends Holiday{
	private HashMap<String,Cost> activities =new HashMap<String,Cost>(10);
	public ActivityHoliday(String destination, int days) {
		super(destination,days);
	}
	public void addActivity(String name, Cost c) {
		activities.put(name, c);
	}

	public String toString() {
		String s=String.format("%s (%d)\nActivities:\n"
				, getDestination(),getDays());
		for (String des: activities.keySet()) {
			s=s+des+" "+activities.get(des).toString()+"\n";
		}
		return(s);
	}

}
