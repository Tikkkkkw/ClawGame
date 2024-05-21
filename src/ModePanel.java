import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

class ModePanel extends JPanel implements KeyListener {


    private ArrayList<Boxed> b;
    private Claw claw;
    private Boxed box;
    private String mode;
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
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }


}
