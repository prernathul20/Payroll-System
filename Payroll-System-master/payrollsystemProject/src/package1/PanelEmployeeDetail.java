package package1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class PanelEmployeeDetail extends JPanel {
	String uid ,passwordStr,Name,gender,address,state,city ,pincode,mobile,Degree,Designation,Department,Bank,email,Salary,Usertype,deduction ,allowance ,salary ;
	private JLabel lblState;
	private JTextField nameText;
	private JTextField gendertext;
	private JTextField addresstext;
	private JTextField statetext;
	private JTextField citytext;
	private JTextField pincodetext;
	private JTextField departmenttext;
	private JTextField mobiletext;
	private JTextField degreetext;
	private JTextField designationtext;
	private JTextField salarytext;
	private JTextField banktext;
	private JTextField emailtext;
	private JTextField UIDText;

	/**
	 * Create the panel.
	 */
	public  PanelEmployeeDetail() {
		// TODO Auto-generated constructor stub
	
		setBounds(0,0,1255, 656);
		setBackground(new Color(146,189,213,252));
		setVisible(true);
		setLayout(null);
		
		
		
	
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1255, 47);
		panel.setBackground(new Color(46, 61, 176,255));
		add(panel);
		panel.setLayout(null);
		
		JLabel EmpDetailLabel = new JLabel("Employee Detail");
		EmpDetailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		EmpDetailLabel .setFont(new Font("Arial Black", Font.PLAIN, 20));
		EmpDetailLabel.setForeground(Color.WHITE);
		EmpDetailLabel.setBackground(Color.WHITE);
		EmpDetailLabel.setBounds(505, 0, 210, 38);
		panel.add(EmpDetailLabel);
		
		nameText = new JTextField();
		nameText.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		nameText.setColumns(10);
		nameText.setBorder(null);
		nameText.setBackground(new Color(146,189,213,252));
		nameText.setBounds(277, 242, 260, 27);
		add(nameText);
		
		gendertext = new JTextField();
		gendertext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		gendertext.setColumns(10);
		gendertext.setBorder(null);
		gendertext.setBackground(new Color(146,189,213,252));
		gendertext.setBounds(277, 286, 260, 27);
		add(gendertext);
		
		addresstext = new JTextField();
		addresstext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		addresstext.setColumns(10);
		addresstext.setBorder(null);
		addresstext.setBackground(new Color(146, 189, 213, 252));
		addresstext.setBounds(277, 333, 260, 27);
		add(addresstext);
		
		statetext = new JTextField();
		statetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		statetext.setColumns(10);
		statetext.setBorder(null);
		statetext.setBackground(new Color(146, 189, 213, 252));
		statetext.setBounds(277, 381, 260, 27);
		add(statetext);
		
		citytext = new JTextField();
		citytext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		citytext.setColumns(10);
		citytext.setBorder(null);
		citytext.setBackground(new Color(146, 189, 213, 252));
		citytext.setBounds(277, 430, 260, 27);
		add(citytext);
		
		pincodetext = new JTextField();
	
		pincodetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		pincodetext.setColumns(10);
		pincodetext.setBorder(null);
		pincodetext.setBackground(new Color(146, 189, 213, 252));
		pincodetext.setBounds(277, 477, 260, 27);
		add(pincodetext);
		
		departmenttext = new JTextField();
		departmenttext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		departmenttext.setColumns(10);
		departmenttext.setBorder(null);
		departmenttext.setBackground(new Color(146, 189, 213, 252));
		departmenttext.setBounds(277, 526, 260, 27);
		add(departmenttext);
		
		mobiletext = new JTextField();
		mobiletext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		mobiletext.setColumns(10);
		mobiletext.setBorder(null);
		mobiletext.setBackground(new Color(146, 189, 213, 252));
		mobiletext.setBounds(777, 242, 260, 27);
		add(mobiletext);
		
		degreetext = new JTextField();
		degreetext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		degreetext.setColumns(10);
		degreetext.setBorder(null);
		degreetext.setBackground(new Color(146, 189, 213, 252));
		degreetext.setBounds(777, 286, 260, 27);
		add(degreetext);
		
		designationtext = new JTextField();
		designationtext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		designationtext.setColumns(10);
		designationtext.setBorder(null);
		designationtext.setBackground(new Color(146, 189, 213, 252));
		designationtext.setBounds(777, 333, 260, 27);
		add(designationtext);
		
		salarytext = new JTextField();
		salarytext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		salarytext.setColumns(10);
		salarytext.setBorder(null);
		salarytext.setBackground(new Color(146, 189, 213, 252));
		salarytext.setBounds(777, 381, 260, 27);
		add(salarytext);
		
		banktext = new JTextField();
		banktext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		banktext.setColumns(10);
		banktext.setBorder(null);
		banktext.setBackground(new Color(146, 189, 213, 252));
		banktext.setBounds(777, 430, 260, 27);
		add(banktext);
		
		emailtext = new JTextField();
		emailtext.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		emailtext.setColumns(10);
		emailtext.setBorder(null);
		emailtext.setBackground(new Color(146, 189, 213, 252));
		emailtext.setBounds(777, 477, 260, 27);
		add(emailtext);
		
		UIDText = new JTextField();
		UIDText.setFont(new Font("BankGothic Md BT", Font.PLAIN, 20));
		UIDText.setColumns(10);
		UIDText.setBorder(null);
		UIDText.setBackground(new Color(100, 149, 237));
		UIDText.setBounds(448, 90, 260, 27);
		add(UIDText);
		
		JButton buttonGetdata = new JButton("GETDATA");
		buttonGetdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MySQLConection mysql = new MySQLConection();
				String uid = UIDText.getText(); 
			
				ResultSet resultset = mysql.getRow(uid,passwordStr,Name,gender,address,state,city ,pincode,mobile,Degree,Designation,Department,Bank,email,Salary,Usertype);
			try {
					while(resultset.next()) {
							
							nameText.setText(resultset.getString("name"));
							gendertext.setText(resultset.getString("gender"));
							addresstext.setText(resultset.getString("address"));
							statetext.setText(resultset.getString("state"));
							citytext.setText(resultset.getString("city"));
							pincodetext.setText(resultset.getString("pincode"));
							mobiletext.setText(resultset.getString("mobile"));
							degreetext.setText(resultset.getString("Degree"));
							designationtext.setText(resultset.getString("Designation"));
							
;							banktext.setText(resultset.getString("Bank"));
							salarytext.setText(resultset.getString("salary"));
							emailtext.setText(resultset.getString("email"));
							
							System.out.println(Name+""+""+address+""+""+city+""+pincode+""+mobile+""+Salary+""+Bank+""+email+""+uid+""+gender+""+state+""+Degree+""+Designation+""+Usertype);		
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
		buttonGetdata.setBounds(766, 87, 260, 30);
		add(buttonGetdata);
		
		JLabel lblName1 = new JLabel("Name :");
		lblName1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1.setBounds(76, 242, 138, 30);
		add(lblName1);
		
		JLabel lblName1_1 = new JLabel("Gender :");
		lblName1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_1.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_1.setBounds(76, 282, 138, 30);
		add(lblName1_1);
		
		JLabel lblName1_2 = new JLabel("Address :");
		lblName1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_2.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_2.setBounds(76, 330, 138, 30);
		add(lblName1_2);
		
		JLabel lblName1_3 = new JLabel("State :");
		lblName1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_3.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_3.setBounds(76, 378, 138, 30);
		add(lblName1_3);
		
		JLabel lblName1_4 = new JLabel("City :");
		lblName1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_4.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_4.setBounds(76, 430, 138, 30);
		add(lblName1_4);
		
		JLabel lblName1_5 = new JLabel("Pincode :");
		lblName1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_5.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_5.setBounds(76, 477, 138, 30);
		add(lblName1_5);
		
		JLabel lblName1_7 = new JLabel("Mobile :");
		lblName1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_7.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_7.setBounds(613, 242, 138, 30);
		add(lblName1_7);
		
		JLabel lblName1_8 = new JLabel("Degree :");
		lblName1_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_8.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_8.setBounds(613, 286, 138, 30);
		add(lblName1_8);
		
		JLabel lblName1_9 = new JLabel("Designation :");
		lblName1_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_9.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_9.setBounds(600, 333, 151, 30);
		add(lblName1_9);
		
		JLabel lblName1_10 = new JLabel("Salary :");
		lblName1_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_10.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_10.setBounds(613, 378, 138, 30);
		add(lblName1_10);
		
		JLabel lblName1_11 = new JLabel("Bank Account :");
		lblName1_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_11.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_11.setBounds(557, 426, 194, 30);
		add(lblName1_11);
		
		JLabel lblName1_12 = new JLabel("Email :");
		lblName1_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_12.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_12.setBounds(613, 474, 138, 30);
		add(lblName1_12);
		
		JLabel lblName1_13 = new JLabel("UID :");
		lblName1_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName1_13.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblName1_13.setBounds(264, 90, 138, 30);
		add(lblName1_13);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 147, 1177, 2);
		add(separator);
		
		JButton btnExit = new JButton("BACK");
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
		btnExit.setBounds(294, 592, 260, 30);
		add(btnExit);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIDText.setText(null); 
				gendertext.setText(null);
				statetext.setText(null);
				degreetext.setText(null);
				designationtext.setText(null); 
				nameText.setText(null);
				addresstext.setText(null);
			    citytext.setText(null);
				pincodetext.setText(null);
				mobiletext.setText(null);
				salarytext.setText(null);
				banktext.setText(null);
		    	emailtext.setText(null);
		    	
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnClear.setBackground(new Color(46, 61, 176));
		btnClear.setBounds(682, 592, 260, 30);
		add(btnClear);
	}
}
