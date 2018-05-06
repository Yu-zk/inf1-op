
public class UG5Student extends Student{

	private int extraLevel9s;
	public UG5Student(String n, String u, int y) {
		super(n,u,5);
		this.extraLevel9s=y;
	}
	public UG5Student() {
		this("not set","not set",0);
	}
	public int level9s() {
		int r=0;
		for (Course c:super.getCourses()) {
			if (c.getLevel()==9) r++;
		}
		return (r);
	}
	
	
	public boolean addCourse(Course c) {
		if (getCourses().length>=this.extraLevel9s+1) {
			return false;
		}
		return super.addCourse(c);
		
	}
	public String toString() {
		String s="";
		s=s+super.toString()+"\n";
		if (super.getCourses().length>1) {
			s=s+String.format("Taking extra level 9s. Permission for %d extra.\n", this.extraLevel9s);
		}
		for (Course c:super.getCourses()) {
			s=s+c.getName()+"\n";
		}
		s.trim();
		return s;
	}
}

