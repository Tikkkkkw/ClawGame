import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;

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
        sound = new Rectangle(1000-145, 10, 50, 50);
        setting = new Rectangle(1000-85, 10, 50, 50);
        this.addMouseListener(this);
    }

    protected void paintComponent(Graphics g) {
        g.setFont(new Font("Courier New", Font.BOLD, 45));
        // if intro screen is true
            // drawIntroScreen(g);
        easy(g);
        medium(g);
        hard(g);
        startingScreen(g);
    }

    private void drawIntroScreen(Graphics g) {

    }

    public void mousePressed(MouseEvent e) {

        Point clicked = e.getPoint();
        GameMode GM = new GameMode();
// left
        if (e.getButton() == 1) {
            if (detectRectangle(easy, clicked)){
                GM.setEasy();
            }

            if (detectRectangle(medium, clicked)) {
                GM.setMedium();
            }

            if (detectRectangle(hard, clicked)){
                GM.setHard();
            }
            if (detectRectangle(backpack,clicked)){
                newScreen();
                System.out.println("backpack opening");
            }
            if (detectRectangle(achivement,clicked)){
                System.out.println("Achivements!");
            }
            if (detectRectangle(sound,clicked)){
                System.out.println("sound change");
            }
            if (detectRectangle(setting,clicked)){
                System.out.println("settings");
            }


        }
// right
        if (e.getButton() == 3) {

        }
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
        g.drawString("B", backpack.x,50);
        g.drawString("A", achivement.x, 50);
        g.drawString("L", sound.x, 50);
        g.drawString("S", setting.x, 50);
        draw(backpack, g);
        draw(achivement, g);
        draw(sound, g);
        draw(setting, g);
    }


    public void newScreen() {

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(300, 310));
        layeredPane.setBorder(BorderFactory.createEmptyBorder());



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

    public boolean detectRectangle(Rectangle r, Point mouse){
        boolean clicked = false;
        if( (mouse.x >= r.x && mouse.x <= r.x+r.width) && (mouse.y >= r.y && mouse.y <= r.y+r.height) ){
            clicked = true;
        }
        return clicked;
    }

}