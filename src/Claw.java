import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/*Generates the Claw's images, and it's boarder and attributes and movements based on keyboard(or mouse)*/
public class Claw {
    private boolean closeClaw;
    ArrayList<String> sets = new ArrayList<String>();
    private BufferedImage Claw_Open;
    private BufferedImage claw_Close;
    private final String ORIGINAL_CLAW = "image/claw.png";
    private String ORIGINAL_CLOSE;
    private int direction;
    private int X_Placement;
    private int Y_Placement;
    private final Rectangle claw = new Rectangle (X_Placement,Y_Placement,20,40);

    public Claw(int X, int Y){
        Claw_Open = loadImage(ORIGINAL_CLAW);
        setSets();
        clawSkins("");
        X_Placement = X;
        Y_Placement = Y;

    }
    public void clawSkins(String skins){
        if (skins.equals("RedScape")){
            Claw_Open = loadImage("image/Red.png");
            claw_Close = loadImage("image/Red_Close.png");
        }
//        up
        int speed = 5;
        if(direction==1)
        {
            Y_Placement-= 20;
        }
        if(direction==2)
        {
            X_Placement+= 20;
        }
//        left
        if(direction==3)
        {
            X_Placement-= 20;
        }
    }
    private void setSets(){
        sets.add("RedScape");
    }
    public void setDirection(int direction){this.direction = direction;}

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

