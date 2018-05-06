import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<String> prerequisiteCourses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public ArrayList<String> getPrerequisiteCourses() {
		return prerequisiteCourses;
	}

	public void setPrerequisiteCourses(ArrayList<String> prerequisiteCourses) {
		this.prerequisiteCourses = prerequisiteCourses;
	}

	public Course(String name, ArrayList<String> prerequisiteCourses) {
		super();
		this.name = name;
		this.prerequisiteCourses = prerequisiteCourses;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", prerequisiteCourses=" + prerequisiteCourses + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	

}
