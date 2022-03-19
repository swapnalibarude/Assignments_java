package assignment4q1;
import java.io.*;
import java.util.*;

public class PrintFrequency {
	HashMap<String,Integer> map=new HashMap<>();
	private BufferedReader br;
	
	public PrintFrequency()
	{
			}
		
	void init() {
	
		try {
			String words[] = null;
			br = new BufferedReader(new FileReader(new File("story.txt")));
			String line = null;
			
			while ((line = br.readLine()) != null) {
				words = line.split(" ");
			}
			
			for(int i=0;i<words.length;i++)
			{
				if(map.containsKey(words[i])) 
				{
					int count=map.get(words[i]);
					map.replace(words[i],count+1);	
				}
				else
				{
					map.put(words[i],1);
				}
			}
			
			map.forEach((i,j)->{
				System.out.println(i+" : "+j);
				});
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
