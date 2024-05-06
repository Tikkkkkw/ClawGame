import javax.swing.JLabel;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;


public class TextandImage{
    private final Rectangle Backpack;
    private final Rectangle Achievement;
    private final Rectangle Setting;
    private final Rectangle Sound;
    private String imageFileName;
    private BufferedImage image;
    private int y = 20;
    private int length = 80;


    private JLabel easy = new JLabel("easy");
    private JLabel medium = new JLabel("medium");
    private JLabel hard = new JLabel("hard");


    public JLabel easy() {return easy;
    }
    public TextandImage() {

        Backpack = new Rectangle(30, y, length,length);
        Achievement = new Rectangle(150,  y, length,length);
        Sound = new Rectangle(1810,  y, length,length);
        Setting = new Rectangle(1700,  y, length,length);

        this.imageFileName = "image/claw";

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
