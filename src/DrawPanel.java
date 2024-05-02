import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JButton;


class DrawPanel extends JPanel implements MouseListener {


    private boolean introScreen;
    private boolean gameScreen;
    private final JButton easy = new JButton("easy" );
    //    private JButton medium = new JButton("medium");
//    private JButton hard = new JButton("hard");
    private final GameMode GM = new GameMode();
    private final TextandImage TA = new TextandImage();


    public DrawPanel() {
        this.addMouseListener(this);
        introScreen = true;
        gameScreen = false;


    }


    protected void paintComponent(Graphics g) {
        g.setFont(new Font("Courier New", Font.BOLD, 45));


        startingScreen(g);


        if (introScreen) {
            drawIntroScreen();




        }
        if (gameScreen) {
            // get claw and boxes sprite to be printed.\
            removeIntro();
        }
    }


    private void drawIntroScreen() {


        easy();
        gameScreen = false;
    }


    private void removeIntro() {
        introScreen = false;
        easy.setText("");
        TA.closeInto();
    }


    public void mouseClicked(MouseEvent c) {


        Point click = c.getPoint();


// left
        if (c.getButton() == 1) {
            {
                System.out.println("left click at " + click);
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
            System.out.println("right click at " +click);


        }
    }


    public void achievement(){
        System.out.println("achivement opened");
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




    public void easy() {


        //Code for one of the buttons.
        easy.setBounds(115, 161, 225, 50);
        easy.addMouseListener(this);
        this.add(easy);




    }


//    public void medium() {
//        medium = new JButton(TA.medium());
//        medium.setBounds(115, 286, 225, 50);
//        this.add(medium);
//    }
//
//    public void hard() {
//        hard = new JButton(TA.hard());
//        hard.setBounds(115, 411, 225, 50);
//        this.add(hard);
//    }


    public void startingScreen(Graphics g) {
        g.drawString("B", 30, 50);
        g.drawString("A", 90, 50);
        g.drawString("L", 865, 50);
        g.drawString("S", 925, 50);
        draw(TA.backpack(), g);
        draw(TA.achievement(), g);
        draw(TA.setting(), g);
        draw(TA.sound(), g);
    }


    public void mouseReleased(MouseEvent r) {
    }


    public void mouseEntered(MouseEvent en) {
    }


    public void mouseExited(MouseEvent ex) {


    }


    public void mousePressed(MouseEvent p) {




        if ((p.getButton() == 3))  {
            easy.isSelected();
            System.out.println( "Easy pressed");
            easy.setText("");
        }


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


//    public boolean detectClicked(Button b, MouseEvent e) {
//        return false;
//
//    }




}
