package Java_Interview_Problems;

import java.util.Arrays;

public class Q22_Bubble_Sort_Array {

	public static void main(String[] args) {
		
		int a[] = {3,423,5,2,3,24,55,7,98};
		
		System.out.println("Array before sorting: " + Arrays.toString(a));
		
		for(int i = 0 ; i < a.length-1 ; i++) {
			
			for(int j = 0 ; j < a.length-1 ; j++) {
				
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array after sorting: " + Arrays.toString(a));
	}
}
