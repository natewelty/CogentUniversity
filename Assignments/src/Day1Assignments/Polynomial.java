/**
 * 
 */
package Day1Assignments;

/**
 * @author : Nate
 * @date   : Jan 16, 2023
 * 
 */

import java.util.*;


public class Polynomial {
	Term[] terms;
	public Polynomial(int length) {
		terms = new Term[length];
		for(int i=0;i<length;i++) {
			terms[i]=new Term();
		}
	}
	
	public void displayTerms() {
		for(int i = 0; i<terms.length; i++) {
			System.out.print(terms[i].getCoefficient() + "x^" + terms[i].getExponent());
			if(i<terms.length-1) {
				System.out.print(" + ");
			}
		}
		System.out.println();
	}
	
	/*
	 * Grabs the first "empty" term for the setTerm method
	 */
	int firstNonZero() {
		for(int i=0; i<terms.length;i++) {
			if (terms[i].getCoefficient() ==0 && terms[i].getExponent()==0) {
				return i;
			}
			
		}
		return terms.length;
	}
	
	public void setTerm(int coefficient, int exponent) {
		int nextTerm = firstNonZero();
		if (nextTerm >= terms.length) {
			System.out.println("Polynomial terms are full.");
		}
		else {
			terms[nextTerm].setCoefficient(coefficient);
			terms[nextTerm].setExponent(exponent);
		}
			
	}

	public void sort() {
		Arrays.sort(terms, new SortByExponent());
		}
	
	
	class Term {
		private int coefficient, exponent;
		
		/**
		 * 
		 */
		public Term() {
			coefficient = exponent = 0;
		}
		
		public Term(int coefficient, int exponent) {
			this.coefficient = coefficient;
			this.exponent = exponent;
		}
		/**
		 * @return the coefficient
		 */
		public int getCoefficient() {
			return coefficient;
		}
		/**
		 * @return the exponent
		 */
		public int getExponent() {
			return exponent;
		}
		/**
		 * @param coefficient the coefficient to set
		 */
		public void setCoefficient(int coefficient) {
			this.coefficient = coefficient;
		}
		/**
		 * @param exponent the exponent to set
		 */
		public void setExponent(int exponent) {
			this.exponent = exponent;
		}
	} //end class Term

	class SortByExponent implements Comparator<Term> {
		public int compare(Term a, Term b) {
			return a.getExponent() - b.getExponent();
		}
	}
	
}


