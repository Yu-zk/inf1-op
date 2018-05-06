
public class Boss extends Monster{
	private int stage;
	private final int initialHealth;
	private int inipower;
	

	public Boss(int health, int power) {
		super(health, power);
		initialHealth=health;
		inipower=power;
		stage=1;
	}
	public String toString() {
		String s=super.toString()+"\n";
		s=s+String.format("Stage: %d", stage);
		return s;
	}
	
	public void takeDamage(int damage) {
		super.takeDamage(damage);
		if (!isDefeated() ) {
			if(super.health<this.initialHealth*1.0/5) {
				stage=3;
				super.power=inipower*4;
			}else {
				if (super.health<this.initialHealth*1.0/2) {
					stage=2;
					super.power=inipower*2;
				}
			}
		}
	}

}
