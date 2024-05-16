import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Claw {
    private String imageFileName;
    private Image Image;
    public Claw(){
        imageFileName = "image/claw.jpg";
        Image = new ImageIcon(imageFileName).getImage();
        label();
    }
    public Image label(){
        return Image;
    }

    }

