import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
/*MOST IMPORTANT
* MUST BE DONE FOR AT LEAST ONE MODE
* the actual game play detections, */
class ModePanel extends JPanel implements KeyListener {
    private Claw claw;
    private Boxed box;
    private String mode;
    private boolean game;
    private boolean picked;
    private boolean solved ;
    public ModePanel() {
        game = true;
        mode = GameMode.getMode();
        claw = new Claw();
//        box = new Boxed();
    }
    public boolean game(){return game;}
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        claw(g);
    }



    private void claw(Graphics g){
        g.drawImage(claw.getImage(), 200, 200, null);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }


}
