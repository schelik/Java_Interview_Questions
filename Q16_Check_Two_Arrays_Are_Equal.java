package Java_Interview_Problems;

import java.util.Arrays;

public class Q16_Check_Two_Arrays_Are_Equal {

	public static void main(String[] args) {


		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		//Approach1
//		boolean check = Arrays.equals(a, b);
//		
//		System.out.println(check ? "Equal" : "Not equal");
		
		//Aproach 2
		
		boolean check = true;
		
		if(a.length == b.length) {
			
			for(int i = 0 ; i < a.length ; i++) {
				if(a[i] != b[i]) {
					check = false;
				}
			}
		}
		
		else {
			check = false;
		}
		
		System.out.println(check ? "Equal" : "Not equal");

	}

}
