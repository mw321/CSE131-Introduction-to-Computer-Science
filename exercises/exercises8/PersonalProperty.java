package exercises8;

public class PersonalProperty implements Valuable {
	final private int initialValue, yearsOld;

	public PersonalProperty(int iniValue, int yearsOld) {
		this.initialValue = iniValue;
		this.yearsOld = yearsOld;
	}
	public int depreciatedValue() {
		return (int) (initialValue * Math.pow(0.8, yearsOld));
	}
	@Override
	public String toString() {
		return "PersonalProperty [initialValue=" + initialValue + ", yearsOld=" + yearsOld + "]";
	}
	public interface Valuable {
		public int getLiquidValue();
	}
	@Override
	public int getLiquidValue() {
		return this.depreciatedValue();
	}
}
