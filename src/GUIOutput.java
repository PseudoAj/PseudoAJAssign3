import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;


public class GUIOutput extends JFrame {

	private JPanel contentPane;
	private JTextField txtOutput;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

	
	public GUIOutput(String output) {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOutput = new JTextField();
		txtOutput.setCaretColor(Color.BLUE);
		txtOutput.setBorder(null);
		txtOutput.setText("OUTPUT");
		txtOutput.setBounds(12, 13, 116, 22);
		contentPane.add(txtOutput);
		txtOutput.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(22, 48, 410, 204);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(output);
		setVisible(true);

	}

}
