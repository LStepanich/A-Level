package p2;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		System.out.println("press any key to start");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()){
			scanner.next();
		PingPongAl game = new PingPongAl();
		Thread gameThread = new Thread(game);
		gameThread.start();
		while (!game.gameOver()){
			game.turnCheck(scanner.hasNext());
		}
		}
	}

}
