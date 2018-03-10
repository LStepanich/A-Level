package p2;

import java.util.Random;
import java.util.Scanner;

public class Quest {

	public static void main(String[] args) {
		int k, n, a, b;
		Random r = new Random();

		Scanner scan = new Scanner(System.in);
		System.out.print("¬ведите числовой промежуток от 1 до : ");
		n = scan.nextInt();
		b = r.nextInt(n) + 1;
		System.out.print("\n¬ведите количество попыток: ");
		k = scan.nextInt();

		while (k > 0) {
			System.out.println("”гадайка:");
			a = scan.nextInt();
			if (b > a) {
				k--;
				System.out.println("¬веденое ¬ами число меньше искомого, осталось " + k + " попыток");

			} else if (b < a) {
				k--;
				System.out.println("¬веденое ¬ами число ,больше искомого, осталось " + k + " попыток");

			} else {
				System.out.println("GJ<TLA!!!");
				break;
			}
		}
	}

}
