import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
/*MOST IMPORTANT
* MUST BE DONE FOR AT LEAST ONE MODE
* the actual game play detections, */
class ModePanel extends JPanel implements KeyListener {


    private ArrayList<Boxed> b;
    private Claw claw;
    private Boxed box;
    private String mode;
    private boolean picked;
    private boolean solved ;
    public ModePanel() {
         mode = GameMode.getMode();
//        claw = new Claw();
//        b = Boxed.getBox();
    }

    private void aClaw(){
        Graphics gr = claw.getImage().getGraphics();
        print(gr);
    }

    public void returnBox(){
        System.out.println(b);

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
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }


}
