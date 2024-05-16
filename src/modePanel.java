import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


class modePanel extends JPanel implements KeyListener {


    private final ArrayList<Boxed> b = Boxed.getBox();
    private Claw claw;
    private Boxed box;
    private final String easy = "easy";
    public modePanel(){
        claw = new Claw();
        Boxed.getBox();

    }

    public void print(Graphics g){
        g.drawImage(claw.label(),19, 10, null);

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
