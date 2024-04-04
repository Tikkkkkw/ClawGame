import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Rectangle;
public class Boxed {
    private String type;
    private String color;
    private String imageFileName;
    private String solvedImageFileName;
    private boolean show;
    private BufferedImage image;
    private Rectangle cardBox;
    private boolean solved;

    public Boxed(String type , String color){
        this.type = type;
        this.color = color;
        this.imageFileName = "images/"+type+"_"+color;
        this.solvedImageFileName = "images/"+type+"_"+color+"_open";
        show = true;
//        this.image = readImage();
        this.cardBox = new Rectangle(-100,-100,image.getWidth(),image.getHeight());
        this.solved = false;

    }

    public String getType() {return type;}

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

    public BufferedImage getImage() {
        return image;
    }

    public Rectangle getCardBox() {
        return cardBox;
    }

    public boolean isSolved() {
        return solved;
    }

    public BufferedImage readImage() {
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
        String [] type = {"empty","music","wallpaper","themes","game"};
        String [] color = {"red", "yellow", "green", "blue", "purple", "black"};
        for (String content :type){
                for (String c : color){
                    for (int t = 0; t < 2; t++){
                    Boxed b = new Boxed(content, color[t]);
                    box.add(b);
                }
            }
        }

        return box;
    }



}
