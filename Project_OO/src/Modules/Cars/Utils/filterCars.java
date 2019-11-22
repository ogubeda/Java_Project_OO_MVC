package Modules.Cars.Utils;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Modules.Cars.Classes.*;

public class filterCars {
    //////
    private static ArrayList<Integer> posList = new ArrayList<Integer>();
    private static ArrayList<String> modelList = new ArrayList<String>();
    //////
    public static int filterAllElectric(ArrayList<Electric> engineList) {
        //////
        int select = 0, returnedValue = 0;
        String[] options = {"Continue", "Back"};
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Testing");
        JLabel label = new JLabel("Introduce the words for seaching: ");
        JTextField text = new JTextField(20);
        //////
        /////
        
        for (int i = 0; i < engineList.size(); i++) {
            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
            posList.add(i);
        }// end_for
        JComboBox<String> modelsBox = new JComboBox<String>(modelList.toArray(new String[0]));
        text.addKeyListener(
            new KeyListener() {
                public void keyTyped(KeyEvent e) {
                }
                public void keyPressed(KeyEvent e) {
                }
                public void keyReleased(KeyEvent e) {
                    modelsBox.removeAllItems();
                    posList.clear();
                    for (int i = 0; i < engineList.size(); i++) {
                        if (engineList.get(i).getBrand().equals(text.getText())) {
                            modelsBox.addItem(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }
                    }// end_for
                    if (text.getText().equals("")) {
                        for (int i = 0; i < engineList.size(); i++) {
                                modelsBox.addItem(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                                posList.add(i);
                        }// end_for
                    }
                }
            });
        panel.add(label);
        panel.add(text);
        panel.add(modelsBox);
        frame.add(panel);
        //frame.setVisible(true);
        select = JOptionPane.showOptionDialog(frame.getContentPane(), panel, "Hio", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        returnedValue = posList.get(select);
        
        //////
        return returnedValue;
    }// end_filterAll
    //////
    /////

}// end_filterCars