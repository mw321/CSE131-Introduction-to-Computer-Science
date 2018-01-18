package scraping;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import sedgewick.StdDraw;

public class Swing {

	public static void main(String[] args) {
		// Creating instance of JFrame
        JFrame frame = new JFrame("Where to eat?");
        // Setting the width and height of frame
        frame.setSize(460, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Creating panel. This is same as a div tag in HTML
         * We can create several panels and add them to specific 
         * positions in a JFrame. Inside panels we can add text 
         * fields, buttons and other components.
         */
        JPanel panel = new JPanel();    
        // adding panel to frame
        frame.add(panel);
        /* calling user defined method for adding components
         * to the panel.
         */
        placeComponents(panel);
        // Setting the frame visibility to true
        frame.setVisible(true);
	}
	private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
      
        JButton duc = new JButton("DUC");
        duc.setBounds(50, 50, 100, 50);
        panel.add(duc);
        duc.addActionListener(null);

        JButton bd = new JButton("BD");
        bd.setBounds(180, 50, 100, 50);
        panel.add(bd);
        
        JButton cafe = new JButton("cafe");
        cafe.setBounds(310, 50, 100, 50);
        panel.add(cafe);
	}
	


}
