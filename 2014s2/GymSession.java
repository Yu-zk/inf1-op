import java.util.HashMap;
public class GymSession extends ExerciseSession {
	private HashMap<String,Length> machines;

	public GymSession(String type, String place) {
		super(type, place);
		machines= new HashMap<String,Length>(8);
		// TODO Auto-generated constructor stub
	}
	public void addMachine(String name,Length l) {
		machines.put(name, l);
	}
	public String toString() {
		String s="";
		s=s+super.toString()+"\n";
		s=s+"Machines:\n";
		for (String i:machines.keySet()) {
			s=s+String.format("%s %s\n", i,machines.get(i).toString());
		}
		return s;
	}

}
