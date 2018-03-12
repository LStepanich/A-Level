package p4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Top10 {

	static ArrayList<Password> passwords = new ArrayList<Password>();

	public static void sort() {
		for (int i = 0; i < passwords.size(); i++) {
			for (int j = i + 1; j < passwords.size(); j++)
				if (passwords.get(i).getCounter() < passwords.get(j).getCounter()) {
					passwords.add(i, passwords.get(j));
					passwords.remove(j + 1);
				}
		}
	}

	public static void printTop10() {
		int i = 0;
		while (i < 10 && i < passwords.size()) {
			System.out.println(passwords.get(i).getPassword() + " " + passwords.get(i).getCounter());
			i++;
		}
	}

	public static void read(String path) {
		
		boolean check;

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			StringBuilder stringBuilder = new StringBuilder();
			String currentString = reader.readLine();
			stringBuilder.append(currentString);
			stringBuilder.append("\n");
			String[] str = new String[2];
			str = currentString.split("password ", 2);
			passwords.add(new Password(str[1]));

			while ((currentString = reader.readLine()) != null) {
				stringBuilder.append(currentString);
				stringBuilder.append("\n");
				str = new String[2];
				str = currentString.split("password ", 2);
				check = true;
				for (int i = 0; i < passwords.size(); i++) {
					if (passwords.get(i).getPassword().equals(str[1])) {
						passwords.get(i).increaseCounter();
						check = false;
					}
				}
				if (check) {
					passwords.add(new Password(str[1]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		read("C:\\passwords.txt");
		sort();
		printTop10();

	}

}
