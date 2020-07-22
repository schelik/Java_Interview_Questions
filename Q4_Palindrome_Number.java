package Java_Interview_Problems;

public class Q4_Palindrome_Number {

	public static void main(String[] args) {

		int num = 124521;
		int og_num = num;
		int rev = 0;
		
		while(num > 0) {
			rev = rev*10 + num%10;
			num /= 10;
		}
		
		System.out.println(rev == og_num ? "Palindrome" : "not Palindorome" );
		
	}

}
