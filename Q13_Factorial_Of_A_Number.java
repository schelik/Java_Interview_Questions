package Java_Interview_Problems;

public class Q13_Factorial_Of_A_Number {

	public static void main(String[] args) {


		int num = 5;
		int fact = 1;
		
		for(int i = 1 ; i <= num ; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial number is = " + fact);
	}

}
