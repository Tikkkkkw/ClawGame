import javax.swing.JLabel;

public class TextandImage{

    private JLabel easy = new JLabel("easy");
    private JLabel medium = new JLabel("medium");
    private JLabel hard = new JLabel("hard");

    public JLabel easy() {return easy;
    }


//    public JLabel medium() {
//        return medium;
//    }
//
//
//    public JLabel hard() {
//        return hard;
//    }


    public void closeInto(){
        easy = new JLabel("");
        medium = new JLabel("");
        hard = new JLabel("");
    }




}
