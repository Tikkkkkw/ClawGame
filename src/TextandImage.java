import javax.swing.JLabel;

public class TextandImage{

    private JLabel easy = new JLabel("easy");
    private JLabel medium = new JLabel("medium");
    private JLabel hard = new JLabel("hard");

    public String easy() {
        return easy.getText();
    }


    public String medium() {
        return medium.getText();
    }


    public String hard() {
        return hard.getText();
    }


    public void closeInto(){
        easy = null;
        medium = null;
        hard = null;
    }




}
