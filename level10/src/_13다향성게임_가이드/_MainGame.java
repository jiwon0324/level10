package _13다향성게임_가이드;

public class _MainGame {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		boolean run = true;
		while (true) {
			run = gameManager.changeStage();
			if (!run) {
				break;
			}
		}
		System.out.println("게임오버");
	}
}
