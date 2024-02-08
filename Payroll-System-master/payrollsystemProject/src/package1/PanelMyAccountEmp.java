package package1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import java.beans.PropertyChangeListener;
import java.rmi.server.UID;
import java.beans.PropertyChangeEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Insets;

public class PanelMyAccountEmp extends JPanel  {
	
		
	
	

	private Connection con;
	private PreparedStatement preparedStatement;
	private int resultSet;
   	String uid ,passwordStr,Name,gender,address,state,city ,pincode,mobile,Degree,Designation,Department,Bank,email,Salary,Usertype,deduction ,allowance ,salary ;
	private JTextField nametextField;
	private JTextField departmenttextField;
	private JTextField mobiletextField;
	private JTextField citytextField;
	private JTextField emailtextField;
	private JTextField DesignationtextField;
	private JTextField LeavetextField;
	private JTextField salarytextField;
	private JTextField allowancetextField;
	private JTextField deductiontextField;
	
	
		
	
	public  PanelMyAccountEmp() {
	
	
		setBounds(0, 0, 1255, 656);
		setBackground(new Color(146,189,213,252));
		setLayout(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1255, 47);
		panel.setBackground(new Color(46, 61, 176,255));add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Account");
		lblNewLabel .setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel .setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel .setForeground(Color.WHITE);
		lblNewLabel .setBackground(Color.WHITE);
		lblNewLabel .setBounds(505, 0, 210, 38);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 489, 246, 134);
		panel_1.setBackground(new Color(46, 61, 176,255));
		add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 42, 246, 2);
		panel_1.add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Leave Status");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(21, 10, 184, 31);
		panel_1.add(lblNewLabel_1);
		
		LeavetextField = new JTextField();
		LeavetextField.setEditable(false);
		LeavetextField.setHorizontalAlignment(SwingConstants.CENTER);
		LeavetextField.setBackground(new Color(46, 61, 176,255));
		LeavetextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 40));
		LeavetextField.setForeground(Color.WHITE);
		LeavetextField.setBorder(null);
		LeavetextField.setBounds(10, 53, 226, 71);
		panel_1.add(LeavetextField);
		LeavetextField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(662, 489, 246, 134);
		panel_2.setBackground(new Color(46, 61, 176,255));
		add(panel_2);
		panel_2.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 41, 246, 2);
		panel_2.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Allowance");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(21, 10, 184, 31);
	
		panel_2.add(lblNewLabel_3);
		
		allowancetextField = new JTextField();
		allowancetextField.setEditable(false);
		allowancetextField.setHorizontalAlignment(SwingConstants.CENTER);
		allowancetextField.setForeground(Color.WHITE);
		allowancetextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 50));
		allowancetextField.setColumns(10);
		allowancetextField.setBorder(null);
		allowancetextField.setBackground(new Color(46, 61, 176));
		allowancetextField.setBounds(56, 53, 149, 71);
		panel_2.add(allowancetextField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(336, 489, 252, 134);
		panel_3.setBackground(new Color(46, 61, 176,255));
		add(panel_3);
		panel_3.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 42, 252, 2);
		panel_3.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel(" Last Salary");
		lblNewLabel_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(36, 10, 182, 26);
		panel_3.add(lblNewLabel_2);
		
		salarytextField = new JTextField();
		salarytextField.setEditable(false);
		salarytextField.setHorizontalAlignment(SwingConstants.CENTER);
		salarytextField.setForeground(Color.WHITE);
		salarytextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 50));
		salarytextField.setColumns(10);
		salarytextField.setBorder(null);
		salarytextField.setBackground(new Color(46, 61, 176));
		salarytextField.setBounds(28, 53, 199, 71);
		panel_3.add(salarytextField);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(977, 489, 252, 134);
		panel_4.setBackground(new Color(46, 61, 176,255));
		add(panel_4);
		panel_4.setLayout(null);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 42, 252, 2);
		panel_4.add(separator_3);
		
		JLabel lblNewLabel_4 = new JLabel("Deduction");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(21, 10, 184, 31);
	
		panel_4.add(lblNewLabel_4);
		
		deductiontextField = new JTextField();
		deductiontextField.setEditable(false);
		deductiontextField.setHorizontalAlignment(SwingConstants.CENTER);
		deductiontextField.setForeground(Color.WHITE);
		deductiontextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 50));
		deductiontextField.setColumns(10);
		deductiontextField.setBorder(null);
		deductiontextField.setBackground(new Color(46, 61, 176));
		deductiontextField.setBounds(55, 53, 149, 71);
		panel_4.add(deductiontextField);
		
		JLabel lblNewLabel_5 = new JLabel("Name          :");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(90, 74, 217, 31);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Department :");
		lblNewLabel_5_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_5_1.setBounds(90, 158, 217, 31);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Mobile no.   :");
		lblNewLabel_5_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_5_1_1.setBounds(90, 241, 217, 31);
		add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("City                :");
		lblNewLabel_5_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_5_1_2.setBounds(709, 74, 217, 31);
		add(lblNewLabel_5_1_2);
		
		JLabel Labelemail = new JLabel("Email             :");
		Labelemail.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Labelemail.setBounds(709, 158, 217, 31);
		add(Labelemail);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("Designation   :");
		lblNewLabel_5_1_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_5_1_4.setBounds(709, 241, 217, 31);
		add(lblNewLabel_5_1_4);
		
		nametextField = new JTextField();
		nametextField.setBorder(null);
		nametextField.setHorizontalAlignment(SwingConstants.CENTER);
		nametextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		nametextField.setEditable(false);
		nametextField.setBackground(new Color(146,189,213,252));
		nametextField.setBounds(322, 74, 265, 31);
		add(nametextField);
		nametextField.setColumns(10);
		
		departmenttextField = new JTextField();
		departmenttextField.setBorder(null);
		departmenttextField.setMargin(new Insets(1, 1, 1, 1));
		departmenttextField.setHorizontalAlignment(SwingConstants.CENTER);
		departmenttextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		departmenttextField.setEditable(false);
		departmenttextField.setBackground(new Color(146,189,213,252));
		departmenttextField.setColumns(10);
		departmenttextField.setBounds(322, 158, 265, 31);
		add(departmenttextField);
		
		mobiletextField = new JTextField();
		mobiletextField.setBorder(null);
	
		mobiletextField.setSelectionColor(new Color(0, 120, 215));
		mobiletextField.setMargin(new Insets(0, 0, 0, 0));
		mobiletextField.setHorizontalAlignment(SwingConstants.CENTER);
		mobiletextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		mobiletextField.setEditable(false);
		mobiletextField.setBackground(new Color(146,189,213,252));
		mobiletextField.setColumns(10);
		mobiletextField.setBounds(322, 241, 265, 31);
		add(mobiletextField);
		
		citytextField = new JTextField();
		citytextField.setBorder(null);
		citytextField.setHorizontalAlignment(SwingConstants.CENTER);
		citytextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		citytextField.setEditable(false);
		citytextField.setBackground(new Color(146,189,213,252));
		citytextField.setColumns(10);
		citytextField.setBounds(910, 74, 265, 31);
		add(citytextField);
		
		emailtextField = new JTextField();
		emailtextField.setBorder(null);
		emailtextField.setHorizontalAlignment(SwingConstants.CENTER);
		emailtextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		emailtextField.setEditable(false);
		emailtextField.setBackground(new Color(146,189,213,252));
		emailtextField.setColumns(10);
		emailtextField.setBounds(910, 162, 265, 31);
		add(emailtextField);
		
		DesignationtextField = new JTextField();
		DesignationtextField.setBorder(null);
		DesignationtextField.setHorizontalAlignment(SwingConstants.CENTER);
		DesignationtextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		DesignationtextField.setEditable(false);
		DesignationtextField.setBackground(new Color(146,189,213,252));
		DesignationtextField.setColumns(10);
		DesignationtextField.setBounds(910, 241, 265, 31);
		add(DesignationtextField);
		setVisible(true);

		MySQLConection mysql = new MySQLConection();
		String uid = MainLogin.TextUserName.getText();
		ResultSet resultSet  = mysql.displaymyaccount(uid, passwordStr, Name, gender, address, state, city, pincode, mobile, Degree, Designation, Department, Bank, email, salary, Usertype, deduction, allowance, Salary);
		
		
			try {
				while(resultSet.next()) {
					
					
						nametextField.setText(resultSet.getString("name"));
						departmenttextField.setText(resultSet.getString("Department"));
						mobiletextField.setText(resultSet.getString("mobile"));
						citytextField.setText(resultSet.getString("city"));
						emailtextField.setText(resultSet.getString("email"));
						DesignationtextField.setText(resultSet.getString("Designation"));
						LeavetextField.setText(resultSet.getString("status"));
						salarytextField.setText(resultSet.getString("netsalary"));
						allowancetextField.setText(resultSet.getString("travell"));
						deductiontextField.setText(resultSet.getString("Leave"));
					
				}
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));
				e1.printStackTrace();
			}
			System.out.println("out...................332432..."+MainLogin.TextUserName.getText()+"...........");
	
		
	}
		
}
		



























