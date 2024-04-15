import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Font;

class DrawPanel extends JPanel implements MouseListener {

    private Rectangle backpack;
    private Rectangle achivement;
    private Rectangle setting;
    private Rectangle sound;
    private Rectangle easy;
    private Rectangle medium;
    private Rectangle hard;

    public DrawPanel() {
        backpack = new Rectangle(20, 10, 50,50);
        achivement = new Rectangle(80, 10, 50, 50);
        setting = new Rectangle(1000-85, 10, 50, 50);
        sound = new Rectangle(1000-145, 10, 50, 50);
        this.addMouseListener(this);

    }

    protected void paintComponent(Graphics g) {
        g.setFont(new Font("Courier New", Font.BOLD, 45));
        easy(g);
        medium(g);
        hard(g);
        draw(backpack, g);
        draw(achivement, g);
        draw(setting, g);
        draw(sound, g);

    }

    public void mousePressed(MouseEvent e) {

        Point clicked = e.getPoint();

        if (e.getButton() == 1) {

        }

        if (e.getButton() == 3) {

        }
    }
    public void drawRect(){

    }
    public void easy(Graphics g){
        g.drawString("EASY", 162, 200);
        easy = new Rectangle(160-45, 200-39, 160+45, 50);
        draw(easy,g);
    }
    public void medium(Graphics g){
        g.drawString("MEDIUM", 140, 325);
        medium = new Rectangle(160-45, 325-39, 160+45, 50);
        draw(medium,g);

    }
    public void hard(Graphics g){
        g.drawString("HARD", 162, 450);
        hard = new Rectangle(160-45, 450-39, 160+45, 50);
        draw(hard,g);
    }

    public void startingScreen(Graphics g){
//        g.setFont(new Font("Courier New", Font.BOLD, 50));
        g.drawString("EASY", 200, 200);
        g.drawString("MEDIUM", 200, 300);
        g.drawString("HARD", 200, 400);
    }



    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseClicked(MouseEvent e) { }



//    TO MAKE MY LIFE WAY EASIER
    public void draw (Rectangle r, Graphics g){
        int x = (int)r.getX();
        int y = (int)r.getY();
        int height = (int)r.getHeight();
        int width = (int)r.getWidth();
        g.drawRect(x, y, width, height);


    }
}