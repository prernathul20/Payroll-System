package package1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelAddEmpolyee extends JPanel {
	String uid ,password,Name,gender,address,state,city,pincode,mobile,Degree,Designation,Department,Bank,email,Salary,Usertype;
	private JTextField addresstext;
	private JTextField statetext;
	private JTextField Citytext;
	private JTextField pincodetext;
	private JTextField uidtext;
	private JTextField salarytext;
	private JTextField banktext;
	private JTextField emailtext;
	private JTextField gendertext;
	private JTextField nametext;
	private JTextField designationtext;
	private JTextField degreetext;
	private JTextField mobiletext;
	private JTextField passtext;
	private JTextField Usertypetext;
	private Connection con;
	private PreparedStatement preparedStatement;
	private int resultSet;
	/**
	 * Create the panel.
	 */
	public PanelAddEmpolyee() {
		setBounds(0,0,1255, 656);
		setBackground(new Color(146,189,213,252));
		setVisible(true);
		setLayout(null);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1255, 47);
		panel_1.setBackground(new Color(46, 61, 176,255));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel AddEmpLabel = new JLabel("Add Employee");
		AddEmpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AddEmpLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		AddEmpLabel.setForeground(Color.WHITE);
		AddEmpLabel.setBackground(Color.WHITE);
		AddEmpLabel.setBounds(505, 0, 210, 38);
		panel_1.add(AddEmpLabel);
		
		addresstext = new JTextField();
		addresstext.setBackground(new Color(100, 149, 237));
		addresstext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		addresstext.setBounds(289, 295, 252, 27);
		add(addresstext);
		addresstext.setColumns(10);
		
		statetext = new JTextField();
		statetext.setBackground(new Color(100, 149, 237));
		statetext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		statetext.setColumns(10);
		statetext.setBounds(289, 345, 252, 27);
		add(statetext);
		
		Citytext = new JTextField();
		Citytext.setBackground(new Color(100, 149, 237));
		Citytext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		Citytext.setColumns(10);
		Citytext.setBounds(289, 392, 252, 27);
		add(Citytext);
		
		pincodetext = new JTextField();
		pincodetext.setBackground(new Color(100, 149, 237));
		pincodetext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		pincodetext.setColumns(10);
		pincodetext.setBounds(289, 442, 252, 27);
		add(pincodetext);
		
		uidtext = new JTextField();
		uidtext.setBackground(new Color(100, 149, 237));
		uidtext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		uidtext.setColumns(10);
		uidtext.setBounds(289, 489, 252, 27);
		add(uidtext);
		
		JComboBox comboBox_1 = new JComboBox();
		
		JComboBox comboBox_2 = new JComboBox();
		
		JComboBox comboxDepartment = new JComboBox();
		comboxDepartment.setBackground(new Color(100, 149, 237));
		comboxDepartment.setModel(new DefaultComboBoxModel(new String[] {"Computer", "Mechnical", "Electrical", "Civil", "Other"}));
		comboxDepartment.setFont(new Font("Arial Black", Font.PLAIN, 15));
		comboxDepartment.setBounds(902, 533, 252, 27);
		add(comboxDepartment);
		
		salarytext = new JTextField();
		salarytext.setBackground(new Color(100, 149, 237));
		salarytext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		salarytext.setColumns(10);
		salarytext.setBounds(902, 345, 252, 27);
		add(salarytext);
		
		banktext = new JTextField();
		banktext.setBackground(new Color(100, 149, 237));
		banktext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		banktext.setColumns(10);
		banktext.setBounds(902, 392, 252, 27);
		add(banktext);
		
		emailtext = new JTextField();
		emailtext.setBackground(new Color(100, 149, 237));
		emailtext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		emailtext.setColumns(10);
		emailtext.setBounds(902, 442, 252, 27);
		add(emailtext);
		
		JButton ADDButton = new JButton("ADD Employee");
		ADDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 uid = uidtext.getText(); 
				 password =passtext.getText();
				 gender = gendertext.getText();
				 state = statetext.getText();
				 Degree = degreetext.getText();
				 Designation = designationtext.getText(); 
				 Name=nametext.getText();
				 address=addresstext.getText();
			     city= Citytext.getText();
				 pincode = pincodetext.getText();
				 mobile = mobiletext.getText();
				 Salary = salarytext.getText();
				 Bank= banktext.getText();
		    	 email = emailtext.getText();
		    	 Department =(String) comboxDepartment.getSelectedItem();
		    	 Usertype = Usertypetext.getText();
		    	
		    	System.out.println(Name+""+""+address+""+""+city+""+pincode+""+mobile+""+Salary+""+Bank+""+email+""+Department+""+uid+password+""+gender+""+state+""+Degree+""+Designation+""+Usertype);	
		    	
		    	MySQLConection mysql = new MySQLConection();
		    	int status = mysql.insertdataAdmin(uid, password, Name, gender, address, state, city, pincode, mobile, Degree, Designation, Department, Bank, email, Salary,Usertype);
		    	if(status==1) {
					
					JOptionPane.showMessageDialog(null, "Successfully Uploaded");
				}else {
					JOptionPane.showMessageDialog(null, "Failed to  Upload");
				}
					
			}  
			
			    			
			});
		ADDButton.setBackground(new Color(46, 61, 176));
		ADDButton.setForeground(Color.WHITE);
		ADDButton.setFont(new Font("Arial Black", Font.PLAIN, 19));
		ADDButton.setBounds(902, 579, 252, 35);
		add(ADDButton);
		
		gendertext = new JTextField();
		gendertext.setBackground(new Color(100, 149, 237));
		gendertext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		gendertext.setColumns(10);
		gendertext.setBounds(289, 252, 252, 27);
		add(gendertext);
		
		nametext = new JTextField();
		nametext.setBorder(null);
		nametext.setBackground(new Color(100, 149, 237));
		nametext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		nametext.setColumns(10);
		nametext.setBounds(289, 208, 252, 27);
		add(nametext);
		
		designationtext = new JTextField();
		designationtext.setBackground(new Color(100, 149, 237));
		designationtext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		designationtext.setColumns(10);
		designationtext.setBounds(902, 302, 252, 27);
		add(designationtext);
		
		degreetext = new JTextField();
		degreetext.setBackground(new Color(100, 149, 237));
		degreetext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		degreetext.setColumns(10);
		degreetext.setBounds(902, 259, 252, 27);
		add(degreetext);
		
		JLabel lblName1 = new JLabel("Name :");
		lblName1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1.setBounds(60, 208, 138, 30);
		add(lblName1);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblGender.setBounds(60, 247, 138, 30);
		add(lblGender);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblAddress.setBounds(60, 292, 138, 30);
		add(lblAddress);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblState.setBounds(60, 342, 138, 30);
		add(lblState);
		
		JLabel lblCity = new JLabel("Pincode :");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblCity.setBounds(60, 442, 138, 30);
		add(lblCity);
		
		JLabel lblName1_1 = new JLabel("City");
		lblName1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_1.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_1.setBounds(60, 389, 138, 30);
		add(lblName1_1);
		
		JLabel lblUid = new JLabel("UID :");
		lblUid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUid.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblUid.setBounds(60, 482, 138, 30);
		add(lblUid);
		
		mobiletext = new JTextField();
		mobiletext.setBackground(new Color(100, 149, 237));
		mobiletext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		mobiletext.setColumns(10);
		mobiletext.setBounds(902, 215, 252, 27);
		add(mobiletext);
		
		JLabel lblMobileNo = new JLabel("Mobile no. :");
		lblMobileNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMobileNo.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblMobileNo.setBounds(678, 208, 138, 30);
		add(lblMobileNo);
		
		JLabel lblDegree = new JLabel("Degree :");
		lblDegree.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDegree.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblDegree.setBounds(678, 249, 138, 30);
		add(lblDegree);
		
		JLabel lblDesignation = new JLabel("Designation :");
		lblDesignation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesignation.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblDesignation.setBounds(611, 299, 205, 30);
		add(lblDesignation);
		
		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalary.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblSalary.setBounds(678, 345, 138, 30);
		add(lblSalary);
		
		JLabel lblBankAccount = new JLabel("Bank Account :");
		lblBankAccount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBankAccount.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblBankAccount.setBounds(611, 389, 200, 30);
		add(lblBankAccount);
		
		JLabel lblEmail = new JLabel("Email  :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblEmail.setBounds(678, 442, 138, 30);
		add(lblEmail);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblDepartment.setBounds(648, 529, 168, 30);
		add(lblDepartment);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblPassword.setBounds(60, 529, 138, 30);
		add(lblPassword);
		
		passtext = new JTextField();
		passtext.setBackground(new Color(100, 149, 237));
		passtext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		passtext.setColumns(10);
		passtext.setBounds(289, 532, 252, 27);
		add(passtext);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 150, 1255, 10);
		add(separator);
		
		JLabel lblNewLabel = new JLabel("ADD EMPLOYEE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 50));
		lblNewLabel.setBounds(347, 72, 570, 47);
		add(lblNewLabel);
		
		Usertypetext = new JTextField();
		Usertypetext.setFont(new Font("Arial Black", Font.PLAIN, 15));
		Usertypetext.setColumns(10);
		Usertypetext.setBackground(new Color(100, 149, 237));
		Usertypetext.setBounds(902, 489, 252, 27);
		add(Usertypetext);
		
		JLabel lblUsertype = new JLabel("UserType  :");
		lblUsertype.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsertype.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblUsertype.setBounds(678, 489, 138, 30);
		add(lblUsertype);
		
		JButton ClearButton_1 = new JButton("CLEAR");
		ClearButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				uidtext.setText(null); 
				passtext.setText(null);
				gendertext.setText(null);
				statetext.setText(null);
				degreetext.setText(null);
				designationtext.setText(null); 
				nametext.setText(null);
				addresstext.setText(null);
			    Citytext.setText(null);
				pincodetext.setText(null);
				mobiletext.setText(null);
				salarytext.setText(null);
				banktext.setText(null);
		    	emailtext.setText(null);
		    	comboxDepartment.setSelectedItem(null);
		    	Usertypetext.setText(null);
		    	
			}
		});

		ClearButton_1.setForeground(Color.WHITE);
		ClearButton_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		ClearButton_1.setBackground(new Color(46, 61, 176));
		ClearButton_1.setBounds(604, 579, 252, 35);
		add(ClearButton_1);
		
		JButton ClearButton_1_1 = new JButton("BACK");
		ClearButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminStatus adminStatus = new AdminStatus();
				adminStatus.setVisible(true);
				HomePage.PanelContentpanel.add(adminStatus);
				setVisible(false);
			
			}
		});
		ClearButton_1_1.setForeground(Color.WHITE);
		ClearButton_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		ClearButton_1_1.setBackground(new Color(46, 61, 176));
		ClearButton_1_1.setBounds(289, 579, 252, 35);
		add(ClearButton_1_1);
		
	
	}
}
