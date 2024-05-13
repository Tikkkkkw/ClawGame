import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


class easyPanel extends JPanel implements KeyListener {


    private final ArrayList<Boxed> b = Boxed.getBox();
    private Claw claw;
    private final String easy = "easy";
    public easyPanel(){
        claw = new Claw();
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
    public void returnBox(){
        System.out.println(b);

    }

}
