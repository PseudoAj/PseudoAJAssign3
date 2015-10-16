/*
 * This class is responsible for taking the inputs from the users and passing on to the DataCeter
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;


public class GUITakeInput extends JFrame {

	private JPanel contentPane;
	private JTextField txtRectangleOverlapArea;
	private JTextField txtRectangle;
	private JTextField txtCenterx;
	private JTextField txtCenterz;
	private JTextField txtCentery;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JSeparator separator_1;
	private JTextField txtRectangle_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_14;
	private JTextField textField_15;
	private JSeparator separator_2;

	/**
	 * Create the frame.
	 */
	public GUITakeInput() {
		setForeground(Color.BLUE);
		setType(Type.UTILITY);
		setTitle("PseudoAJA3");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRectangleOverlapArea = new JTextField();
		txtRectangleOverlapArea.setBorder(null);
		txtRectangleOverlapArea.setEditable(false);
		txtRectangleOverlapArea.setForeground(Color.BLUE);
		txtRectangleOverlapArea.setBackground(Color.WHITE);
		txtRectangleOverlapArea.setBounds(5, 5, 422, 22);
		txtRectangleOverlapArea.setText("Rectangle Overlap Area Calculation");
		contentPane.add(txtRectangleOverlapArea);
		txtRectangleOverlapArea.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLUE);
		separator.setBackground(Color.WHITE);
		separator.setBounds(0, 40, 482, 2);
		contentPane.add(separator);
		
		txtRectangle = new JTextField();
		txtRectangle.setBorder(null);
		txtRectangle.setForeground(Color.BLUE);
		txtRectangle.setBackground(Color.WHITE);
		txtRectangle.setEditable(false);
		txtRectangle.setText("Rectangle 1");
		txtRectangle.setBounds(10, 40, 116, 22);
		contentPane.add(txtRectangle);
		txtRectangle.setColumns(10);
		
		txtCenterx = new JTextField();
		txtCenterx.setBorder(null);
		txtCenterx.setForeground(Color.BLUE);
		txtCenterx.setBackground(Color.WHITE);
		txtCenterx.setEditable(false);
		txtCenterx.setText("CenterX");
		txtCenterx.setBounds(10, 81, 116, 22);
		contentPane.add(txtCenterx);
		txtCenterx.setColumns(10);
		
		txtCenterz = new JTextField();
		txtCenterz.setBorder(null);
		txtCenterz.setForeground(Color.BLUE);
		txtCenterz.setBackground(Color.WHITE);
		txtCenterz.setEditable(false);
		txtCenterz.setText("CenterZ");
		txtCenterz.setColumns(10);
		txtCenterz.setBounds(266, 81, 116, 22);
		contentPane.add(txtCenterz);
		
		txtCentery = new JTextField();
		txtCentery.setBorder(null);
		txtCentery.setForeground(Color.BLUE);
		txtCentery.setBackground(Color.WHITE);
		txtCentery.setEditable(false);
		txtCentery.setText("CenterY");
		txtCentery.setColumns(10);
		txtCentery.setBounds(138, 81, 116, 22);
		contentPane.add(txtCentery);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(10, 116, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLUE);
		textField_1.setBounds(138, 116, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLUE);
		textField_2.setBounds(266, 116, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLUE);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(0, 221, 482, 2);
		contentPane.add(separator_1);
		
		txtRectangle_1 = new JTextField();
		txtRectangle_1.setBorder(null);
		txtRectangle_1.setForeground(Color.BLUE);
		txtRectangle_1.setBackground(Color.WHITE);
		txtRectangle_1.setText("Rectangle 2");
		txtRectangle_1.setEditable(false);
		txtRectangle_1.setColumns(10);
		txtRectangle_1.setBounds(10, 221, 116, 22);
		contentPane.add(txtRectangle_1);
		
		textField_4 = new JTextField();
		textField_4.setBorder(null);
		textField_4.setForeground(Color.BLUE);
		textField_4.setBackground(Color.WHITE);
		textField_4.setText("CenterX");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(10, 262, 116, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBorder(null);
		textField_5.setForeground(Color.BLUE);
		textField_5.setBackground(Color.WHITE);
		textField_5.setText("CenterY");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(138, 262, 116, 22);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBorder(null);
		textField_6.setForeground(Color.BLUE);
		textField_6.setBackground(Color.WHITE);
		textField_6.setText("CenterZ");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(266, 262, 116, 22);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.BLUE);
		textField_7.setColumns(10);
		textField_7.setBounds(10, 297, 116, 22);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setForeground(Color.BLUE);
		textField_8.setColumns(10);
		textField_8.setBounds(138, 297, 116, 22);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setForeground(Color.BLUE);
		textField_9.setColumns(10);
		textField_9.setBounds(266, 297, 116, 22);
		contentPane.add(textField_9);
		
		txtWidth = new JTextField();
		txtWidth.setBorder(null);
		txtWidth.setForeground(Color.BLUE);
		txtWidth.setBackground(Color.WHITE);
		txtWidth.setText("Width");
		txtWidth.setEditable(false);
		txtWidth.setColumns(10);
		txtWidth.setBounds(10, 151, 116, 22);
		contentPane.add(txtWidth);
		
		txtHeight = new JTextField();
		txtHeight.setBorder(null);
		txtHeight.setForeground(Color.BLUE);
		txtHeight.setBackground(Color.WHITE);
		txtHeight.setText("Height");
		txtHeight.setEditable(false);
		txtHeight.setColumns(10);
		txtHeight.setBounds(138, 151, 116, 22);
		contentPane.add(txtHeight);
		
		textField_12 = new JTextField();
		textField_12.setForeground(Color.BLUE);
		textField_12.setColumns(10);
		textField_12.setBounds(10, 186, 116, 22);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setForeground(Color.BLUE);
		textField_13.setColumns(10);
		textField_13.setBounds(138, 186, 116, 22);
		contentPane.add(textField_13);
		
		textField_10 = new JTextField();
		textField_10.setBorder(null);
		textField_10.setForeground(Color.BLUE);
		textField_10.setBackground(Color.WHITE);
		textField_10.setText("Width");
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(10, 332, 116, 22);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBorder(null);
		textField_11.setForeground(Color.BLUE);
		textField_11.setBackground(Color.WHITE);
		textField_11.setText("Height");
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(138, 332, 116, 22);
		contentPane.add(textField_11);
		
		textField_14 = new JTextField();
		textField_14.setForeground(Color.BLUE);
		textField_14.setColumns(10);
		textField_14.setBounds(10, 367, 116, 22);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setForeground(Color.BLUE);
		textField_15.setColumns(10);
		textField_15.setBounds(138, 367, 116, 22);
		contentPane.add(textField_15);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLUE);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(0, 402, 482, 2);
		contentPane.add(separator_2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//On clicking calculate we will do:
				//1. Set the values for other classes to parse and use them
				//for Call for the Calculation logic
				try
				{
					int R1x=Integer.parseInt(textField.getText());
					int R1y=Integer.parseInt(textField_1.getText());
					int R1z=Integer.parseInt(textField_2.getText());
					int R1w=Integer.parseInt(textField_12.getText());
					int R1h=Integer.parseInt(textField_13.getText());
					
					int R2x=Integer.parseInt(textField_7.getText());
					int R2y=Integer.parseInt(textField_8.getText());
					int R2z=Integer.parseInt(textField_9.getText());
					int R2w=Integer.parseInt(textField_14.getText());
					int R2h=Integer.parseInt(textField_15.getText());
					
					System.out.println(R1x+"\t"+R1y+"\t"+R1z+"\t"+R1w+"\t"+R1h);
					System.out.println(R2x+"\t"+R2y+"\t"+R2z+"\t"+R2w+"\t"+R2h);
					
					DataCenter thisData=new DataCenter(R1x,R1y,R1z,R1w,R1h,R2x,R2y,R2z,R2w,R2h);
					dispose();
				}
				catch(Exception myEx)
				{
					myEx.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(385, 415, 97, 37);
		contentPane.add(btnNewButton);
	}
}
