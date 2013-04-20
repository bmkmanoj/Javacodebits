/**
 * 1.1.2
 * 
 * Solve the preceding problem without an auxiliary variable.
 * (Assume all variables accept arbitrary integer values.)
 * 
 */

/**
   Solution:
 
 	(By a0 and b0 we denote the initial values of a and b.)
	a := a + b; {a = a0 + b0, b = b0} 
	b := a - b; {a = a0 + b0, b = a0}
	a := a - b; {a = bO, b = aO}
 */

package shen.ch1;

public class ExchangeVariablesTwo {

	public static void main(String[] args) {
		int a=3;		
		int b=6;	
		
		System.out.println("***************INIT****************");		
		System.out.println("Initial values: \ta="+a+" b="+b);
		
		//exchange logic here 
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After exchange values: \ta="+a+" b="+b);
		System.out.println("***************END****************");
	}
}
