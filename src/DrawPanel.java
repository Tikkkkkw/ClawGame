import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JButton;

class DrawPanel extends JPanel implements MouseListener {

    private boolean introScreen;
    private boolean gameScreen;
    private final Rectangle backpack;
    private final Rectangle achievement;
    private final Rectangle setting;
    private final Rectangle sound;
    private JButton easy;
    private JButton medium;
    private JButton hard;
    private final GameMode GM = new GameMode();
    private final TextandImage TA = new TextandImage();

    public DrawPanel() {
        backpack = new Rectangle(20, 10, 50, 50);
        achievement = new Rectangle(80, 10, 50, 50);
        sound = new Rectangle(1000 - 145, 10, 50, 50);
        setting = new Rectangle(1000 - 85, 10, 50, 50);
        this.addMouseListener(this);
        introScreen = true;
        gameScreen = false;
    }

    protected void paintComponent(Graphics g) {
        g.setFont(new Font("Courier New", Font.BOLD, 45));

        startingScreen(g);

        if (introScreen) {
            drawIntroScreen();

        } else if (gameScreen) {
            // get claw and boxes sprite to be printed.
            removeIntro();


        }

    }

    private void drawIntroScreen() {
        easy();
        medium();
        hard();
    }

    private void removeIntro() {

        easy.setVisible(false);
        medium.setVisible(false);
        hard.setVisible(false);
        TA.closeInto();
    }

    public void mousePressed(MouseEvent e) {

        Point clicked = e.getPoint();

// left
        if (e.getButton() == 1) {
       {

            }
            if (detectRectangle(backpack, clicked)) {
                System.out.println("backpack opening");
            }
            if (detectRectangle(achievement, clicked)) {
                System.out.println("Achievements!");
            }
            if (detectRectangle(sound, clicked)) {
                System.out.println("sound change");
            }
            if (detectRectangle(setting, clicked)) {
                System.out.println("settings");
            }


        }
// right
        if (e.getButton() == 3) {
            System.out.println("STOP YELLING AT ME");
        }
    }

    public void easy() {

        easy = new JButton(TA.easy());
        easy.setBounds(115, 161, 225, 50);
        this.add(easy);

    }

    public void medium() {
        medium = new JButton(TA.medium());
        medium.setBounds(115, 286, 225, 50);
        this.add(medium);
    }

    public void hard() {
        hard = new JButton(TA.hard());
        hard.setBounds(115, 411, 225, 50);
        this.add(hard);
    }

    public void startingScreen(Graphics g) {
        g.drawString("B", backpack.x+10, 50);
        g.drawString("A", achievement.x+10, 50);
        g.drawString("L", sound.x+10, 50);
        g.drawString("S", setting.x+10, 50);
        draw(backpack, g);
        draw(achievement, g);
        draw(sound, g);
        draw(setting, g);
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }


    //    TO MAKE MY LIFE WAY EASIER
    public void draw(Rectangle r, Graphics g) {
        int x = (int) r.getX();
        int y = (int) r.getY();
        int height = (int) r.getHeight();
        int width = (int) r.getWidth();
        g.drawRect(x, y, width, height);
    }

    public boolean detectRectangle(Rectangle r, Point mouse) {
        return (mouse.x >= r.x && mouse.x <= r.x + r.width) && (mouse.y >= r.y && mouse.y <= r.y + r.height);
    }
}
