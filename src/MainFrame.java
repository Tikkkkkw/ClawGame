import javax.swing.JFrame;

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private modePanel mode;
    private Thread windowThread;

    public MainFrame(String display) {
        super(display);
        int frameWidth = getMaximumSize().width;
        int frameHeight = getMaximumSize().height;
        p = new DrawPanel();
        this.add(p);
        if (!DrawPanel.intro()) {
        mode = new modePanel();
        this.add(mode);
        }
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
            p.repaint();
        }

    }
}



