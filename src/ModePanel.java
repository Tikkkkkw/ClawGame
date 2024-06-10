import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*MOST IMPORTANT
* MUST BE DONE FOR AT LEAST ONE MODE
* the actual Game play detections, */
class ModePanel extends JPanel implements KeyListener {
    private Claw Claw;
    private int X;
    private int Y;
    private String mode;
    private boolean game;
    private boolean picked;
    private boolean solved ;
    public ModePanel() {

        X = 200;
        Y = 200;
        game = true;
        mode = GameMode.getMode();
        Claw = new Claw(X,Y);
//        box = new Boxed();
    }
    public boolean game(){return game;}

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        claw(g);
        this.addKeyListener(this);
    }

    private void claw(Graphics g){
//        claw.clawSkins("RedScape");
        g.drawImage(Claw.getOpenImage(), X, Y, null);

    }
    public void keyTyped(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_W)
        {
            System.out.println("UP");
            Y = Y - 5;
            Claw.setDirection(1);
        }
        if(e.getKeyCode() == KeyEvent.VK_D )
        {
            System.out.println("RIGHT");
            X = X + 5;
            Claw.setDirection(2);
        }
        if(e.getKeyCode() == KeyEvent.VK_A)
        {
            System.out.println("LEFT");
            X = X - 5;
            Claw.setDirection(3);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
