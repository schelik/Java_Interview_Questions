package Java_Interview_Problems;

public class Q20_Search_Element_Linear_Search {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		int key = 7;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				System.out.println("Key found at " + i);
				return;
			}
		}
		
		System.out.println("Key not found");
	}
}
