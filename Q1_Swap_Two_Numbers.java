package Java_Interview_Problems;

public class Q1_Swap_Two_Numbers {

	public static void main(String[] args) {


		int a = 10, b = 20;
		
		System.out.println("Before swapping values are: a = " + a + " b = " + b);
		
/*		Logic 1 - Third variable
		int temp = a;
		a = b;
		b = temp;
		

  	    Logic 2 - Using + and - operators
		
		b = a + b;
		a = b - a;
		b = b - a;

		
		
	    Logic 3 - Using * and / operators
		
		b = a * b;
		a = b/a;
		b = b/a;
		
*/
//      Logic 4 - Single statement
		
		b = a + b - (a = b);
		
		System.out.println("After swapping values are: a = " + a + " b = " + b);

	}

}
