package game;

public class GameRunner {
    
    GameingConsole game;
    public GameRunner(GameingConsole game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
