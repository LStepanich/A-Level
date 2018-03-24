package multiThreads;

public class Horse implements Runnable {
	private int number, speed, distanceToRun, secondsCounter = 0;
	private String name;

	Horse(int number, String name, int speedPerSecond, int distanceToRun) {
		this.name = name;
		this.number = number + 1;
		this.distanceToRun = distanceToRun;
		this.speed = speedPerSecond;
		System.out.println("Hourse - " + this.number + " Name - " + name + "    speedPerSecond - " + speedPerSecond);
	}

	@Override
	public void run() {
		while (!finished()) {
			distanceToRun -= speed;
			secondsCounter++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println(number + " Left to run " + distanceToRun + "
			// time " + secondsCounter);

		}
	}

	public boolean finished() {
		return (distanceToRun <= 0);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

}
