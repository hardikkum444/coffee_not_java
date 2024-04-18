//apparently adding true at the end allows for appending and not writing
import java.io.*;

public class writing {
	public static void main(String[] args){
		String fileName = "read.txt";
		String content = "write this to the file please";

		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
			writer.newLine();
			writer.write(content);
			System.out.print("content has been written!");
		}catch(IOException e){
			System.err.println("An erro has just occurred");

		}
			
		
	}
}
