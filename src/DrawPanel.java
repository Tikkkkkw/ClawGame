import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
/*Focused on the relationship and the reactions of the
objects and rectangle on screen when they are being clicked. (introscreen, buttons, menus)*/
class DrawPanel extends JPanel implements MouseListener {

    private static boolean introScreen, load;
    private boolean showBackpack, showAchivements, showSettings, showAudio;
    private Point mousePoint;
    private boolean IDEasy, IDMedium, IDHard;
    private final GameMode GM = new GameMode();
    private final TextAndImage TA = new TextAndImage();
    private final Font courierNew = new Font("Courier New", Font.BOLD, 80);
    private final Font comicSans = new Font("Comic Sans MS", Font.BOLD, 74);
    private final Font bookAntiqa = new Font("Book Antiqua", Font.ITALIC, 50);
    public DrawPanel() {
        this.addMouseListener(this);
        load = true;
        introScreen = true;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(comicSans);
        startingScreen(g);

        if (introScreen) {
            drawIntroScreen(g);
//        }
//        if (!introScreen){
            if (showBackpack) {backpack(g);}
            if (showAchivements) {achievement(g);}
            if (showAudio) {sound(g);}
            if (showSettings){setting(g);}
        }
        if (load){
            g.setColor(new Color(0x5A899F));
            g.fillRect(0, 0, 5200, 5200);
            Clickables.draw(GM.getLoading(), g);
            g.setColor(Color.pink);
            g.drawString("Loading screen", 140, 200);
            loads(g);
        }
    }
    public void loads(Graphics g) {
        g.setFont(bookAntiqa);
        g.setColor(new Color(0x885E5E));
        if (IDEasy){
            g.drawString("easy mode easy mode easy mode easy mode easy mode easy mode easy mode easy mode easy mode easy mode", 10, 400);
        }
        if (IDMedium){
            g.drawString("medium mode medium mode medium mode medium mode medium mode medium mode medium mode", 10, 400);
        }
        if (IDHard){
            g.drawString("it's aha-rd mode woo! GL", 50, 400);
            g.drawString("it's aha-rd mode woo! GL", 90, 440);
            g.drawString("it's aha-rd mode woo! GL", 1300, 480);
        }
    }
    public void startingScreen(Graphics g) {
        g.drawString("B", 45, 90); //backpack
        g.drawString("A", 160, 90);//achievement
        g.drawString("L", 280, 90);//loudness
        g.drawString("S", 410, 90);//setting

        Clickables.draw(TA.backpack(), g);
        Clickables.draw(TA.achievement(), g);
        Clickables.draw(TA.setting(), g);
        Clickables.draw(TA.sound(), g);

    }

    private void drawIntroScreen(Graphics g) {
        g.drawString("EASY", 300, 270);
        g.drawString("MEDIUM", 250, 470);
        g.drawString("HARD", 300, 670);

        Clickables.draw(TA.easy(), g);
        Clickables.draw(TA.medium(), g);
        Clickables.draw(TA.hard(), g);
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
                showBackpack = !showBackpack;
                repaint();
            }
            if (Clickables.detectRectangle(TA.achievement(), info)) {
                achievement(getGraphics());
                showAchivements = !showAchivements;
                repaint();
            }
            if (Clickables.detectRectangle(TA.sound(), info)) {
                sound(getGraphics());
                showAudio = !showAudio;
                repaint();
            }
            if (Clickables.detectRectangle(TA.setting(), info)) {
                setting(getGraphics());
                showSettings = !showSettings;
                repaint();
            }
            if(Clickables.detectRectangle(GM.getLoading(), info)){
                load = false;
            }
        }

        if (introScreen) {
            if (Clickables.detectRectangle(TA.easy(), info)) {easy(); load = true;}
            if (Clickables.detectRectangle(TA.medium(), info)) {medium();load = true;}
            if (Clickables.detectRectangle(TA.hard(), info)) {hard();load = true;}
        }
// right
        if (c.getButton() == 3) {
            System.out.println("Right click at " + info);
        }
    }

    public void achievement(Graphics achievement) {
            Clickables.draw(TextAndImage.openedAchievement(), achievement);
            achievement.setColor(new Color(0xC78F8F));
            achievement.setFont(courierNew);
            achievement.drawString("Achievement", 170, 200);
    }

    public void sound(Graphics sound) {

   Clickables.draw(TextAndImage.openedSetting(), sound);
            sound.setColor(new Color(0xD296CA));
            sound.setFont(courierNew);
            sound.drawString("setting", 360, 200);
}
    public void setting(Graphics setting) {
        Clickables.draw(TextAndImage.openedSound(),setting);
        setting.setColor(new Color(0x98C497));
        setting.setFont(courierNew);
        setting.drawString("Sound", 300, 200);
    }

    public void backpack(Graphics backpack) {
        Clickables.draw(TextAndImage.openedBackpack(), backpack);
        backpack.setColor(new Color(0x6969C6));
        backpack.setFont(courierNew);
        backpack.drawString("Backpack", 100, 200);
    }


    public void easy(){
        IDEasy = true;
        GM.setEasy();
        System.out.println("Easy pressed");
        introScreen = false;
    }
    public void medium(){
        IDMedium = true;
        GM.setMedium();
        System.out.println("Medium pressed");
        introScreen = false;
    }
    public void hard(){
        IDHard = true;
        GM.setHard();
        System.out.println("Hard pressed");
        introScreen = false;
    }


    public void mouseReleased(MouseEvent r)  {}
    public void mouseEntered (MouseEvent en) {}
    public void mouseExited  (MouseEvent ex) {}
    public void mousePressed (MouseEvent p)  {}
}
