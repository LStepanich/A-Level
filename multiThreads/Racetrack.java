package multiThreads;

import java.util.ArrayList;
import java.util.Random;

public class Racetrack {

	private static int quantity = 5;
	private static int distance = 1000;
	private static ArrayList<Horse> horses = new ArrayList<Horse>();
	private static final String[] HOURSES_NAMES = { "Arrow", "Bullet", "Strong", "Victory", "Nag", "Lame", "Tank",
			"Slow", "Crock", "Black", };
	private static Random random = new Random();
	private static int finishedCounter = 0;

	public static void main(String[] args) {
		newRun(quantity);
		// printResult();
	}

	public static void newRun(int quantity) {
		int speed, name;
		for (int i = 0; i < quantity; i++) {
			speed = (random.nextInt(21) + 30) * 1000 / (random.nextInt(101) + 300);
			name = random.nextInt(7);
			horses.add(new Horse(i, HOURSES_NAMES[name], speed, distance));
			Thread newHorse = new Thread(horses.get(i));
			newHorse.start();
		}

		while (finishedCounter <= quantity - 1) {
			for (int i = finishedCounter; i < quantity; i++) {
				if (horses.get(i).finished()) {
					horses.add(finishedCounter, horses.get(i));
					horses.remove(i + 1);
					System.out.println(horses.get(finishedCounter).getNumber() + " Finished");
					finishedCounter++;
				}
			}
		}
	}

	/*
	 * public static void printResult() { for (Horse horse : horses) {
	 * System.out.println(horses.indexOf(horse) + ": " + horse.getNumber()); } }
	 */
}
