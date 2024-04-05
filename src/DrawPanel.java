import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Font;

class DrawPanel extends JPanel implements MouseListener {


    private Rectangle button;

    public DrawPanel() {
        button = new Rectangle(147, 100, 160, 26);
        this.addMouseListener(this);

    }

    protected void paintComponent(Graphics g) {
        g.setFont(new Font("Courier New", Font.BOLD, 40));
        startingScreen(g);
        g.drawRect((int)button.getX(), (int)button.getY(), (int)button.getWidth(), (int)button.getHeight());

    }

    public void mousePressed(MouseEvent e) {

        Point clicked = e.getPoint();

        if (e.getButton() == 1) {
            if (button.contains(clicked)) {

            }
        }

        if (e.getButton() == 3) {

        }
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
}