
/**
 * 1.1.1 
 * 
 * Consider two integer variables a and b. Write a program block 
 * that ex-changes the values of a and b (i.e., the value of a becomes 
 * the value of b and vice versa).
 */


/**
  
  Solution:
  
  We use an auxiliary integer variable t.
	t := a;
	a := b;
	b := t;
 
 */
package shen.ch1;

public class ExchangeVariablesOne {

	public static void main(String[] args) {
		int a=3;		
		int b=6;
		int t = 0;
		
		System.out.println("***************INIT****************");		
		System.out.println("Initial values: \ta="+a+" b="+b);
		
		//exchange logic here 
		t = a;
		a = b;
		b = t;
		
		System.out.println("After exchange values: \ta="+a+" b="+b);
		System.out.println("***************END****************");
	}
}
