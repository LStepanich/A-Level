package p5;

import java.util.Scanner;

public class ChessKnight {
	static int startPositionY, finishPositionY;
	static char startPositionX, finishPositionX;
	static char[] startPosition = new char[2], finishPosition=new char[2];

	public static void read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите начальную координату, например A6:");
		startPosition = scan.next().toCharArray();
		startPositionX = startPosition[0];
		startPositionY = Character.getNumericValue(startPosition[1]);
		if (startPositionX < 'A' || startPositionX > 'H' || 
				startPositionY < 1 || startPositionY > 8 || startPosition.length>2) {
			System.out.println("Неверная координата");
			scan.close();
			return;
		}
		System.out.println("Введите конечную координату, например A6:");
		finishPosition = scan.next().toCharArray();
		finishPositionX = finishPosition[0];
		finishPositionY = Character.getNumericValue(finishPosition[1]);
		if (finishPositionX < 'A' || finishPositionX > 'H' || 
				finishPositionY < 1 || finishPositionY > 8 || finishPosition.length>2) {
			System.out.println("Неверная координата");
			scan.close();
			return;
		}
		scan.close();
	}

	public static boolean check() {
		if (finishPositionX - startPositionX == 2 || startPositionX - finishPositionX == 2) {
			if (finishPositionY - startPositionY == 1 || startPositionY - finishPositionY == 1) {
				return true;
			}
		}
		if (finishPositionX - startPositionX == 1 || startPositionX - finishPositionX == 1) {
			if (finishPositionY - startPositionY == 2 || startPositionY - finishPositionY == 2) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		read();
		if (check()) {
			System.out.println("Можно");
		} else {
			System.out.println("Нельзя");
		}
	}

}
