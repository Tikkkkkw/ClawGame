import javax.swing.JLabel;
import java.awt.*;


public class TextandImage{
    private final Rectangle Backpack;
    private final Rectangle Achievement;
    private final Rectangle Setting;
    private final Rectangle Sound;


    private JLabel easy = new JLabel("easy");
    private JLabel medium = new JLabel("medium");
    private JLabel hard = new JLabel("hard");


    public JLabel easy() {return easy;
    }
    public TextandImage() {
        Backpack = new Rectangle(20, 10, 50, 50);
        Achievement = new Rectangle(80, 10, 50, 50);
        Sound = new Rectangle(855, 10, 50, 50);
        Setting = new Rectangle(915, 10, 50, 50);
    }


    public Rectangle backpack() {
        return Backpack;
    }
    public Rectangle achievement() {
        return Achievement;
    }
    public Rectangle sound() {
        return Sound;
    }
    public Rectangle setting() {
        return Setting;
    }


    public void closeInto(){
        easy = new JLabel("");
        medium = new JLabel("");
        hard = new JLabel("");
    }








}
