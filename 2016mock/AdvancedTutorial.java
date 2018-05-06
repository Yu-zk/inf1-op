import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedTutorial extends Tutorial{
	private String topic;

	public AdvancedTutorial(String topic, String tu, String ti) {
		super(tu, ti);
		this.topic =topic;
	}
	public String toString() {
		return("Topic: "+topic+" "+super.toString());
	}
	public String getTopic() {
		return topic;
	}
	public boolean couldCombineWith(AdvancedTutorial a) {
		return ((topic.equals(a.getTopic())) && (super.getTime().equals(a.getTime())));
	}
	public static HashMap<String, 
			ArrayList<AdvancedTutorial>> construct(String[] s){
		HashMap<String, ArrayList<AdvancedTutorial>> re=
				new HashMap<String,	ArrayList<AdvancedTutorial>>();
		for (int i=0;i<s.length ;i=i+3) {
			if (re.containsKey(s[i])) {
				ArrayList<AdvancedTutorial> tempal =re.get(s[i]);
				tempal.add(new AdvancedTutorial(s[i],s[i+1],s[i+2]));
				re.put(s[i], tempal);
			}else {
				ArrayList<AdvancedTutorial> tempal = new ArrayList<AdvancedTutorial>();
				tempal.add(new AdvancedTutorial(s[i],s[i+1],s[i+2]));
				re.put(s[i], tempal);
			}
		}
		return re;
		
	}
	public static void main(String[] args) {
		if (args.length==0 || (args.length % 3)!=0) {
			System.out.println("Wrong number of arguments!");
		}else {
			System.out.println(construct(args));
		}
	}

}
