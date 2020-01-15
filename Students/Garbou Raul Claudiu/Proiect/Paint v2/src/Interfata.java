import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.Graphics;

public class Interfata {

	private JFrame frame;
	private JTextField txtIntroducetiText;
	private JLabel lblMarime;
	private JSpinner spinner;
	private JCheckBox chckbxBold;
	private JButton btnNewButton;
	private JTextField txtCoordonateX;
	private JTextField txtCoordonateY;
	private JTextField txtLatime;
	private JTextField txtInaltime;
	private JComboBox comboBox;
	private JTextField txtGrosime;
	private JButton btnNewButton_1;
	private JComboBox comboBox_1;
	private Canvas canvas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfata window = new Interfata();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfata() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.CYAN);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 998, 686);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtIntroducetiText = new JTextField();
		txtIntroducetiText.setText("Introduceti Text");
		frame.getContentPane().add(txtIntroducetiText);
		txtIntroducetiText.setColumns(10);
		
		lblMarime = new JLabel("Marime");
		frame.getContentPane().add(lblMarime);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		frame.getContentPane().add(spinner);
		
		chckbxBold = new JCheckBox("Bold");
		frame.getContentPane().add(chckbxBold);
		
		btnNewButton = new JButton("Write");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String sizeString = (String) txtIntroducetiText.getSelectedText();
				 int size = (Integer) spinner.getValue();
				 Boolean Boldit = chckbxBold.isSelected();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		txtCoordonateX = new JTextField();
		txtCoordonateX.setText("Coordonate X");
		frame.getContentPane().add(txtCoordonateX);
		txtCoordonateX.setColumns(10);
		
		txtCoordonateY = new JTextField();
		txtCoordonateY.setText("Coordonate Y");
		frame.getContentPane().add(txtCoordonateY);
		txtCoordonateY.setColumns(10);
		
		txtLatime = new JTextField();
		txtLatime.setText("Latime");
		frame.getContentPane().add(txtLatime);
		txtLatime.setColumns(10);
		
		txtInaltime = new JTextField();
		txtInaltime.setText("Inaltime");
		frame.getContentPane().add(txtInaltime);
		txtInaltime.setColumns(10);
		
		comboBox = new JComboBox(new String[]{"Patrat", "Dreptunghi","Cerc"});
		frame.getContentPane().add(comboBox);
		
		txtGrosime = new JTextField();
		txtGrosime.setText("Grosime");
		frame.getContentPane().add(txtGrosime);
		txtGrosime.setColumns(10);
		
		comboBox_1 = new JComboBox(new String[]{"Negru","Alb","Albastru","Verde","Rosu"});
		frame.getContentPane().add(comboBox_1);
		
		btnNewButton_1 = new JButton("Create");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String XplaceString = (String) txtCoordonateX.getSelectedText();
				 int Xplace = Integer.parseInt(XplaceString);
				 
				 String YplaceString = (String) txtCoordonateY.getSelectedText();
				 int Yplace = Integer.parseInt(YplaceString);
				 
				 String latimeString = (String) txtLatime.getSelectedText();
				 int lat = Integer.parseInt(latimeString);
				 
				 String inaltimeString = (String) txtInaltime.getSelectedText();
				 int inalt = Integer.parseInt(inaltimeString);
				 
				 String FormaString = (String) comboBox.getSelectedItem();
				 
				 String GrosimeString = (String) txtGrosime.getSelectedText();
				 int Gros = Integer.parseInt(GrosimeString);
				 //paint(canvas,Xplace,Yplace,lat,inalt,FormaString);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(1500,750));
		canvas.setBackground(Color.WHITE);
		frame.getContentPane().add(canvas);

	}
	
	/*public void paint (Canvas canvas2, int x, int y, int lat, int lung, String formaString)
	{
		if(formaString.compareToIgnoreCase("Patrat")==0 && lat!=lung)
			System.out.println("Date invalide");
		else
		{
		switch (formaString) {
		case "Patrat":
			canvas2.drawRect(x, y, lat, lung);
			canvas2.setColor(Color.BLUE);
			break;
		case "Dreptunghi":
			canvas2.drawRect(x, y, lat, lung);
			canvas2.setColor(Color.CYAN);
			break;
		case "Cerc":
			canvas2.drawOval(x, y, lat, lung);
			canvas2.setColor(Color.green);
			break;
		}
		}
	}*/

}
