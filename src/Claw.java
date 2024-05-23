import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/*Generates the Claw's images, and it's boarder and attributes and movements based on keyboard(or mouse)*/
public class Claw {
    private String imageFileName;
    private BufferedImage image;
    private Rectangle clawDetection;

    public Claw(){
        imageFileName = "image/claw";
        image = claw(imageFileName);
    }
    public BufferedImage claw (String imageFileName){
        try{
            BufferedImage i;
            i = ImageIO.read(new File(imageFileName));
            return i;
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }
    public BufferedImage getImage(){
        return image;
    }


}

