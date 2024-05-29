import java.awt.*;
import java.util.ArrayList;
/*Responsible for each of the game mode things, the differences between each level. Getting each of the prizes
* from the different boxes*/

public class GameMode {
    private static String mode;
    private boolean easy;
    private boolean medium;
    private boolean hard;
    private ArrayList<String> boxLock;
    private Rectangle loading;

    public Rectangle getLoading() {return loading;}

    public GameMode(){

        loading = new Rectangle(0, 0, 5200, 5200);
    }
    public static String getMode() {
        return mode;
    }



    public void setEasy() {
        easy = true;
        medium = false;
        hard = false;
        System.out.println("Game set to easy");
        mode = "easy";
    }

    public void setMedium() {
        medium = true;
        easy = false;
        hard = false;
        System.out.println("Game set to medium");
        mode = "medium";
    }

    public void setHard() {
        hard = true;
        easy = false;
        medium = false;
        System.out.println("Game set to hard");
        mode = "hard";
    }
}
