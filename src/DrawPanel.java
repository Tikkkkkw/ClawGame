import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JButton;


class DrawPanel extends JPanel implements MouseListener {

    private boolean introScreen;
    private final JButton easy = new JButton("easy" );
    private final JButton medium = new JButton("medium");
    private final JButton hard = new JButton("hard");
    private boolean IDEasy;
    private boolean IDMedium;
    private boolean IDHard;
    private final GameMode GM = new GameMode();
    private final TextandImage TA = new TextandImage();
//    private final Font CourierNew = new Font("Courier New", Font.BOLD, 45);
    private final Font ComicSans = new Font("Comic Sans MS",Font.BOLD, 74);


    public DrawPanel() {
        this.addMouseListener(this);
        introScreen = true;
    }


    protected void paintComponent(Graphics g) {
        g.setFont(ComicSans);
        startingScreen(g);

        if (introScreen) {
            drawIntroScreen();
        }
        else {
            removeIntro();
        }
    }

    public void startingScreen(Graphics g) {
        g.drawString("B", 45, 90); //backpack
        g.drawString("A", 160, 90);//achievement
        g.drawString("L",1720, 90);//loudness
        g.drawString("S", 1820, 90);//setting
        draw(TA.backpack(), g);
        draw(TA.achievement(), g);
        draw(TA.setting(), g);
        draw(TA.sound(), g);
    }

    private void drawIntroScreen() {
        easy();
        medium();
        hard();
        IDEasy = false;
        IDMedium = false;
        IDHard = false;
    }

    private void removeIntro() {
        introScreen = false;
        easy.setVisible(false);
        medium.setVisible(false);
        hard.setVisible(false);
        TA.closeInto();
    }

    public void mouseClicked(MouseEvent c) {
        Point click = c.getLocationOnScreen();
// left
        if (c.getButton() == 1) {
            {
                System.out.println("left  click at " + click);
            }
            if (detectRectangle(TA.backpack(), click)) {
                backpack();
            }
            if (detectRectangle(TA.achievement(), click)) {
                achievement();
            }
            if (detectRectangle(TA.sound(), click)) {
                sound();
            }
            if (detectRectangle(TA.setting(), click)) {
                setting();
            }

        }
// right
        if (c.getButton() == 3) {
            System.out.println("Right click at " +click);
            this.repaint();
        }
    }


    public void achievement(){
        System.out.println("achievement opened");
    }

    public void sound(){
        System.out.println("sound opened");
    }

    public void setting(){
        System.out.println("setting opened");
    }

    public void backpack(){
        System.out.println("backpack opened");
    }



    public void mouseReleased(MouseEvent r) {
    }

    public void mouseEntered(MouseEvent en) {
            System.out.println("Mouse IN");
    }

    public void mouseExited(MouseEvent ex) {
        System.out.println("Mouse OUT");
    }

    public void mousePressed(MouseEvent p) {
        if ((p.getButton() == 3))  {
            introScreen = false;

            if (IDEasy) {
                System.out.println("Easy pressed");
                easy.setText("");
                GM.setEasy();
            }
            if (IDMedium) {
                System.out.println("Medium pressed");
                medium.setText("");
                GM.setMedium();
            }
            if (IDHard) {
                System.out.println("Hard pressed");
                hard.setText("");
                GM.setHard();
            }
        }
    }

    public void easy() {
        //Code for one of the buttons.
        easy.setBounds(250, 200, 335, 80);
        easy.addMouseListener(this);
//        easy.addActionListener(what);
        this.add(easy);

    }

    public void medium() {
        medium.setBounds(250, 400, 335, 80);
        medium.addMouseListener(this);
        this.add(medium);
    }

    public void hard() {
        hard.setBounds(250, 600, 335, 80);
        hard.addMouseListener(this);
        this.add(hard);
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
