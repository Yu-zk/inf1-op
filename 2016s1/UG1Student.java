public class UG1Student extends Student{
	private char mainSchedule;
	public UG1Student(String name,String uun,char mainSchedule) {
		super(name,uun,1);
		this.mainSchedule=mainSchedule;
	}
	public UG1Student() {
		this("not set","not set",'X');
	}
	public boolean addCourse(Course c) {
		if ((c.getLevel()==7)||(c.getLevel()==8)) {
			return super.addCourse(c);
		}
		return false;
	}
	public boolean addCourses(Course[] c) {
		int b=0;
		for (Course i:c) {
			if (!addCourse(i)) b++;
		}
		if (b==0) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		String s="";
		s=s+super.toString()+"\n";
		s=s+String.format("Main schedule %s courses:\n",mainSchedule);
		for (Course c:super.getCourses()) {
			if (c.getSchedule()==this.mainSchedule)
				s=s+c.getName()+"\n";
		}
		s.trim();
		return s;
	}
//	public static void main(String[] args) {
//		UG1Student ug=new UG1Student("shabi","caonima",'X');
//		Course c=new Course();
//		ug.addCourse(c);
//		ug.addCourse(c);
//		System.out.println(ug.toString());
//	}

}
