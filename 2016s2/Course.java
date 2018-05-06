
public class Course {
	private String name;
	private char schedule; 
	private int level;
	public Course (String n, char s, int l) {
		name=n; schedule=s;level=l;
	}
	// default to the most important course in the university
	public Course () {
		this("Informatics 1 Object Oriented Programming", 'O', 8);
	}
	public String getName() {
		return name;
	}
	public char getSchedule() {
		return schedule;
	}
	public int getLevel() {
		return level;
	}
}
