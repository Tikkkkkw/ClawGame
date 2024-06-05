import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/*Generates the Claw's images, and it's boarder and attributes and movements based on keyboard(or mouse)*/
public class Claw {
    private boolean closeClaw;
    ArrayList<String> sets = new ArrayList<String>();
    private BufferedImage Claw_Open;
    private BufferedImage claw_Close;
    private String ORIGINAL_CLAW = "image/claw.png";
    private String ORIGINAL_CLOSE;

    public Claw(){
        Claw_Open = loadImage(ORIGINAL_CLAW);
        setSets();
        clawSkins("");
    }
    public void clawSkins(String skins){
        if (skins.equals("RedScape")){
            Claw_Open = loadImage("image/Red.png");
            claw_Close = loadImage("image/Red_Close.png");
        }
    }
    private void setSets(){
        sets.add("RedScape");
    }


    public BufferedImage loadImage (String imageFileName){
        try{
            BufferedImage image;
            image = ImageIO.read(new File(imageFileName));
            return image;
        }
        catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }
    public BufferedImage getOpenImage(){return Claw_Open;}
    public BufferedImage getCloseImage(){return claw_Close;}

}

