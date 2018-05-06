import java.util.ArrayList;
import java.util.HashMap;

public class SnowSquirrelBrowser extends Browser{
	private HashMap	<String,Double> installedPlugins=new HashMap<String,Double>();
	private String version;
	private double availableQuota;
	
	public String getVersion() {
		return this.version;
	}
	public double getQuota()
	{
		return this.availableQuota;
	}

	public SnowSquirrelBrowser(String o,double q,String v) {
		super(o);
		this.availableQuota=q;
		this.version=v;
	}
	public boolean installPlugin(Plugin p) {
		if (this.installedPlugins.containsKey(p.getName())) return false;
		if (p.getQuotaReq()>this.availableQuota) return false;
		if (!p.getVersionReq().equals(this.version)) return false;
		this.installedPlugins.put(p.getName(), p.getQuotaReq());
		this.availableQuota=this.availableQuota-p.getQuotaReq();
		return true;
	}
	public boolean uninstallPlugin(Plugin p) {
		if (!this.installedPlugins.containsKey(p.getName())) return false;
		this.availableQuota=this.availableQuota+this.installedPlugins.get(p.getName());
		
		this.installedPlugins.remove(p.getName());
		return true;
	}
	public boolean usePlugin(String s) {
		if (!this.installedPlugins.containsKey(s)) return false;
		if (this.availableQuota==0) return false;
		this.availableQuota--;
		this.installedPlugins.put(s, this.installedPlugins.get(s)+1);
		return true;
	}
	public ArrayList<String> getInstalledPlugins(){
		String[] s=new String[this.installedPlugins.size()];
		double[] d=new double[this.installedPlugins.size()];
		int p=0;
		for (String i:this.installedPlugins.keySet()) {
			s[p]=i;
			d[p]=this.installedPlugins.get(i);
			p++;
		}
		String st="";
		double dt=0;
		for (int i=0;i<s.length;i++) {
			for (int j=0;j<s.length-1;j++) {
				if (d[j]<d[j+1]) {
					st=s[j];
					s[j]=s[j+1];
					s[j+1]=st;
					dt=d[j];
					d[j]=d[j+1];
					d[j+1]=dt;
				}
			}
		}
		ArrayList<String> arr=new ArrayList<String>();
		for (String i:s) {
			arr.add(i);
		}
		return arr;
	}
//	public static void main(String[] args) {
//		SnowSquirrelBrowser s = new SnowSquirrelBrowser("John Smith",100000000,"1.0");
//		s.installPlugin(new Plugin("Shopping",2.0,"1.0"));
//		s.installPlugin(new Plugin("VPN",1.0,"1.0"));
//		s.installPlugin(new Plugin("S3456ng",200.0,"1.0"));
//		s.installPlugin(new Plugin("VP346N",11.0,"1.0"));
//		s.installPlugin(new Plugin("S34634hopping",1.0,"1.0"));
//		s.installPlugin(new Plugin("VP346N",6.0,"1.0"));
//		s.installPlugin(new Plugin("Email",2.0,"2.0"));
//		s.usePlugin("VPN");
//		s.usePlugin("VPN");
//		s.usePlugin("VPN");
//		System.out.println(s.getInstalledPlugins());
//	}

}
