import java.awt.*;
import java.util.ArrayList;
/*Responsible for each of the game mode things, the differences between each level. Getting each of the prizes
* from the different boxes*/

public class GameMode {
    private static String modeSet;
    private static int modeValue;
    private ArrayList<String> boxLock;
    private Rectangle loading;

    public Rectangle getLoading() {return loading;}

    public GameMode(){
        loading = new Rectangle(0, 0, 5200, 5200);
        modeSet = null;
        modeValue = 0;
    }

    public static String getMode() {
        return modeSet;
    }
    public static int getModeValue(){return modeValue;}




    public void setEasy() {
        modeValue = 1;
        System.out.println("Game set to easy");
        modeSet = "easy";
    }

    public void setMedium() {
        modeValue = 2;
        System.out.println("Game set to medium");
        modeSet = "medium";
    }

    public void setHard() {
        modeValue = 3;
        System.out.println("Game set to hard");
        modeSet = "hard";
    }
}
