import java.util.ArrayList;

public class GameMode {
    String mode;

    private boolean easy;
    private boolean medium;
    private boolean hard;
    private boolean pickedup;
    private boolean solved ;
    private ArrayList<String> boxLock;

   public GameMode(){
   }

    public String getMode() {
        return mode;
    }



    public void setEasy() {
        easy = true;
        medium = false;
        hard = false;
        System.out.println("Game set to easy");
    }

    public void setMedium() {
        medium = true;
        easy = false;
        hard = false;
        System.out.println("Game set to medium");
    }

    public void setHard() {
        hard = true;
        easy = false;
        medium = false;
        System.out.println("Game set to hard");
    }



    public boolean isPickedup() {
        return pickedup;
    }

    public void setPickedup(boolean pickedup) {
        this.pickedup = pickedup;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
