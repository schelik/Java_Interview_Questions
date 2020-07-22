package Java_Interview_Problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q29_Read_Data_From_Text_File {

	public static void main(String[] args) throws IOException {
		
		//Approach 1: Using FileReader BufferReader
		
//		FileReader fr = new FileReader("C:\\Users\\semih\\Desktop\\Practice.txt");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String str;
//		
//		while((str = br.readLine()) != null) {
//			System.out.println(str);
//		}
//		
//		br.close();
		
		//Approach 2: Using Scanner & File
		
		File file = new File("C:\\Users\\semih\\Desktop\\Practice.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		
	}
}
