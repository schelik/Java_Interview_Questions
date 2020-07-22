package Java_Interview_Problems;

public class Q24_Remove_Special_Characters {

	public static void main(String[] args) {
		
		String s = "&*(&&^&%^$%^#$ hii mate";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}
}
