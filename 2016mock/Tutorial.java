
public class Tutorial {
	private String tutor;//do we need getter? Ask customer
	private String time;

	public Tutorial (String tu, String ti) {
		tutor = tu;
		time = ti;
	}
	
	public String getTime() {
		return time;
	}

	public String toString() {
	        return "Tutor: "+tutor+" Time: "+time;//placeholder: will change
	}

}
