import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
/*Focused on the relationship and the reactions of the
objects and rectangle on screen when they are being clicked. (introscreen, buttons, menus)*/

/*
Move screen after click to force update
*/

class DrawPanel extends JPanel implements MouseListener {

    private static boolean introScreen, load;
    private boolean showBackpack, showAchivements, showSettings, showAudio;
    private Point mousePoint;
    private boolean IDEasy, IDMedium, IDHard;
    private final GameMode GM = new GameMode();
    private final TextAndImage TA = new TextAndImage();
    private final Font CourierNew = new Font("Courier New", Font.BOLD, 80);
    private final Font ComicSans = new Font("Comic Sans MS", Font.BOLD, 74);

    public DrawPanel() {
        this.addMouseListener(this);
        introScreen = true;
        showBackpack = false;
        load = true;
    }

    protected void paintComponent(Graphics g) {


        g.setFont(ComicSans);
        startingScreen(g);
        super.repaint();

        if (introScreen) {
            drawIntroScreen(g);
        }

        else {
            load = false;
            if (showBackpack) {backpack(g);}
            if (showAchivements) {achievement(g);}
            if (showAudio) {sound(g);}
            if (showSettings){setting(g);}
        }

       while (load){
           g.setColor(new Color(0x83838D));
           g.fillRect(0, 0, 5200, 5200);
           Clickables.draw(GM.getLoading(), g);
       }


    }

    public void startingScreen(Graphics g) {
        g.drawString("B", 45, 90); //backpack
        g.drawString("A", 160, 90);//achievement
        g.drawString("L", 1720, 90);//loudness
        g.drawString("S", 1820, 90);//setting

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
            if (Clickables.detectRectangle(TA.easy(), info)) {easy();}
            if (Clickables.detectRectangle(TA.medium(), info)) {medium();}
            if (Clickables.detectRectangle(TA.hard(), info)) {hard();}
        }
// right
        if (c.getButton() == 3) {
            System.out.println("Right click at " + info);
        }
    }

    public void achievement(Graphics achievement) {
            Clickables.draw(TextAndImage.openedAchievement(), achievement);
            achievement.setColor(new Color(0xC78F8F));
            achievement.setFont(CourierNew);
            achievement.drawString("Achievement", 170, 200);
    }

    public void sound(Graphics sound) {
            Clickables.draw(TextAndImage.openedSound(),sound);
            sound.setColor(new Color(0x98C497));
            sound.setFont(CourierNew);
            sound.drawString("Sound", 1200, 200);
    }

    public void setting(Graphics setting) {
            Clickables.draw(TextAndImage.openedSetting(), setting);
            setting.setColor(new Color(0xD296CA));
            setting.setFont(CourierNew);
            setting.drawString("setting", 1500, 200);
    }

    public void backpack(Graphics backpack) {
        Clickables.draw(TextAndImage.openedBackpack(), backpack);
        backpack.setColor(new Color(0x6969C6));
        backpack.setFont(CourierNew);
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
