package Java_Interview_Problems;

public class Q18_Minimum_And_Maximum_Element_In_Array {

	public static void main(String[] args) {


		int a[] = {1,2,3,4,5,0,23};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i : a) {
			if(i > max)max = i;
			if(i < min)min = i;
		}
		
		System.out.println("Max num is " + max + " and min num is " + min);

	}

}
