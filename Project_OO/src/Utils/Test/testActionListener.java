package Utils.Test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testActionListener{
    //////
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Miau");
        JFrame frame = new JFrame();
        JTextField select = new JTextField(20);
        String miau = "hola";
        //select.addActionListener(new AbstractAction() {
            //public void actionPerformed (ActionEvent e) {
            //System.out.println(select.getText());
            //}
        //});

        select.addKeyListener(
            new KeyListener() {
                public void keyTyped(KeyEvent e) {
                }
                public void keyPressed(KeyEvent e) {
                }
                public void keyReleased(KeyEvent e) {
                    System.out.println(select.getText());
                    if (miau.equals(select.getText()))
                        System.out.println("Toma");
                }
            });

        panel.add(label);
        panel.add(select);
        frame.add(panel);
        
           
        JOptionPane.showMessageDialog(frame.getContentPane(), panel, "nia", JOptionPane.CANCEL_OPTION);
    }

    }

  