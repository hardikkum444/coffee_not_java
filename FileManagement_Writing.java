import java.io.*;

public class writing{
	public static void main(String[] args){

		String filename = "read.txt";
		String content = "mandom";

		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
			writer.newLine();
			writer.write(content);
			System.out.println("Stuff has been written!");
		}catch(IOException e){
			System.err.println("An error has occurred");
		}
	}
}
