//class demo with perform function

public class classDemo {

	public static void perform(Game game)// an array of objects is created of reference type Game
	{
		game.play();
	}

	public static void main(String[] args) {

		Game game[] = new Game[3];
		game[0] = new Cricket();
		game[1] = new FootBall();
		game[2] = new Tennis();

		for (int i = 0; i < 3; i++) {
			perform(game[i]);
		}

	}

}