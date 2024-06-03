import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* Generates the box's images and sets the boarder and other box attributes. */
public class Boxed {
    private String mode;
    private String type;
    private String color;
    private String imageFileName;
    private String solvedImageFileName;
    private BufferedImage image;
    private boolean solved;

    public Boxed(String mode, String color, String type){
        this.mode = mode;
        this.color = color;
        this.type = type;
        this.solvedImageFileName = "image/_open";
        this.solved = false;
    }



    public void easyBoxImage() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        for (int i = 0; i < easyGetBox().size(); i++) {
            image = loadimage(String.valueOf(easyGetBox().get(i)));
            images.add(image);
        }
    }

    public static ArrayList<Boxed> easyGetBox() {
        ArrayList<Boxed> box = new ArrayList<Boxed>();
        String [] type = {"empty","music","wallpaper","themes","game", "lore"};
        String [] color = {"red", "yellow", "green", "blue", "purple", "black"};
        for (int t =  0; t < color.length; t++){
            Boxed b = new Boxed("easy",color[t], type[t] );
            box.add(b);
        }
        return box;


    }


    public BufferedImage loadimage(String imageFileName) {
        try {
            BufferedImage image;
                image = ImageIO.read(new File(imageFileName));
                return image;
            }
        catch (IOException e) {
            System.out.println(e);
            return null;
        }


    }



    // All working for easy, the easy boxes have their content set. An box class maybe be added with booleans to keep track of the contents -  to represent different part of the game play.
    public String toString(){

        return mode + " " + type + " " + color+ "\n"+
                imageFileName+"\n";
    }






}
