package Java_Interview_Problems;

public class Q9_Find_Largest_Of_3_Numbers {

	public static void main(String[] args) {


		
		int a = 10, b = 20, c = 30;
		
		//1st way
//		int max = Math.max(a, Math.max(b, c));
		
		//2nd way
		int max = a > (b > c ? b : c) ? a : (b > c ? b : c);
		
		
		
		System.out.println("Largest of 3 number is = " + max);

	}

}
