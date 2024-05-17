import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Claw {
    private String imageFileName;
    private BufferedImage image;

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

