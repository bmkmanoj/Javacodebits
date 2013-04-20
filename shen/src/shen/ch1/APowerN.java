
/**
 * 
 * 1.1.3. 
 * 
 * Let a be an integer and n be a nonnegative integer. 
 * Compute a to the power n. In other words, we ask for a 
 * program that does not change the values of a and n and 
 * assigns the value an to another variable (say, b).
 *  (The program may use other variables as well.)
 *  
 */

package shen.ch1;

public class APowerN {

	public static void main(String[] args) {
		int a=3;		
		int b=1;
		int k=0;
		int n=5;
	
		System.out.println("***************INIT****************");		
		System.out.println("Initial values: \ta="+a+" n="+n+" b="+b);
		
		while(k < n){
			k = k + 1;
			b = b * a;
		}
		
		System.out.println("End values: \ta="+a+" n="+n+" b="+b);
		System.out.println("***************END****************");
		
	}
}
