package Java_Interview_Problems;

public class Q25_Remove_White_Spaces_In_A_String {

	public static void main(String[] args) {
		
		String str = "Hi mate how its going or whats poppin ?";
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
	}
}
