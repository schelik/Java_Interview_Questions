package Java_Interview_Problems;

public class Q26_Occurance_Of_A_Character_In_A_String {
		
	public static void main(String[] args) {
		
		String str = "abcdaa";
		
		char c = 'b';
		int cnt = 0;
		
		for(char i : str.toCharArray()) {
			if(i == c)cnt++;
		}
		
		System.out.println("Count of char " + c + " is " + cnt);
	}
}
