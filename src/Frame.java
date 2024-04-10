import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    JFrame frame;

    Frame() {
        frame = new JFrame("AmirAli");
        final JTextField jTextField = new JTextField("Hello",2);
        jTextField.setBounds(400,200,200,50);
        frame.add(jTextField);
        frame.setSize(1400,768);
        JButton button = new JButton(new ImageIcon("C:\\Users\\Amir Ali\\IdeaProjects\\untitled1\\src\\register.png"));
        frame.add(new Lable().getLabel());
        button.setBounds(600,375,600,500);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(button.getText().equals("Fuck")){
                    button.setText("Click Me");
                }else {
                    button.setBackground(Color.BLUE);
                    button.setText("Fuck");
                }

            }
        });
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
    }
}
