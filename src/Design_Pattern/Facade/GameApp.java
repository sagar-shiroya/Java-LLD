package Design_Pattern.Facade;

public class GameApp {
    public static void main(String[] args) {
        GameStarter game = new GameStarter();

        game.startGame();


        game.stopGame();
    }
}
