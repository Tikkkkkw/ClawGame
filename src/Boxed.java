import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.util.Objects;


public class Boxed {
    private String mode;
    private String type;
    private String color;
    private String imageFileName;
    private String solvedImageFileName;
    private boolean show;
    private BufferedImage image;
    private Rectangle cardBox;
    private boolean solved;


    public Boxed(String mode , String color, String type){
        this.mode = mode;
        this.color = color;
        this.type = type;
        this.imageFileName = "image/"+mode+"_"+color;
        this.solvedImageFileName = "image/_open";
        show = true;
//        this.image = readImage();
//        this.cardBox = new Rectangle(-100,-100,image.getWidth(),image.getHeight());
        this.solved = false;


    }


    public String getMode() {return mode;}


    public String getColor() {
        return color;
    }


    public void setRectangleLocation(int x, int y) {
        cardBox.setLocation(x, y);
    }


    public String getImageFileName() {
        return imageFileName;
    }


    public String getSolvedImageFileName() {
        return solvedImageFileName;
    }


    public boolean isShow() {
        return show;
    }




    public Rectangle getCardBox() {
        return cardBox;
    }


    public boolean isSolved() {
        return solved;
    }


    public BufferedImage image() {
        try {
            BufferedImage image;
            if (show) {
                image = ImageIO.read(new File(imageFileName));
            }
            else {
                image = ImageIO.read(new File(solvedImageFileName));
            }
            return image;
        }
        catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }
    public static ArrayList<Boxed> getBox() {
        ArrayList<Boxed> box = new ArrayList<Boxed>();
        String [] type = {"empty","music","wallpaper","themes","game", "lore"};
        String [] color = {"red", "yellow", "green", "blue", "purple", "black"};
        for (int t =  0; t < color.length; t++){
            Boxed b = new Boxed("easy", color[t], type[t] );
            box.add(b);
        }
        for (Boxed b: box){
            System.out.println(b);
        }
        return box;


    }


    // All working for easy, the easy boxes have their content set. An box class maybe be added with booleans to keep track of the contents -  to represent different part of the game play.
    public String toString(){




        return mode + " " + type + " " + color+ "\n"+
                imageFileName+"\n";


    }






}
