import java.util.Scanner;
import java.io.*;

public class Demo {
	public static String read(String path) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			reader = null;
			e.printStackTrace();
		} 
		StringBuilder stringBuilder = new StringBuilder();
		String currentString;
		try {
			while ((currentString = reader.readLine()) != null) {
				stringBuilder.append(currentString);
				stringBuilder.append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) throws IOException {
		System.out.println(read("C:\\test.txt"));
	}
}