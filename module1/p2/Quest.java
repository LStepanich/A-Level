package p2;

import java.util.Random;
import java.util.Scanner;

public class Quest {

	public static void main(String[] args) {
		int k, n, a, b;
		Random r = new Random();

		Scanner scan = new Scanner(System.in);
		System.out.print("������� �������� ���������� �� 1 �� : ");
		n = scan.nextInt();
		b = r.nextInt(n) + 1;
		System.out.print("\n������� ���������� �������: ");
		k = scan.nextInt();

		while (k > 0) {
			System.out.println("��������:");
			a = scan.nextInt();
			if (b > a) {
				k--;
				System.out.println("�������� ���� ����� ������ ��������, �������� " + k + " �������");

			} else if (b < a) {
				k--;
				System.out.println("�������� ���� ����� ,������ ��������, �������� " + k + " �������");

			} else {
				System.out.println("GJ<TLA!!!");
				break;
			}
		}
	}

}
