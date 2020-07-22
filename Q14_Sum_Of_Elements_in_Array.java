package Java_Interview_Problems;

public class Q14_Sum_Of_Elements_in_Array {

	public static void main(String[] args) {


		int a[] = {1,2,3,4,5,};
		int sum = 0;
		
		for(int i : a) {
			sum += i;
		}

		System.out.println("Sum of elements in an array  is = " + sum);
	}

}
