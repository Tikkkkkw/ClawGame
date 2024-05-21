import java.util.ArrayList;

public class GameMode {
    private static String mode;
    private boolean easy;
    private boolean medium;
    private boolean hard;
    private boolean picked;
    private boolean solved ;
    private ArrayList<String> boxLock;
    public GameMode(){}
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

    public boolean isPickedup() {
        return picked;
    }

    public void setPickedup(boolean pickedup) {
        this.picked = pickedup;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
