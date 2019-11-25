package Utils.Test;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class test {

	public static void main(String[] args) {
		ArrayList<String> modelList = new ArrayList<String>();
		JFrame frame = new JFrame("Flow Layout");
		JTextField select = new JTextField(20);
		
		JComboBox<String> modelsBox = new JComboBox<String>(modelList.toArray(new String[0]));
		select.addKeyListener(
            new KeyListener() {
                public void keyTyped(KeyEvent e) {
                }
                public void keyPressed(KeyEvent e) {
                }
                public void keyReleased(KeyEvent e) {
					modelList.clear();
					modelList.add(select.getText());
					System.out.println(select.getText());
					for (int i = 0; i < modelList.size(); i++){
						modelsBox.removeAllItems();
						modelsBox.addItem(modelList.get(i).toString());
					}
                }
			});
		select.setSize(20,20);
		modelsBox.setSize(200, modelsBox.getPreferredSize().height);
		frame.setTitle("Testing");
		frame.setSize(300,200);
		frame.add(select);
		frame.add(modelsBox);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		//frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}// end_main
}// end_test
