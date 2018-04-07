package p2;

public class PingPongAl implements Runnable {

	private boolean game = true;

	@Override
	public void run() {
		while (game) {
			game=false;
			System.out.println("BOOM " + game);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("GAME OVER HA-HA-HA");
	}

	public void turnCheck(boolean check) {
		if (check)
			game = true;
	}

	public boolean gameOver() {
		return !game;
	}

}
