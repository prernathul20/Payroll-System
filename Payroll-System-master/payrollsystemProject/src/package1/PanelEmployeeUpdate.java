package package1;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelEmployeeUpdate extends JPanel {

   	String uid ,passwordStr,Name,gender,address,state,city ,pincode,mobile,Degree,Designation,Department,Bank,email,Salary,Usertype,deduction ,allowance ,salary ;
	private JLabel lblState;
	private JLabel lblPincode;
	private JLabel lblDegree;
	private JLabel lblDesignation;
	private JTextField UIDtext;
	private JTextField pincodetext;
	private JTextField citytext;
	private JTextField statetext;
	private JTextField addresstext;
	private JTextField gendertext;
	private JTextField nametext;
	private JTextField emailtext;
	private JTextField banktext;
	private JTextField salarytext;
	private JTextField designationtext;
	private JTextField degreetext;
	private JTextField mobiletext;
	private JButton clearbutton;
	private JButton btnExit;
	

	/**
	 * Create the panel.
	 */
	public PanelEmployeeUpdate() {
			setBounds(0,0,1255, 656);
			setBackground(new Color(146,189,213,252));
			setVisible(true);
			setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1255, 47);
			panel.setBackground(new Color(46, 61, 176,255));
			add(panel);
			panel.setLayout(null);
			
			JLabel LabelEmpUpdate = new JLabel("Employee Update");
			LabelEmpUpdate.setHorizontalAlignment(SwingConstants.CENTER);
			LabelEmpUpdate.setFont(new Font("Arial Black", Font.PLAIN, 20));
			LabelEmpUpdate.setForeground(Color.WHITE);
			LabelEmpUpdate.setBackground(Color.WHITE);
			LabelEmpUpdate.setBounds(505, 0, 210, 38);
			panel.add(LabelEmpUpdate);
			
			JLabel lblName1 = new JLabel("Name :");
			lblName1.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblName1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblName1.setBounds(50, 246, 138, 30);
			add(lblName1);
			
			JLabel lblAddress1 = new JLabel("Address :");
			lblAddress1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAddress1.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblAddress1.setBounds(50, 339, 138, 30);
			add(lblAddress1);
			
			JLabel lblCity1 = new JLabel("City :");
			lblCity1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCity1.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblCity1.setBounds(50, 430, 138, 30);
			add(lblCity1);
			
			JLabel lblDepartment = new JLabel("Department :");
			lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
			lblDepartment.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblDepartment.setBounds(20, 521, 168, 30);
			add(lblDepartment);
			
			JComboBox ComboboxDepartment = new JComboBox();
			ComboboxDepartment.setBackground(new Color(100, 149, 237));
			ComboboxDepartment.setModel(new DefaultComboBoxModel(new String[] {"Computer", "Mechnical", "Electrical", "Civil", "Other"}));
			ComboboxDepartment.setFont(new Font("Arial Black", Font.PLAIN, 15));
			ComboboxDepartment.setBounds(267, 520, 260, 27);
			add(ComboboxDepartment);
			
			
			JLabel lblMob1 = new JLabel("Mobile :");
			lblMob1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblMob1.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblMob1.setBounds(673, 246, 138, 30);
			add(lblMob1);
			

			JLabel lblSalary1 = new JLabel("Salary :");
			lblSalary1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblSalary1.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblSalary1.setBounds(673, 385, 138, 30);
			add(lblSalary1);
			
			JLabel lblAcc1 = new JLabel("Bank Account :");
			lblAcc1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAcc1.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblAcc1.setBounds(643, 430, 168, 30);
			add(lblAcc1);
			
			JLabel lblEmail1 = new JLabel("Email :");
			lblEmail1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblEmail1.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblEmail1.setBounds(673, 481, 138, 30);
			add(lblEmail1);

			JButton buttonGetdata = new JButton("GETDATA");	
			buttonGetdata.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MySQLConection mysql = new MySQLConection();
					String uid = UIDtext.getText(); 
					//String Name = nametext.getText();
					ResultSet resultset = mysql.getRow(uid,passwordStr,Name,gender,address,state,city ,pincode,mobile,Degree,Designation,Department,Bank,email,Salary,Usertype);
				try {
						while(resultset.next()) {
								
								nametext.setText(resultset.getString("name"));
								gendertext.setText(resultset.getString("gender"));
								addresstext.setText(resultset.getString("address"));
								statetext.setText(resultset.getString("state"));
								citytext.setText(resultset.getString("city"));
								pincodetext.setText(resultset.getString("pincode"));
								mobiletext.setText(resultset.getString("mobile"));
								degreetext.setText(resultset.getString("Degree"));
								designationtext.setText(resultset.getString("Designation"));
								String department =(String) ComboboxDepartment.getSelectedItem();
								banktext.setText(resultset.getString("Bank"));
								salarytext.setText(resultset.getString("salary"));
								emailtext.setText(resultset.getString("email"));
								
								System.out.println(Name+""+""+address+""+""+city+""+pincode+""+mobile+""+Salary+""+Bank+""+email+""+department+""+uid+""+gender+""+state+""+Degree+""+Designation+""+Usertype);		
						}
				
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e2.getMessage()));
					e2.printStackTrace();
					}
				}
				
			});
			buttonGetdata.setForeground(Color.WHITE);
			buttonGetdata.setFont(new Font("Arial Black", Font.PLAIN, 19));
			buttonGetdata.setBackground(new Color(46, 61, 176));
			buttonGetdata.setBounds(782, 105, 260, 30);
			add(buttonGetdata);
			JButton btnUpdate = new JButton("Update Employee");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Name = nametext.getText().toString();
					System.out.println(Name);
					gender = gendertext.getText().toString();
					address =addresstext.getText().toString();
					state = statetext.getText().toString();
					city = citytext.getText().toString();
					pincode = pincodetext.getText().toString();
					mobile = mobiletext.getText().toString();
					Degree = degreetext.getText().toString();
					Designation = designationtext.getText().toString();
					Department =(String) ComboboxDepartment.getSelectedItem();
					Bank = banktext.getText().toString();
			    	email = emailtext.getText().toString();
			    	Salary = salarytext.getText().toString();
			    	System.out.println(Salary);
			    	MySQLConection mysql = new MySQLConection();
			    	uid = UIDtext.getText();
			    int	status = mysql.UpdateAdmin(uid,passwordStr,Name,gender,address,state,city ,pincode,mobile,Degree,Designation,Department,Bank,email,Salary,Usertype);
			    	try {
			    		if(status==1) {
							JOptionPane.showMessageDialog(null, "Successfully Updated");
						}else {
							JOptionPane.showMessageDialog(null, "Failed to  Update");
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog( null, "Database error:" +  ( e2.getMessage()));
						e2.printStackTrace();// TODO: handle exception
					}
			    		
			    		
				
			    	
				}
			});
			btnUpdate.setBackground(new Color(46, 61, 176));
			btnUpdate.setFont(new Font("Arial Black", Font.PLAIN, 19));
			btnUpdate.setForeground(Color.WHITE);
			btnUpdate.setBounds(905, 590, 260, 30);
			add(btnUpdate);
			
			
			
			JLabel lblGender = new JLabel("Gender");
			lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
			lblGender.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblGender.setBounds(50, 293, 138, 30);
			add(lblGender);

			
			lblState = new JLabel("State");
			lblState.setHorizontalAlignment(SwingConstants.RIGHT);
			lblState.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblState.setBounds(50, 390, 138, 30);
			add(lblState);
			
			lblPincode = new JLabel("Pincode :");
			lblPincode.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPincode.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblPincode.setBounds(50, 481, 138, 30);
			add(lblPincode);
			
			lblDegree = new JLabel("Degree :");
			lblDegree.setHorizontalAlignment(SwingConstants.RIGHT);
			lblDegree.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblDegree.setBounds(673, 286, 138, 30);
			add(lblDegree);
			
			lblDesignation = new JLabel("Designation");
			lblDesignation.setHorizontalAlignment(SwingConstants.RIGHT);
			lblDesignation.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblDesignation.setBounds(673, 339, 138, 30);
			add(lblDesignation);
			
			JLabel lblPin1 = new JLabel("UID :");
			lblPin1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPin1.setFont(new Font("Arial Black", Font.BOLD, 19));
			lblPin1.setBounds(236, 105, 138, 30);
			add(lblPin1);
			
			UIDtext = new JTextField();
			UIDtext.setBorder(null);
			UIDtext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			UIDtext.setBackground(new Color(100, 149, 237));
			UIDtext.setBounds(430, 109, 260, 27);
			add(UIDtext);
			UIDtext.setColumns(10);
			
			pincodetext = new JTextField();
			pincodetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			pincodetext.setColumns(10);
			pincodetext.setBorder(null);
			pincodetext.setBackground(new Color(100, 149, 237));
			pincodetext.setBounds(267, 476, 260, 27);
			add(pincodetext);
			
			citytext = new JTextField();
			citytext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			citytext.setColumns(10);
			citytext.setBorder(null);
			citytext.setBackground(new Color(100, 149, 237));
			citytext.setBounds(267, 430, 260, 27);
			add(citytext);
			
			statetext = new JTextField();
			statetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			statetext.setColumns(10);
			statetext.setBorder(null);
			statetext.setBackground(new Color(100, 149, 237));
			statetext.setBounds(267, 383, 260, 27);
			add(statetext);
			
			addresstext = new JTextField();
			addresstext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			addresstext.setColumns(10);
			addresstext.setBorder(null);
			addresstext.setBackground(new Color(100, 149, 237));
			addresstext.setBounds(267, 339, 260, 27);
			add(addresstext);
			
			gendertext = new JTextField();
			gendertext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			gendertext.setColumns(10);
			gendertext.setBorder(null);
			gendertext.setBackground(new Color(100, 149, 237));
			gendertext.setBounds(267, 293, 260, 27);
			add(gendertext);
			
			nametext = new JTextField();
			nametext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			nametext.setColumns(10);
			nametext.setBorder(null);
			nametext.setBackground(new Color(100, 149, 237));
			nametext.setBounds(267, 246, 260, 27);
			add(nametext);
			
			emailtext = new JTextField();
			emailtext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			emailtext.setColumns(10);
			emailtext.setBorder(null);
			emailtext.setBackground(new Color(100, 149, 237));
			emailtext.setBounds(871, 485, 260, 27);
			add(emailtext);
			
			banktext = new JTextField();
			banktext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			banktext.setColumns(10);
			banktext.setBorder(null);
			banktext.setBackground(new Color(100, 149, 237));
			banktext.setBounds(871, 434, 260, 27);
			add(banktext);
			
			salarytext = new JTextField();
			salarytext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			salarytext.setColumns(10);
			salarytext.setBorder(null);
			salarytext.setBackground(new Color(100, 149, 237));
			salarytext.setBounds(871, 385, 260, 27);
			add(salarytext);
			
			designationtext = new JTextField();
			designationtext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			designationtext.setColumns(10);
			designationtext.setBorder(null);
			designationtext.setBackground(new Color(100, 149, 237));
			designationtext.setBounds(871, 339, 260, 27);
			add(designationtext);
			
			degreetext = new JTextField();
			degreetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			degreetext.setColumns(10);
			degreetext.setBorder(null);
			degreetext.setBackground(new Color(100, 149, 237));
			degreetext.setBounds(871, 292, 260, 27);
			add(degreetext);
			
			mobiletext = new JTextField();
			mobiletext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
			mobiletext.setColumns(10);
			mobiletext.setBorder(null);
			mobiletext.setBackground(new Color(100, 149, 237));
			mobiletext.setBounds(871, 246, 260, 27);
			add(mobiletext);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(74, 175, 1125, 2);
			add(separator);
			
			clearbutton = new JButton("CLEAR");
			clearbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					UIDtext.setText(null); 
					gendertext.setText(null);
					statetext.setText(null);
					degreetext.setText(null);
					designationtext.setText(null); 
					nametext.setText(null);
					addresstext.setText(null);
				    citytext.setText(null);
					pincodetext.setText(null);
					mobiletext.setText(null);
					salarytext.setText(null);
					banktext.setText(null);
			    	emailtext.setText(null);
			    	ComboboxDepartment.setSelectedItem(null);
			    	
				}
			});
			clearbutton.setForeground(Color.WHITE);
			clearbutton.setFont(new Font("Arial Black", Font.PLAIN, 19));
			clearbutton.setBackground(new Color(46, 61, 176));
			clearbutton.setBounds(529, 590, 260, 30);
			add(clearbutton);
			
			btnExit = new JButton("BLACK");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AdminStatus adminStatus = new AdminStatus();
					adminStatus.setVisible(true);
					HomePage.PanelContentpanel.add(adminStatus);
					setVisible(false);
				}
				
			});
			btnExit.setForeground(Color.WHITE);
			btnExit.setFont(new Font("Arial Black", Font.PLAIN, 19));
			btnExit.setBackground(new Color(46, 61, 176));
			btnExit.setBounds(151, 590, 260, 30);
			add(btnExit);
			

			}
}

