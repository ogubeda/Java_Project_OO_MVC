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
                        if (compareDataE(text.getText(), engineList.get(i))) {
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
                    if (modelsBox.getItemCount() == 0)
                        modelsBox.addItem("No Matches");
                }
            });
        panel.add(label);
        panel.add(text);
        panel.add(modelsBox);
        frame.add(panel);
        //frame.setVisible(true);
        select = JOptionPane.showOptionDialog(frame.getContentPane(), panel, "Hio", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if ((select == 0) && (modelsBox.getSelectedItem().equals("No Matches")))
            returnedValue = -2;
        else if (select == 0)
            returnedValue = posList.get(modelsBox.getSelectedIndex());
        else
            returnedValue = -1;
        //////
        return returnedValue;
    }// end_filterAll
    //////
    /////

    public static boolean compareDataE(String sendedText, Cars sendedCar) {
        //////
        boolean check = false;
        String cadBrand = "", cadModel = "";
        //////
        /////
       
        if (sendedText.length() <= sendedCar.getBrand().length()){
            for (int i = 0; i < sendedText.length(); i++) {
                cadBrand = cadBrand + sendedCar.getBrand().toLowerCase().charAt(i);
            }
        }
        if (sendedText.length() <= sendedCar.getModel().length()) {
            for (int i = 0; i < sendedText.length(); i++) {
                cadModel = cadModel + sendedCar.getModel().toLowerCase().charAt(i);
            }
        }
        if ((sendedText.toLowerCase().equals(cadBrand)) || (sendedText.toLowerCase().equals(cadModel))) {
            check = true;
        }else
            check = false;
        //////
        
        return check;
    }// end_compareData

}// end_filterCars