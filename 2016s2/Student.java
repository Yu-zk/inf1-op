import java.util.ArrayList;

public class Student {
	private String name;
	private String uun;
	private int year;
	
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student (String n, String u, int y) {
		name = n;
		uun = u;
		year = y;
	}

	public Student () {
		this ("not set", "not set",-1);
	}
	
	public boolean addCourse(Course c) {
		  courses.add(c);
		  // developer note: validation to be added later
		  return true;
	}

	public Course[] getCourses() {
		return courses.toArray(new Course[courses.size()]);
	}
	
	public String toString() {
		return name;//developer note: placeholder, will change
    }
}
