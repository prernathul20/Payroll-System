package package1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;

public class PanelDeleteEmployee extends JPanel {
	String uid ,passwordStr,Name,gender,address,state,city ,pincode,mobile,Degree,Designation,Department,Bank,email,Salary,Usertype,deduction ,allowance ,salary ;
	
	private JTextField UIDtext;
	private JTextField nametext;
	private JTextField gendertext;
	private JTextField addresstext;
	private JTextField statetext;
	private JTextField citytext;
	private JTextField pincodetext;
	private JTextField mobiletext;
	private JTextField degreetext;
	private JTextField designationtext;
	private JTextField salarytext;
	private JTextField banktext;
	private JTextField emailtext;
	private JComboBox ComboboxDepartment;
	

	/**
	 * Create the panel.
	 */
	public PanelDeleteEmployee() {
		setBounds(0,0,1255, 656);
		setBackground(new Color(146,189,213,252));
		setVisible(true);
		setLayout(null);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 61, 176,255));
		panel_1.setBounds(0, 0, 1255, 47);
		add(panel_1);
		
		JLabel DeleteEmpLabel = new JLabel("Delete Employee");
		DeleteEmpLabel .setHorizontalAlignment(SwingConstants.CENTER);
		DeleteEmpLabel  .setFont(new Font("Arial Black", Font.PLAIN, 20));
		DeleteEmpLabel  .setForeground(Color.WHITE);
		DeleteEmpLabel .setBackground(Color.WHITE);
		DeleteEmpLabel .setBounds(505, 0, 210, 38);
		panel_1.add(DeleteEmpLabel);
		
		UIDtext = new JTextField();
		UIDtext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		UIDtext.setColumns(10);
		UIDtext.setBorder(null);
		UIDtext.setBackground(new Color(100, 149, 237));
		UIDtext.setBounds(325, 76, 260, 27);
		add(UIDtext);
		
		nametext = new JTextField();
		nametext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		nametext.setColumns(10);
		nametext.setBorder(null);
		nametext.setBackground(new Color(100, 149, 237));
		nametext.setBounds(261, 245, 260, 27);
		add(nametext);
		
		gendertext = new JTextField();
		gendertext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		gendertext.setColumns(10);
		gendertext.setBorder(null);
		gendertext.setBackground(new Color(100, 149, 237));
		gendertext.setBounds(261, 290, 260, 27);
		add(gendertext);
		
		addresstext = new JTextField();
		addresstext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		addresstext.setColumns(10);
		addresstext.setBorder(null);
		addresstext.setBackground(new Color(100, 149, 237));
		addresstext.setBounds(261, 335, 260, 27);
		add(addresstext);
		
		statetext = new JTextField();
		statetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		statetext.setColumns(10);
		statetext.setBorder(null);
		statetext.setBackground(new Color(100, 149, 237));
		statetext.setBounds(261, 380, 260, 27);
		add(statetext);
		
		citytext = new JTextField();
		citytext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		citytext.setColumns(10);
		citytext.setBorder(null);
		citytext.setBackground(new Color(100, 149, 237));
		citytext.setBounds(261, 425, 260, 27);
		add(citytext);
		
		pincodetext = new JTextField();
		pincodetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		pincodetext.setColumns(10);
		pincodetext.setBorder(null);
		pincodetext.setBackground(new Color(100, 149, 237));
		pincodetext.setBounds(261, 473, 260, 27);
		add(pincodetext);
		
		mobiletext = new JTextField();
		mobiletext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		mobiletext.setColumns(10);
		mobiletext.setBorder(null);
		mobiletext.setBackground(new Color(100, 149, 237));
		mobiletext.setBounds(805, 245, 260, 27);
		add(mobiletext);
		
		degreetext = new JTextField();
		degreetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		degreetext.setColumns(10);
		degreetext.setBorder(null);
		degreetext.setBackground(new Color(100, 149, 237));
		degreetext.setBounds(805, 290, 260, 27);
		add(degreetext);
		
		designationtext = new JTextField();
		designationtext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		designationtext.setColumns(10);
		designationtext.setBorder(null);
		designationtext.setBackground(new Color(100, 149, 237));
		designationtext.setBounds(805, 340, 260, 27);
		add(designationtext);
		
		salarytext = new JTextField();
		salarytext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		salarytext.setColumns(10);
		salarytext.setBorder(null);
		salarytext.setBackground(new Color(100, 149, 237));
		salarytext.setBounds(805, 389, 260, 27);
		add(salarytext);
		
		banktext = new JTextField();
		banktext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		banktext.setColumns(10);
		banktext.setBorder(null);
		banktext.setBackground(new Color(100, 149, 237));
		banktext.setBounds(805, 435, 260, 27);
		add(banktext);
		
		emailtext = new JTextField();
		emailtext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		emailtext.setColumns(10);
		emailtext.setBorder(null);
		emailtext.setBackground(new Color(100, 149, 237));
		emailtext.setBounds(805, 483, 260, 27);
		add(emailtext);
		
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
							banktext.setText(resultset.getString("Bank"));
							salarytext.setText(resultset.getString("salary"));
							emailtext.setText(resultset.getString("email"));
							
							String Department = (String )ComboboxDepartment.getSelectedItem().toString();
							
							System.out.println(Name+""+""+address+""+""+city+""+pincode+""+mobile+""+Salary+""+Bank+""+email+""+Department+""+uid+""+gender+""+state+""+Degree+""+Designation+""+Usertype);		
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
		buttonGetdata.setBounds(716, 76, 260, 30);
		add(buttonGetdata);
		
		JButton DeleteButton = new JButton("DELETE DATA");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MySQLConection mysql = new MySQLConection();
				String uid = UIDtext.getText();
				int status = mysql.DeleteData(uid);
				try {
					
					
		    		if(status==1) {
						JOptionPane.showMessageDialog(null, "Successfully Deleted");
					}else {
						JOptionPane.showMessageDialog(null, "Failed to  Delete");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e2.getMessage()));
				}
			}
		});
		DeleteButton.setForeground(Color.WHITE);
		DeleteButton.setFont(new Font("Arial Black", Font.PLAIN, 19));
		DeleteButton.setBackground(new Color(46, 61, 176));
		DeleteButton.setBounds(930, 594, 260, 30);
		add(DeleteButton);
		
		JLabel lblName = new JLabel("UID");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName.setBounds(158, 76, 138, 30);
		add(lblName);
		
		JLabel lblName1_1 = new JLabel("Name :");
		lblName1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_1.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_1.setBounds(36, 242, 138, 30);
		add(lblName1_1);
		
		JLabel lblName1_2 = new JLabel("Gender :");
		lblName1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_2.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_2.setBounds(36, 290, 138, 30);
		add(lblName1_2);
		
		JLabel lblName1_3 = new JLabel("Address :");
		lblName1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_3.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_3.setBounds(36, 331, 138, 30);
		add(lblName1_3);
		
		JLabel lblName1_4 = new JLabel("State :");
		lblName1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_4.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_4.setBounds(36, 376, 138, 30);
		add(lblName1_4);
		
		JLabel lblName1_5 = new JLabel("City :");
		lblName1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_5.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_5.setBounds(36, 421, 138, 30);
		add(lblName1_5);
		
		JLabel lblName1_6 = new JLabel("Pincode :");
		lblName1_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_6.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_6.setBounds(36, 469, 138, 30);
		add(lblName1_6);
		
		JLabel lblName1_7 = new JLabel("Department :");
		lblName1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_7.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_7.setBounds(20, 516, 154, 30);
		add(lblName1_7);
		
		JLabel lblName1_8 = new JLabel("Mobile :");
		lblName1_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_8.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_8.setBounds(613, 245, 138, 30);
		add(lblName1_8);
		
		JLabel lblName1_9 = new JLabel("Degree");
		lblName1_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_9.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_9.setBounds(613, 290, 138, 30);
		add(lblName1_9);
		
		JLabel lblName1_10 = new JLabel("Designation");
		lblName1_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_10.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_10.setBounds(613, 337, 138, 30);
		add(lblName1_10);
		
		JLabel lblName1_10_1 = new JLabel("Salary");
		lblName1_10_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_10_1.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_10_1.setBounds(613, 389, 138, 30);
		add(lblName1_10_1);
		
		JLabel lblName1_10_2 = new JLabel("Bank Account :");
		lblName1_10_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_10_2.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_10_2.setBounds(570, 432, 181, 30);
		add(lblName1_10_2);
		
		JLabel lblName1_10_3 = new JLabel("Email");
		lblName1_10_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_10_3.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_10_3.setBounds(613, 483, 138, 30);
		add(lblName1_10_3);
		
		
		ComboboxDepartment = new JComboBox();
		ComboboxDepartment.setBackground(new Color(100, 149, 237));
		ComboboxDepartment.setModel(new DefaultComboBoxModel(new String[] {"Computer", "Mechnical", "Electrical", "Civil", "Other"}));
		ComboboxDepartment.setFont(new Font("Arial Black", Font.PLAIN, 15));
		ComboboxDepartment.setBounds(261, 520, 260, 27);
		add(ComboboxDepartment);
		
		JButton ClearButton_1 = new JButton("CLEAR");
		ClearButton_1.addMouseListener(new MouseAdapter() {
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
		ClearButton_1.setForeground(Color.WHITE);
		ClearButton_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		ClearButton_1.setBackground(new Color(46, 61, 176));
		ClearButton_1.setBounds(520, 594, 260, 30);
		add(ClearButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 155, 1182, 2);
		add(separator);
		
		JButton Button_1 = new JButton("BACK");
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminStatus adminStatus = new AdminStatus();
				adminStatus.setVisible(true);
				HomePage.PanelContentpanel.add(adminStatus);
				setVisible(false);
			}
		});
		Button_1.setForeground(Color.WHITE);
		Button_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		Button_1.setBackground(new Color(46, 61, 176));
		Button_1.setBounds(80, 594, 260, 30);
		add(Button_1);
		
	}
}
