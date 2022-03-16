package Assignment3q1;



import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {

	public static void main(String[] args) {

		
		
		try {
			FileReader fr=new FileReader("C:/Users/Swapnali/Pictures/2021-02-24");
			FileWriter fw=new FileWriter("C:/Users/Swapnali/Pictures/2021-02-24");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("file is written");
	}
}


