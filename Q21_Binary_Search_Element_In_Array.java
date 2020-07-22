package Java_Interview_Problems;

import java.util.Arrays;

public class Q21_Binary_Search_Element_In_Array {
	
	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,6,7,8,9,10};
//		int key = 9;
//		
//		int l = 0 , r = a.length-1;
//		while(l <= r) {
//			int m = l+(r-l)/2;
//			if(a[m] == key) {
//				System.out.println("Key found at " + m);
//				return;
//			}
//			if(a[m] > key) {
//				r = m-1;
//			}
//			if(a[m] < key) {
//				l = m+1;
//			}
//		}
//		
//		System.out.println("key not found in the array");
		
		//Approach 2
		System.out.println(Arrays.binarySearch(a, 4));
	}
}
