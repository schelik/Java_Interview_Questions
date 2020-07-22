package Java_Interview_Problems;

import java.util.Arrays;
import java.util.Collections;

public class Q23_Sorting_Elements_In_Array_Using_Bult_In_Methods {

	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5};
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
	}
}
