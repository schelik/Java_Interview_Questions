package Java_Interview_Problems;

import java.util.Scanner;

public class Q6_Count_Number_Of_Digits {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int cnt = 0;
		while(num > 0) {
			num /= 10;
			cnt++;
		}
		
		System.out.println("Number of Digits: " + cnt);

	}

}
