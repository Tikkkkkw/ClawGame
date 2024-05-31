import javax.swing.JFrame;
/*Frames, that shifts which one of the panels is opened, and which one are closed. */

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private ModePanel mode;
    private Thread windowThread;

    public MainFrame(String display) {
        super(display);
        int frameWidth = getMaximumSize().width;
        int frameHeight = getMaximumSize().height;

        p = new DrawPanel();
        this.add(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(frameWidth, frameHeight);
        this.setLocation(0, 0);
        this.setVisible(true);
        this.setResizable(false);
        startThread();

    }

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



