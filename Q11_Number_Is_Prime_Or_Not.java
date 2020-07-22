package Java_Interview_Problems;

public class Q11_Number_Is_Prime_Or_Not {

	public static void main(String[] args) {

		int num = 29;
		boolean flag = false;
		
		for(int i = 2 ; i <= num/2 ; ++i) {
			
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		System.out.println(!flag ? "Prime number" : "Not a prime number");
		
	

	}

}
