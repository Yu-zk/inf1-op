import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentTestPublic {

	
	private Student s1;
	private Course c1, c2, c3, c4;
	private ArrayList<Course> completed;
	private ArrayList<Course> active;
	
	
	@org.junit.Before
	public void setup(){

		completed = new ArrayList<>();
		active = new ArrayList<>();
		
		c1 = new Course("Introduction to Logic", new ArrayList<>());
		c2 = new Course("Python", new ArrayList<>());
		
		ArrayList<String> prerequisite1 = new ArrayList<>();
		prerequisite1.add(c1.getName());
		c3 = new Course("Advanced Logic", prerequisite1);
		
		ArrayList<String> prerequisite2 = new ArrayList<>();
		prerequisite2.add(c1.getName());
		prerequisite2.add(c2.getName());
		prerequisite2.add(c3.getName());
		
		c4 = new Course("Video games design", prerequisite2);
		
		completed.add(c1);
		active.add(c2);
		
		s1 = new Student("John", "Doe", active, completed, 3);
	}
	


	@org.junit.Test 
	public void testcanEnroll() {
		boolean b1 = s1.canEnroll(c2);

	}

	@org.junit.Test 
	public void testEnroll() {
		boolean b1 = s1.enroll(c2);
		
	}
	
	@org.junit.Test 
	public void testComplete() {
		boolean b1 = s1.complete("Video games design"); // CHANGED IT.
	}

	@org.junit.Test 
	public void testGetAllCourses() {
		
		HashMap<Course,String> result = s1.getAllCourses();
		
		
	}
	
	@org.junit.Test 
	public void testSummary() {
		String result = s1.summary();
		
		
	}
	
	
}
