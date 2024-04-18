//this is only displays all the lines in reverse order!

import java.io.*;
import java.util.*; //for arraylist

public class reverser{

	public static void main(String[] args){

		String fileName = "read.txt";
		ArrayList<String> lines = new ArrayList<>();

		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			String line;
			while((line = reader.readLine()) != null) {
				lines.add(line);
			}
		}catch(IOException e){
			System.out.println("Error has occured");
		}

		//now to display in reverse order

		System.out.println("Here is the stuff in reverse order");

		for(int i =lines.size() -1;i>=0;i--){
			System.out.println(lines.get(i));
		}
	}
}
