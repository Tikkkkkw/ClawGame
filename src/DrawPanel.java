import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
/*Focused on the relationship and the reactions of the
objects and rectangle on screen when they are being clicked. (introscreen, buttons, menus)*/
class DrawPanel extends JPanel implements MouseListener {

    private static boolean introScreen;
    private boolean show;
    private Point mousePoint;
    private boolean IDEasy, IDMedium, IDHard;
    private final GameMode GM = new GameMode();
    private final TextAndImage TA = new TextAndImage();
    private final Font CourierNew = new Font("Courier New", Font.BOLD, 80);
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
            ModePanel MP = new ModePanel();
        }
    }

    public void startingScreen(Graphics g) {
        g.drawString("B", 45, 90); //backpack
        g.drawString("A", 160, 90);//achievement
        g.drawString("L",1720, 90);//loudness
        g.drawString("S", 1820, 90);//setting
        Clickables.draw(TA.backpack(), g);
        Clickables.draw(TA.achievement(), g);
        Clickables.draw(TA.setting(), g);
        Clickables.draw(TA.sound(), g);
    }

    private void drawIntroScreen() {
        easy();
        medium();
        hard();
    }
    private void removeIntro() {
        introScreen = false;
        TA.closeInto();
    }

    public void mouseClicked(MouseEvent c) {
        mousePoint = c.getPoint();
        Point info = mousePoint;
// left
        if (c.getButton() == 1) {
            {
                System.out.println("left  click at " + info);
            }
            if (Clickables.detectRectangle(TA.backpack(), info)) {
                backpack(getGraphics());
            }
            if (Clickables.detectRectangle(TA.achievement(), info)) {
                achievement(getGraphics());
            }
            if (Clickables.detectRectangle(TA.sound(), info)) {
                sound(getGraphics());
            }
            if (Clickables.detectRectangle(TA.setting(),info)) {
                setting(getGraphics());
            }
//            if(Clickables.detectRectangle(TextAndImage.openedBackpack(), info)){
//                show = false;
//            }
        }
// right
        if (c.getButton() == 3) {
            System.out.println("Right click at " + info);
        }
    }

    public void achievement(Graphics achievement){
        System.out.println("Achivement opened");
//        boolean show = true;
//        int counter = 0;
//        while (show){
//            TextAndImage.openedBackpack();
//            achievement.setColor(new Color(0xC78F8F));
//            achievement.setFont(CourierNew);
//            achievement.drawString("Achivement", 170, 200);
//            this.repaint();
//            counter ++;
//            if (counter == 10000){
//                show = false;
//                System.out.println("Achivement closed");
//            }
//        }
    }
    public void sound(Graphics sound){
        System.out.println("sound opened");
//        boolean show = true;
//        int counter = 0;
//        while (show) {
//            sound.drawRect(1100, 50, 500, 300);
//            sound.setColor(new Color(0x98C497));
//            sound.setFont(CourierNew);
//            sound.drawString("Sound", 1200, 200);
//            counter++;
//            this.repaint();
//            if (counter == 10000) {
//                show = false;
//                System.out.println("sound closed");
//            }
//        }

    }

    public void setting(Graphics setting){
        System.out.println("setting opened");
//        boolean show = true;
//        int counter = 0;
//        while (show) {
//            setting.drawRect(1400, 50, 500, 300);
//            setting.setColor(new Color(0xD296CA));
//            setting.setFont(CourierNew);
//            setting.drawString("setting", 1500, 200);
//            this.repaint();
//            counter++;
//            if (counter == 10000) {
//                show = false;
//                System.out.println("sound closed");
//            }
//        }
    }

    public void backpack(Graphics backpack) {
        System.out.println("backpack opened");
        int counter = 0;
        boolean show = true;
        while (show) {
            backpack.drawRect(50, 50, 500, 300);
            backpack.setColor(new Color(0x6969C6));
            backpack.setFont(CourierNew);
            backpack.drawString("Backpack", 50, 200);
            this.repaint();
            counter++;
            if (counter == 12000) {
                show = false;
                System.out.println("backpack closed");
            }
        }
    }


    public void mouseReleased(MouseEvent r) {
    }

    public void mouseEntered(MouseEvent en) {
    }

    public void mouseExited(MouseEvent ex) {
    }

    public void mousePressed(MouseEvent p) {
        if ((p.getButton() == 3))  {
            removeIntro();
            if (IDEasy) {
                System.out.println("Easy pressed");
                GM.setEasy();
            }
            if (IDMedium) {
                System.out.println("Medium pressed");
                GM.setMedium();
            }
            if (IDHard) {
                System.out.println("Hard pressed");
                GM.setHard();
                introScreen = false;
            }
        }
    }


    public void easy() {
        TA.getEasy().addMouseListener(this);
        this.add(TA.getEasy());
    }

    public void medium() {
        TA.getMedium().addMouseListener(this);
        this.add(TA.getMedium());
    }

    public void hard() {
        TA.getHard().addMouseListener(this);
        this.add(TA.getHard());
    }

}
