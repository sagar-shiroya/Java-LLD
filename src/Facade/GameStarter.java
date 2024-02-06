package Facade;

//Facade - GameStarter
public class GameStarter {
    private Computer computer;
    private GameSoftware gameSoftware;
    private GameSettings gameSettings;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public GameSoftware getGameSoftware() {
        return gameSoftware;
    }

    public void setGameSoftware(GameSoftware gameSoftware) {
        this.gameSoftware = gameSoftware;
    }

    public GameSettings getGameSettings() {
        return gameSettings;
    }

    public void setGameSettings(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }

    public GameStarter() {
        this.gameSoftware = new GameSoftware();
        this.gameSettings = new GameSettings();
        this.computer = new Computer();
    }

    public void startGame(){
        computer.turnOn();
        gameSoftware.start();
        gameSettings.adjustVolume();
        gameSettings.adjustBrightness();
        gameSettings.setControls();
        System.out.println("===========Game Started===========");
    }

    public void stopGame(){
        gameSoftware.close();
        computer.turnOff();
        System.out.println("===========Game Stopped===========");
    }
}
