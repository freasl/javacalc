import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * GUI for calculator app using Swing.
 *
 * @author Fredrik Åslund
 * @version 2021-03-15
 */
public class Calc implements ActionListener {
    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JTextField display;
    JButton button_1,button_2,button_3,button_4,button_5,button_6,button_7,
            button_8,button_9,button_10,button_c,button_ac,button_plus,
            button_minus,button_multiply,button_divide,button_delete;
    
    /*
     * Constructor setting up the GUI
     */
    public Calc() {
        frame = new JFrame();
        panel = new JPanel();
        display = new JTextField();
        button_1 = new JButton("Click me!");
        button_2 = new JButton("2");
        button_3 = new JButton("3");
        button_4 = new JButton("fyra");

        button_1.addActionListener(this);
         
        label = new JLabel("Number of clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.setLayout(new GridLayout(3,4));
        panel.add(display);
        panel.add(button_1);

        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("El calculatore");
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    /*
     * Override from ActionListener
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }

    /*
     * Main method
     */
    public static void main(String[] args) {
        Calc cal = new Calc();
        cal.frame.setSize(270,375);
    }
}
