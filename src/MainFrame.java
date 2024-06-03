import javax.swing.JFrame;
/*Frames, that shifts which one of the panels is opened, and which one are closed. */

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private ModePanel mode;
    private Thread windowThread;
    private final int Width = getMaximumSize().width;
    private final int Height = getMaximumSize().height;
//    private static final int FrameWidth = 0;
//    private static final int FrameHeight = 0;

    public MainFrame(String display) {
        super(display);
        int frameWidth = Width;
        int frameHeight = Height;

        p = new DrawPanel();
        this.add(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(frameWidth, frameHeight);
        this.setLocation(0, 0);
        this.setVisible(true);
        this.setResizable(false);
        startThread();

    }
//    public static int getFrameWidth(){return FrameWidth;}
//    public static int getFrameHeight(){return FrameHeight;}
    public void startThread() {
        windowThread = new Thread(this);
        windowThread.start();
    }


    public void run() {
        while (true) {
            if (GameMode.getModeValue() <= 0) {
                p.repaint();
            }
            if (GameMode.getModeValue() > 0){
                mode = new ModePanel();
                this.add(mode);
                p.setVisible(false);
                mode.setVisible(true);
                while (mode.game()){
                    mode.repaint();
                }
            }
        }
    }
}



