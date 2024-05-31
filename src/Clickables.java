import java.awt.*;
/*class for only static methods, it will be called by both DrawPanel and ModePanel, also it will be a parent class for
Gonna add the keyboard movement into this. IF works;
* * Some classes that's only sprites. Maybe (might merge into classes) */

public class Clickables extends Rectangle {

    public static void draw(Rectangle r, Graphics g) {
        int x = (int) r.getX();
        int y = (int) r.getY();
        int height = (int) r.getHeight();
        int width = (int) r.getWidth();
        g.drawRect(x, y, width, height);
    }

    public static boolean detectRectangle(Rectangle r, Point mouse) {
        return (mouse.x >= r.x && mouse.x <= r.x + r.width) && (mouse.y >= r.y && mouse.y <= r.y + r.height);
    }



}



