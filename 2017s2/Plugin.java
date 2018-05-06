public class Plugin {
	double quota;
	String versionReq;
	String name;
	public Plugin(String n, double q, String vr) { 
		quota = q;
		name  = n;
		versionReq = vr;
	}
	public double getQuotaReq() { return quota; }
	public String getVersionReq() { return versionReq; }
	public String getName() { return name;}
}