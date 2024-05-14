import javax.swing.JLabel;
import java.awt.event.ActionListener;
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

    private JLabel easy = new JLabel("easy");
    private JLabel medium = new JLabel("medium");
    private JLabel hard = new JLabel("hard");


    public TextandImage() {

        int y = 20;
        int length = 80;
        Backpack = new Rectangle(30, y, length, length);
        Achievement = new Rectangle(150, y, length, length);
        Sound = new Rectangle(1810, y, length, length);
        Setting = new Rectangle(1700, y, length, length);

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


        String easyText = """
                **easy - 1 Claw. No time limit. 6 boxes.
                * In the same order -  the color of the box change. But the content doesn't
                Backpack - Empty, wallpaper, theme(of box), music tune, mini game(Achievement/text), lore(text)
                Grabbing first - achievement |The first of many|
                Finishing easy - achievement |THIS SEEMS EASY|
                Finishing mini game - achievement |What's this?|
                                
                unlocked music, and changing of themes/wallpaper
                By double-clicking in backpack. Or change in setting)
                """;

        String tutorialText = """
                *press left arrow key to move the claw left
                *press right arrow key to move the claw right
                *press space key to try to grab the reward
                
                (when grabbed)
                the contents will automatically be stored in the backpack.
                """;
    }

