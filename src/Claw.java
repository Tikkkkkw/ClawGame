import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/*Generates the Claw's images, and it's boarder and attributes and movements based on keyboard(or mouse)*/
public class Claw {

    private BufferedImage original;
    private String ORIGINAL_CLAW = "image/claw.png";
    public Claw(){
        original = loadImage(ORIGINAL_CLAW);
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

    public BufferedImage getImage(){return original;}

}

