package Java_Interview_Problems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q30_Write_Data_Into_Text_File {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\semih\\Desktop\\Practice.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("This is 2nd line");
		bw.write("This is 3rd line");
		bw.write("This is 4th line");
		
		System.out.println("Writted into the Practice text file");
		
		bw.close();	
	}
}
