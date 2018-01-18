package studio7;

public class Fraction {
	//javadocs and unit test
	private int num;
	private int deno;
	public Fraction(int num, int deno) {
		this.num = num;
		this.deno = deno;
	}
	public Fraction add(Fraction f) {
		Fraction s = new Fraction(this.num + f.num, this.deno + f.deno);
		return s;
	}
	public Fraction mult(Fraction f) {
		Fraction s = new Fraction(this.num * f.num, this.deno * f.deno);
		return s;
	}
	public Fraction reciprocal(Fraction f) {
		Fraction s = new Fraction(this.deno, this.num);
		return s;
	}
	//simplify itself
}
