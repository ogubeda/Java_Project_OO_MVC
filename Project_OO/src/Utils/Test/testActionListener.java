package Utils.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testActionListener implements KeyListener {
    //////

    public JTextField getTestPls() {
        JTextField select = new JTextField();
        select.addKeyListener(this);
        return select;
    }
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Miau");
        JFrame frame = new JFrame();
        JTextField select = new JTextField(20);
        panel.add(label);
        panel.add(select);
        frame.add(panel);
        // select.addActionListener(new ActionListener() {
        // public void actionPerformed (ActionEvent e) {
        // String hola = select.getKeyListeners();
        // System.out.println(e);
        // }
        // });
        select.addKeyListener(this);
        JOptionPane.showMessageDialog(frame.getContentPane(), panel, "nia", JOptionPane.CANCEL_OPTION);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
	public void keyReleased(KeyEvent e) {
        }
    }

  