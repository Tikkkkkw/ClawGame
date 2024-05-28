import java.awt.*;
import java.awt.image.BufferedImage;
/*All the texts for the game, and the sprite creation and detection.
* Might merge into the individual classes */
public class TextAndImage {
    private Rectangle Backpack;
    private Rectangle Achievement;
    private Rectangle Setting;
    private Rectangle Sound;
    private static Rectangle BackpackCalled;
    private static Rectangle AchievementCalled;
    private static Rectangle SettingCalled;
    private static Rectangle SoundCalled;
    private Rectangle easy;
    private Rectangle medium;
    private Rectangle hard;
    private String imageFileName;
    private BufferedImage image;
    private Claw claw;


    public TextAndImage() {

        int y = 20;
        int length = 80;
        easy = new Rectangle(250, 200, 335, 80);
        medium = new Rectangle(250, 400, 335, 80);
        hard = new Rectangle(250, 600, 335, 80);

        Backpack = new Rectangle(30, y, length, length);
        Achievement = new Rectangle(150, y, length, length);
        Sound = new Rectangle(1810, y, length, length);
        Setting = new Rectangle(1700, y, length, length);

        BackpackCalled = new Rectangle(70,50,500,300);
        AchievementCalled = new Rectangle(200, 50, 500, 300);
        SoundCalled = new Rectangle(1100, 50, 500, 300);
        SettingCalled = new Rectangle(1400, 50, 500, 300);
        this.imageFileName = "image/claw";

    }
    public Rectangle easy() {return easy;}

    public Rectangle medium() {return medium;}

    public Rectangle hard() {return hard;}

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

    public static Rectangle openedBackpack(){
        return BackpackCalled;
    }
    public static Rectangle openedAchievement(){
        return AchievementCalled;
    }
    public static Rectangle openedSound(){
        return SoundCalled;
    }
    public static Rectangle openedSetting(){
        return SettingCalled;
    }




    public void closeInto(){
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

