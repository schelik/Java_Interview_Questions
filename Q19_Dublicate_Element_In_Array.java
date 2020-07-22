package Java_Interview_Problems;

import java.util.HashSet;

public class Q19_Dublicate_Element_In_Array {

	public static void main(String[] args) {


		String s[] = {"java","C","C++","Python","java","java"};
		
		//Approach 1
//		for(int i = 0 ; i < s.length ; i++) {
//			for(int j = i + 1 ; j < s.length ; j++) {
//				if(s[i].equals(s[j])) {
//					System.out.println("Found dublicate element: " + s[i]);
//				}
//			}
//		}
//		

		//Approach 2: HashSet
		HashSet<String> hs = new HashSet();
		
		for(String el : s) {
			if(!hs.add(el)) {
				System.out.println("Dublicate element found : " + el);
			}
		}
	}

}
