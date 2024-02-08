package package1;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.AncestorListener;
import javax.xml.crypto.Data;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;

public class PaySlip2 extends JInternalFrame {
	String uid, Name,department,bank,leave,HR, DA,Med,Leave,travell,grosssalary,Netsalary ,firstHalf,SecondHalf, Date,basicsalary ;
	private JTextField UIDtextField;
	private JTextField NametextField_1;
	private JTextField BanktextField_2;
	private JTextField DepartmenttextField_3;
	private JTextField HRtextField_4;
	private JTextField DAtextField_5;
	private JTextField MedtextField_6;
	private JTextField totaltextField_7;
	private JTextField TravelltextField_8;
	private JTextField LeavetextField_9;
	private JTextField grosssalarytextField_10;
	private JTextField netsalarytextField_11;
	private JTextField taxtextField_12;
	private JPanel panel ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaySlip2 frame = new PaySlip2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaySlip2() {
		setRootPaneCheckingEnabled(false);
		setTitle("Dr. D.Y. patil Collage of Engineering and Innovation ");
	
	                                                                                             
		setResizable(true);
		setMaximizable(true);
		setEnabled(false);
		setBackground(new Color(100, 149, 237));
		setBorder(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setFrameIcon(new ImageIcon(PanelSalary.class.getResource("/image/kisspng-dr-d-y-patil-college-of-engineering.png")));
		setBounds(0, 0, 650, 589);
	

		JButton btnNewButton_1 = new JButton("Print");
		btnNewButton_1.setBounds(392, 521, 253, 37);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

					  PrinterJob pj = PrinterJob.getPrinterJob();
					  pj.setJobName(" Print Component ");

					  pj.setPrintable (new Printable() {    
					    public int print(Graphics pg, PageFormat pf, int pageNum){
					      if (pageNum > 0){
					      return Printable.NO_SUCH_PAGE;
					      }

					      Graphics2D g2 = (Graphics2D) pg;
					      g2.translate(pf.getImageableX(), pf.getImageableY());
					      panel.paint(g2);
					      return Printable.PAGE_EXISTS;
					    }
					  });
					  if (pj.printDialog() == false)
					  return;

					  try {
					        pj.print();
					  } catch (PrinterException ex) {
					        // handle exception
					  }
					
 
			}
		});
		getContentPane().setLayout(null);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		btnNewButton_1.setBackground(new Color(46, 61, 176));
		getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton_1_1 = new JButton("Close");
		btnNewButton_1_1.setBounds(5, 521, 264, 37);
		 btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelSalary.panel.setVisible(false);
			}
		});
		 btnNewButton_1_1.setBackground(new Color(46, 61, 176,255));
		 btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		 btnNewButton_1_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		getContentPane().add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 640, 512);
		getContentPane().add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		//int month =  PanelSalary.dateChooser.getDateFormatString();
		
		JTextArea datetextArea = new JTextArea();
		datetextArea.setFont(new Font("Dutch801 Rm BT", Font.BOLD, 25));
		
		datetextArea.setEditable(false);
		datetextArea.setBounds(26, 10, 582, 32);
		panel.add(datetextArea);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 52, 620, 12);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("Employee UID :");
		lblNewLabel.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 60, 124, 26);
		panel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name               :");
		lblName.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName.setBounds(10, 96, 124, 26);
		panel.add(lblName);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 132, 342, 12);
		panel.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 270, 342, 12);
		panel.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 389, 342, 12);
		panel.add(separator_1_1_1);
		
		JLabel lblName_1 = new JLabel("HR           :");
		lblName_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_1.setBounds(10, 141, 91, 26);
		panel.add(lblName_1);
		
		JLabel lblName_2 = new JLabel("DA           :");
		lblName_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_2.setBounds(10, 177, 91, 26);
		panel.add(lblName_2);
		
		JLabel lblName_3 = new JLabel("Leave         :");
		lblName_3.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_3.setBounds(305, 141, 97, 26);
		panel.add(lblName_3);
		
		JLabel lblName_3_1 = new JLabel("Travelling   :");
		lblName_3_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_3_1.setBounds(305, 177, 104, 26);
		panel.add(lblName_3_1);
		
		JLabel lblName_3_2 = new JLabel("Med         :");
		lblName_3_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_3_2.setBounds(10, 213, 91, 26);
		panel.add(lblName_3_2);
		
		JLabel lblName_3_3 = new JLabel("GrossSalary   :");
		lblName_3_3.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_3_3.setBounds(10, 281, 137, 26);
		panel.add(lblName_3_3);
		
		JLabel lblName_3_4 = new JLabel("Tax               :");
		lblName_3_4.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_3_4.setBounds(10, 353, 137, 26);
		panel.add(lblName_3_4);
		
		JLabel lblName_3_4_1 = new JLabel("NetSalary      :");
		lblName_3_4_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_3_4_1.setBounds(10, 317, 137, 26);
		panel.add(lblName_3_4_1);
		
		JLabel lblBank = new JLabel("Bank           :");
		lblBank.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblBank.setBounds(339, 60, 104, 26);
		panel.add(lblBank);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblDepartment.setBounds(339, 96, 104, 26);
		panel.add(lblDepartment);
		
		JLabel lblName_3_5 = new JLabel("Total           :");
		lblName_3_5.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_3_5.setBounds(305, 213, 104, 26);
		panel.add(lblName_3_5);
		
		JLabel lblName_3_4_2 = new JLabel("( Signiture )");
		lblName_3_4_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		lblName_3_4_2.setBounds(99, 450, 190, 26);
		panel.add(lblName_3_4_2);
		
		UIDtextField = new JTextField();
		UIDtextField.setBackground(new Color(255, 255, 255));
		UIDtextField.setDisabledTextColor(Color.WHITE);
		UIDtextField.setEditable(false);
		UIDtextField.setBorder(null);
		UIDtextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		UIDtextField.setBounds(138, 59, 191, 28);
		panel.add(UIDtextField);
		UIDtextField.setColumns(10);
		
		NametextField_1 = new JTextField();
		NametextField_1.setBackground(Color.WHITE);
		NametextField_1.setEditable(false);
		NametextField_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		NametextField_1.setColumns(10);
		NametextField_1.setBorder(null);
		NametextField_1.setBounds(138, 96, 191, 28);
		panel.add(NametextField_1);
		
		BanktextField_2 = new JTextField();
		BanktextField_2.setBackground(Color.WHITE);
		BanktextField_2.setEditable(false);
		BanktextField_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		BanktextField_2.setColumns(10);
		BanktextField_2.setBorder(null);
		BanktextField_2.setBounds(439, 58, 191, 28);
		panel.add(BanktextField_2);
		
		DepartmenttextField_3 = new JTextField();
		DepartmenttextField_3.setBackground(Color.WHITE);
		DepartmenttextField_3.setEditable(false);
		DepartmenttextField_3.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		DepartmenttextField_3.setColumns(10);
		DepartmenttextField_3.setBorder(null);
		DepartmenttextField_3.setBounds(439, 96, 191, 28);
		panel.add(DepartmenttextField_3);
		
		HRtextField_4 = new JTextField();
		HRtextField_4.setBackground(Color.WHITE);
		HRtextField_4.setEditable(false);
		HRtextField_4.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		HRtextField_4.setColumns(10);
		HRtextField_4.setBorder(null);
		HRtextField_4.setBounds(104, 139, 191, 28);
		panel.add(HRtextField_4);
		
		DAtextField_5 = new JTextField();
		DAtextField_5.setBackground(Color.WHITE);
		DAtextField_5.setEditable(false);
		DAtextField_5.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		DAtextField_5.setColumns(10);
		DAtextField_5.setBorder(null);
		DAtextField_5.setBounds(104, 175, 191, 28);
		panel.add(DAtextField_5);
		
		MedtextField_6 = new JTextField();
		MedtextField_6.setBackground(Color.WHITE);
		MedtextField_6.setEditable(false);
		MedtextField_6.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		MedtextField_6.setColumns(10);
		MedtextField_6.setBorder(null);
		MedtextField_6.setBounds(104, 213, 191, 28);
		panel.add(MedtextField_6);
		
		totaltextField_7 = new JTextField();
		totaltextField_7.setBackground(Color.WHITE);
		totaltextField_7.setEditable(false);
		totaltextField_7.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		totaltextField_7.setColumns(10);
		totaltextField_7.setBorder(null);
		totaltextField_7.setBounds(412, 211, 191, 28);
		panel.add(totaltextField_7);
		
		TravelltextField_8 = new JTextField();
		TravelltextField_8.setBackground(Color.WHITE);
		TravelltextField_8.setEditable(false);
		TravelltextField_8.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		TravelltextField_8.setColumns(10);
		TravelltextField_8.setBorder(null);
		TravelltextField_8.setBounds(412, 175, 191, 28);
		panel.add(TravelltextField_8);
		
		LeavetextField_9 = new JTextField();
		LeavetextField_9.setBackground(Color.WHITE);
		LeavetextField_9.setEditable(false);
		LeavetextField_9.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		LeavetextField_9.setColumns(10);
		LeavetextField_9.setBorder(null);
		LeavetextField_9.setBounds(412, 139, 191, 28);
		panel.add(LeavetextField_9);
		
		grosssalarytextField_10 = new JTextField();
		grosssalarytextField_10.setBackground(Color.WHITE);
		grosssalarytextField_10.setEditable(false);
		grosssalarytextField_10.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		grosssalarytextField_10.setColumns(10);
		grosssalarytextField_10.setBorder(null);
		grosssalarytextField_10.setBounds(149, 279, 367, 28);
		panel.add(grosssalarytextField_10);
		
		netsalarytextField_11 = new JTextField();
		netsalarytextField_11.setBackground(Color.WHITE);
		netsalarytextField_11.setEditable(false);
		netsalarytextField_11.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		netsalarytextField_11.setColumns(10);
		netsalarytextField_11.setBorder(null);
		netsalarytextField_11.setBounds(149, 315, 367, 28);
		panel.add(netsalarytextField_11);
		
		taxtextField_12 = new JTextField();
		taxtextField_12.setBackground(Color.WHITE);
		taxtextField_12.setEditable(false);
		taxtextField_12.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		taxtextField_12.setColumns(10);
		taxtextField_12.setBorder(null);
		taxtextField_12.setBounds(149, 351, 367, 28);
		panel.add(taxtextField_12);
		
	
		MySQLConection mysql = new MySQLConection();
	
		uid = PanelSalary.UIDcomboBox.getSelectedItem().toString();
		ResultSet resultSet  = mysql.getSalary(uid, bank, leave, Name, department, HR, DA, Med, Leave, travell, grosssalary, Netsalary, basicsalary);
		
		
			try {
				while(resultSet.next()) {
						UIDtextField.setText( PanelSalary.UIDcomboBox.getSelectedItem().toString());
						datetextArea.setText(" PAY SLIP FOR THE DATE OF "+resultSet.getString("Date")+"  ");
						NametextField_1.setText(resultSet.getString("name"));
						DepartmenttextField_3.setText(resultSet.getString("Department"));
						BanktextField_2.setText(resultSet.getString("Bank"));
						LeavetextField_9.setText(resultSet.getString("Leave"));
					//	leave1textField.setText(resultSet.getString("leaveDays"));
						HRtextField_4.setText(resultSet.getString("hr"));
						DAtextField_5.setText(resultSet.getString("da"));
						MedtextField_6.setText(resultSet.getString("med"));
						TravelltextField_8.setText(resultSet.getString("travell"));
						float tot = Float.parseFloat(MedtextField_6.getText())+Float.parseFloat(TravelltextField_8.getText())+Float.parseFloat(HRtextField_4.getText())+Float.parseFloat(DAtextField_5.getText());

						totaltextField_7.setText(Float.toString(tot));								
					
						
						float gross = tot + Float.parseFloat(resultSet.getString("basicsalary"));
					
						grosssalarytextField_10.setText(String.valueOf(gross));
						float tax = (float) (gross*2.1/100);
						taxtextField_12.setText(String.valueOf(tax));
						float net = gross -	Float.parseFloat(LeavetextField_9.getText())-tax;
						netsalarytextField_11.setText(Float.toString(net));
						//float att =  Float.parseFloat(resultSet2.getString("present"))+Float.parseFloat(resultSet3.getString("present1"));
						
					/*	GrosstextField_3.setText(resultSet.getString("grosssalary"));
						NettextField_4.setText(resultSet.getString("netsalary"));
						float tot = Float.parseFloat(MedtextField_6.getText())+Float.parseFloat(TravelltextField_8.getText());
						TotaltextField_7.setText(Float.toString(tot));
						float tot1 = Float.parseFloat(HRtextField_4.getText())+Float.parseFloat(DAtextField_5.getText())+ Float.parseFloat(LeavetextField_9.getText());
						TotaltextField_11.setText(Float.toString(tot1));
						float net = Float.parseFloat(GrosstextField_3.getText())-(Float.parseFloat(MedtextField_6.getText())+Float.parseFloat(TravelltextField_8.getText()) +  Float.parseFloat(HRtextField_4.getText())+Float.parseFloat(DAtextField_5.getText()));
						NettextField_4.setText(Float.toString(net)); */
				}
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));
				e1.printStackTrace();
			}
		System.out.println("--------------------------------------------------------------------------------------------------------");
	
        
   
    }
}
