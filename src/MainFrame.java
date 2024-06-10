import javax.swing.JFrame;
/*Frames, that shifts which one of the panels is opened, and which one are closed. */

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel P;
    private ModePanel Mode;
    private Thread WindowThread;
    private final int Width = getMaximumSize().width;
    private final int Height = getMaximumSize().height;


    public MainFrame(String display) {
        super(display);

        P = new DrawPanel();
        this.add(P);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Width, Height);
        this.setLocation(0, 0);
        this.setVisible(true);
        this.setResizable(false);
        startThread();

    }
    public void startThread() {
        WindowThread = new Thread(this);
        WindowThread.start();
    }


    public void run() {
        while (true) {
            if (GameMode.getModeValue() <= 0) {
                P.repaint();
            }
            if (GameMode.getModeValue() > 0){
                Mode = new ModePanel();
                this.add(Mode);
                P.setVisible(false);
                Mode.setVisible(true);
                while (Mode.game()){
                    Mode.repaint();
                }
            }
        }
    }
}



