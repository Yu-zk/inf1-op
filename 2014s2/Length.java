
public class Length {

	private int number;
	private String units;
	
	public Length() {
		number=0;
		units="km";
		
	}
	public void setNumber(int number) {
		if (number>=0) this.number=number;
	}
	public void setUnits(String units) {
		if (units.equals("km")||units.equals("miles")||units.equals("minutes")) {
			this.units=units;
		}
	}
	
	public int getNumber() {
		return number;
	}
	public String getUnits() {
		return units;
	}
	public void convert(String newunits, double rate) {
		if (!(units.equals("km")||units.equals("miles")||units.equals("minutes"))) {
			return;
		}
		units=newunits;
		number=(int)Math.round(1.0*number/rate);
	}
	public String toString() {
		return (String.format("%d %s", number,units));
	}

}
