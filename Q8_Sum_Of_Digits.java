package Java_Interview_Problems;

public class Q8_Sum_Of_Digits {

	public static void main(String[] args) {


		int num = 12;
		int sum = 0;
		

		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("Sum of digits = " + sum);
	}

}
