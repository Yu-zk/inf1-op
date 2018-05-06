import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.ArrayList;
import org.junit.Before;


public class SnowSquirrelBrowserTestPublic { 
	private SnowSquirrelBrowser r1;
	private Plugin a1;
	private HashMap<String,Double> hm1;
	@Before
	public void testConstructor() {
		r1 = new SnowSquirrelBrowser("Hello", 10.0, "V1");
		a1 = new Plugin("Camera",1.0,"V1");
	}
	@Test
	public void testInstallApp() {
		a1 = new Plugin("Camera",1.0,"V1");
		boolean b = r1.installPlugin(a1);
	}	
	@Test
	public void testUninstallApp() {
		a1 = new Plugin("Camera",1.0,"V1");
		boolean b = r1.uninstallPlugin(a1);
	}	
	@Test
	public void testUseApp() {
		boolean b = r1.usePlugin("Camera");
	}	
	@Test
	public void testGetInstalledPlugins() {
		ArrayList<String> s = r1.getInstalledPlugins();
	}		
}