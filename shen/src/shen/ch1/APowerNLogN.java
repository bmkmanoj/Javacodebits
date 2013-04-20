/**
 * 1.1.4
 * 
 * Solve the preceding problem with the additional requirement 
 * that the number of execution steps should be of order logn 
 * (i.e., it should not exceed C log n for some constant C).
 */

package shen.ch1;

public class APowerNLogN {

	public static void main(String[] args) {
	
		int k = 5;
		int b = 1;
		int a = 3;
		int c = 3;
		
		System.out.println("***************INIT****************");		
		System.out.println("Initial values: \ta="+a+" k="+k+" b="+b);
		
		/*
		 
		i(1)  :  k (=5) mod  2 != 0 

		k = 5 - 1 = 4
		b = 1 * 3 = 3

		i(2)  :  k (=4) mod 2 == 0

		k =  4/2 = 2
		c =  3 * 3 = 9  ( = 3 ^ 2)

		i(3)  :  k (=2) mod 2 == 0

		k =  2/2 = 1
		c = 9 * 9 = 81  ( = 3 ^ 4)

		i(4)  :  k (=1)  mod 2 != 0

		k = 1 - 1 = 0
		b = 3 * 81 = 243 ( = 3 ^ 5)

		*/
		
		while (k > 0){
			if(k % 2 == 0){
				k = k / 2;
				c = c * c;
			}else{
				k = k - 1;
				b = b * c;
			}
		}

		System.out.println("End values: \ta="+a+" k="+k+" b="+b);
		System.out.println("***************END****************");
		
	}
}
