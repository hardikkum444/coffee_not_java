import java.io.BufferedReader;
import java.io.*;

public class reading {
	public static void main(String[] args){

		try(BufferedReader reader = new BufferedReader(new FileReader("read.txt"))){
			String line;
			while((line = reader.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
