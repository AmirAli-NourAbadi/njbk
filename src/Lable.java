import javax.swing.*;

public class Lable extends JLabel {
    JLabel label;
    Lable() {
        label = new JLabel("Hello");
        label.setBounds(20 ,30,50,50);
    }

    public JLabel getLabel() {
        return label;
    }
}
