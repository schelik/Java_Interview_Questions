package Java_Interview_Problems;

public class Q7_Number_Of_Even_Odd_Digits {

	public static void main(String[] args) {


		int num = 123455;
		int odd = 0;
		int even = 0;
		
		while(num > 0) {

			if((num % 10) % 2 == 0)even++;
			else odd++;
			num /= 10;
		}
		
		System.out.println("Number of Even digits = " + even + " & Odd digits = " + odd);
	}

}
