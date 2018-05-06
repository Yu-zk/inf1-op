import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class FruitySmartPhone extends Phone{
	private HashMap<String,Integer> installedApps=new HashMap<String,Integer>();
	private int cpuSpeed;
	private int freeMemory;

	public int getCpuSpeed() {
		return cpuSpeed;
	}
	public int getFreeMemory() {
		return freeMemory;
	}
	public FruitySmartPhone(String name,int am,int cpu) {
		super(name);
		this.cpuSpeed=cpu;
		this.freeMemory=am;
	}
	public boolean installApp(App a) {
		if (this.installedApps.containsKey(a.getName()))  return false;
		if (a.getMemoryReq()>this.freeMemory) return false;
		if (this.cpuSpeed<a.getCpuReq()) return false;
		this.freeMemory=this.freeMemory-a.getMemoryReq();
		this.installedApps.put(a.getName(), a.getMemoryReq());
		return true;
	}
	public boolean uninstallApp(App a) {
		if (!this.installedApps.containsKey(a.getName())) return false;
		this.installedApps.remove(a.getName());
		this.freeMemory=this.freeMemory+a.getMemoryReq();
		return true;
	}
	public boolean useApp(String s) {
		if (!this.installedApps.containsKey(s)) return false;
		if (this.freeMemory<1) return false;
		this.freeMemory--;
		this.installedApps.put(s, this.installedApps.get(s)+1);
		return true;
	}
//	public ArrayList<String> getInstalledApps(){
//		ArrayList<String> r= new ArrayList<String>();
//		if (this.installedApps.size()==0) return r;
//		int max=0;
//		for (String i:this.installedApps.keySet()) {
//			if (max<this.installedApps.get(i)) max=this.installedApps.get(i);
//		}
//		for (int i=max;i>=0;i--) {
//			for(String j:this.installedApps.keySet()) {
//				if (this.installedApps.get(j)==i) {
//					r.add(j);
//				}
//			}
//		}
//		return r;
//	}
	public ArrayList<String> getInstalledApps(){
		ArrayList<String> r= new ArrayList<String>();
		if (this.installedApps.size()==0) return r;
		r= new ArrayList<String>(this.installedApps.keySet());
		Comparator<String> c=new Comparator<String>()  {

			@Override
			public int compare(String o1, String o2) {
				return installedApps.get(o2)-installedApps.get(o1);
			}
		};
		Collections.sort(r,c);
		return r;
	}
	public static void main (String[] args) {
		FruitySmartPhone p = new FruitySmartPhone("John Smith",100,10);
		p.installApp(new App("Camera",1,2));
		p.installApp(new App("Music",2,3));
		p.installApp(new App("Podcast",2,11));
		p.useApp("Camera");
		p.useApp("Camera");
		System.out.println(p.getInstalledApps());
	}

}
