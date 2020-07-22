package Java_Interview_Problems;

public class Q17_Missing_Number_In_Array {

	public static void main(String[] args) {


		int a[] = {1,3,4,5,6};
		
		int sum1 = 0, sum2 = 0;
		
		for(int i : a) {
			sum1 += i;
		}
		
		for(int i = 1 ; i <= a[a.length-1] ; i++) {
			sum2 += i;
		}
		
		if(sum1 == sum2) {
			System.out.println("No missing number");
		}
		
		else {
			System.out.println("Missing number is " + (sum2 - sum1));
		}
	}

}
