package Java_Interview_Problems;

public class Q15_Print_Even_Odd_number_From_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		System.out.print("Even numbers: ");
		for(int i : a) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("Odd numbers: ");
		for(int i : a) {
			if(i % 2 == 1) {	
				System.out.print(i + " ");
			}
		}
	}
}
