import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.ArrayList;
import org.junit.Before;


public class FruitySmartPhoneTestPublic { 
	private FruitySmartPhone r1;
	private App a1;
	private HashMap<String,Integer> hm1;
	@Before
	public void testConstructor() {
		r1 = new FruitySmartPhone("Hello", 5, 10);
		a1 = new App("Camera",1,2);
	}
	@Test
	public void testInstallApp() {
		a1 = new App("Camera",1,2);
		boolean b = r1.installApp(a1);
	}	
	@Test
	public void testUninstallApp() {
		a1 = new App("Camera",1,2);
		boolean b = r1.uninstallApp(a1);
	}	
	@Test
	public void testUseApp() {
		boolean b = r1.useApp("Camera");
	}	
	@Test
	public void testGetInstalledApps() {
		ArrayList<String> s = r1.getInstalledApps();
	}		
}