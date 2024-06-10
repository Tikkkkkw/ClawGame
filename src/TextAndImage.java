import java.awt.*;

/*All the texts for the game, and the sprite creation and detection.
* Might merge into the individual classes */
public class TextAndImage {
    private Rectangle backpack;
    private Rectangle achievement;
    private Rectangle setting;
    private Rectangle sound;
    private static Rectangle backpackCalled;
    private static Rectangle achievementCalled;
    private static Rectangle settingCalled;
    private static Rectangle soundCalled;
    private Rectangle easy;
    private Rectangle medium;
    private Rectangle hard;

    public TextAndImage() {

        int y = 20;
        int length = 80;
        easy = new Rectangle(250, 200, 335, 80);
        medium = new Rectangle(250, 400, 335, 80);
        hard = new Rectangle(250, 600, 335, 80);

        backpack = new Rectangle(30, y, length, length);
        achievement = new Rectangle(150, y, length, length);
        sound = new Rectangle( 270, y, length, length);
        setting = new Rectangle( 390, y, length, length);

        backpackCalled = new Rectangle(70,50,500,300);
        achievementCalled = new Rectangle(200, 50, 500, 300);
        soundCalled = new Rectangle(340, 50, 500, 300);
        settingCalled = new Rectangle(480, 50, 500, 300);

    }
    public Rectangle easy() {return easy;}

    public Rectangle medium() {return medium;}

    public Rectangle hard() {return hard;}

    public Rectangle backpack() {
        return backpack;
    }
    public Rectangle achievement() {
        return achievement;
    }
    public Rectangle sound() {
        return sound;
    }
    public Rectangle setting() {
        return setting;
    }

    public static Rectangle openedBackpack(){
        return backpackCalled;
    }
    public static Rectangle openedAchievement(){
        return achievementCalled;
    }
    public static Rectangle openedSound(){
        return soundCalled;
    }
    public static Rectangle openedSetting(){
        return settingCalled;
    }

    public void startingScreen(Graphics g) {
        g.drawString("B", 45, 90); //backpack
        g.drawString("A", 160, 90);//achievement
        g.drawString("L", 280, 90);//loudness
        g.drawString("S", 410, 90);//setting

        Clickables.draw(backpack(), g);
        Clickables.draw(achievement(), g);
        Clickables.draw(setting(), g);
        Clickables.draw(sound(), g);

    }


        public String gameHints(){
        int i ;
        String [] hints = {"SD","the mouse doesnt work in game","Good Luck", "Sleppy times"};
        return null;
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

