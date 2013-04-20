/**
 * 
 * 1.1.5
 * 
 * Two nonnegative integers a and b are given. Compute the product a * b (only +, -, =, <> are allowed).
 */

package shen.ch1;

public class AProductB {

	public static void main(String[] args) {
		int k = 0;
		int c = 0;			
		int b = 6;
		int a = 3;
		
		System.out.println("***************INIT****************");		
		System.out.println("Initial values: a="+a+" c="+c+" k="+k+" b="+b);
		
		while (k < b){
			k = k + 1;
			c = c + a;
		}
		
		System.out.println("End values: \ta="+a+" c="+c+" k="+k+" b="+b);
		System.out.println("***************END****************");		
	}
}
