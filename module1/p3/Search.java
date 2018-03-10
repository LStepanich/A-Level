package p3;

import java.util.ArrayList;
import java.util.Random;

public class Search {
	static int size = 10, counter = 0;
	static int[] mas = new int[size];

	public static void init() {
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			mas[i] = r.nextInt(size) + 1;
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	public static int search() {
		boolean check;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(mas[0]);
		for (int i = 1; i < size; i++) {
			check = true;
			for (int j = 0; j < list.size(); j++) {
				if (mas[i] == list.get(j)) {
					check = false;
				}

			}
			if (check) {
				list.add(mas[i]);
			}
		}

		return list.size();
	}

	public static void main(String[] args) {
		init();
		System.out.println(search());
	}

}
