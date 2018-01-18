package lab8;

import java.util.HashSet;

import java.util.Set;

import sedgewick.StdDraw;

/**
 * An immutable Polynomial class.  This means that once
 *   the constructor has finished, nothing about this
 *   Polynomial can change.  We check for this in
 *   our testing of your implementation.
 *   
 * Also this implementation is sparse, in the sense
 * that terms with 0 coefficients, supplied or implied,
 * can and should not be represented here.
 * 
 * For example, 5 + x^100 is a Polynomial with a 0-degree
 * term (5) and a 100-degree term (1).   The 99 terms in between are
 * not mentioned here and are implied to have a coefficient of 0.
 * Moreover, x^202 power would also have a coefficient of 0 for this
 * Polynomial.   By using a sparse representation, we retain only
 * the 0-degree and 100-degree terms in this case.
 * 
 * @author yournamehere
 *
 */
public class SparsePolynomial implements Polynomial {

	//
	// TODO Declare instance variable(s)
	//
	final private Set<Term> s;
	/**
	 * Primary constructor
	 * @param array  collection of Terms for this Polynomial.  
	 * Some coefficients may be 0.0, but those Terms should not
	 * be retained in the Set.
	 */
	public SparsePolynomial(Term[] array) {
		// TODO complete this constructor
		this.s = new HashSet<>();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].getDegree() == array[j].getDegree()) {
					Term t = new Term(array[i].getCoefficient() + array[j].getCoefficient(), array[i].getDegree());
					array[i] = t;
					Term t2 = new Term(0, 0);
					array[j] = t2;
				}
			}
		}
		for (Term t : array) {
			if (t.getCoefficient() != 0) {
				s.add(t);
			}
		}
	}

	/**
	 * hashCode method
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	/**
	 * check equality
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SparsePolynomial other = (SparsePolynomial) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}

	/**
	 * This is completed already for you.  Do not change this constructor.
	 * Convenience constructor to create an empty Polynomial.
	 * Calls the primary constructor passing an empty array of Terms.
	 */
	public SparsePolynomial() {
		this(new Term[0]);
	}


	/**
	 * This is provided for you.   
	 * Really, no need to thank me.
	 */
	@Override
	public void plot(double lowx, double highx, double incx) {
		//
		// Determine min and max for y values
		//
		double maxy = this.evaluate(lowx);
		double miny = this.evaluate(lowx);
		for (double x=lowx; x < highx; x = x + incx) {
			double y = this.evaluate(x);
			maxy = Math.max(maxy, y);
			miny = Math.min(miny, y);
		}
		StdDraw.setXscale(lowx, highx);
		StdDraw.setYscale(miny, maxy);
		for (double x=lowx; x < highx; x = x + incx) {
			double y = this.evaluate(x);
			StdDraw.point(x, y);
		}
	}

	/**
	 * method to get the highest degree of the terms in a polynomial
	 */
	@Override
	public int degree() {
		int max = 0;
		for (Term t : s) {
			if (t.getDegree() > max) {
				max = t.getDegree();
			}		
		}
		return max;
	}

	/**
	 * get the coefficient of a term of a particular degree
	 */
	@Override
	public double getCoefficientAtDegree(int degree) {
		for (Term t : s) {
			if (t.getDegree() == degree) {
				return t.getCoefficient();
			}
		}
		return 0;
	}

	/**
	 * evaluate the term using value of x
	 */
	@Override
	public double evaluate(double x) {
		double sum = 0;
		for (Term t : s) {
			sum += t.evaluateTermAtX(x);
		}
		return sum;
	}

	/**
	 * method: to array
	 */
	@Override
	public Term[] toArray() {
		Term[] t = new Term[degree() + 1];
		int i = 0;
		for (Term a : s) {
			i = a.getDegree();
			t[i] = a;
		}
		for (int j = 0; j < t.length; j++) {
			if (t[j] == null) {
				t[j] = new Term(0, j);
			}
		}
		return t;
	}

	/**
	 * return the derivative of a polynomial
	 */
	@Override
	public Polynomial derivative() {
		Term[]a = toArray();
		Term[]t = new Term[degree()];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Term(a[i + 1].getCoefficient() * a[i + 1].getDegree(), a[i + 1].getDegree() - 1);
		}
		Polynomial p = new SparsePolynomial(t);
		return p;
	}

	/**
	 * to string method
	 */
	@Override
	public String toString() {
		return "SparsePolynomial [s=" + s + "]";
	}
	/**
	 * sum this and other polynomial together
	 */

	@Override
	public Polynomial sum(Polynomial other) {
		Term[]a = toArray();
		Term[]b = other.toArray();
		Term[]c = new Term[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int i = 0;
		for (int j = a.length; j < c.length; j++) {
			c[j] = b[i];
			i++;
		}
		Polynomial p = new SparsePolynomial(c);
		return p;
	}

	/**
	 * add an extra term to a polynomial
	 * return a new polynomial
	 */
	@Override
	public Polynomial addTerm(Term t) {
		Term[]a = toArray();
		Term[]b = new Term[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = t;
		Polynomial p = new SparsePolynomial(b);
		return p;
	}
}
