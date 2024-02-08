package package1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class PanelSalary extends JPanel {
	
	String uid, Name,department,bank,HR, DA,Med,leave,travell,grosssalary,Netsalary,leaveday,date,Travell,basic;
	private JTextField NametextField_1;
	private JButton GetDataNewButton_1;
	private JButton GetDataNewButton_2;
	private JTextField BanktextField;
	private JTextField DepartmentextField_2;
	private JTextField GrosstextField_3;
	private JTextField NettextField_4;
	private JTextField TravelltextField_5;
	private JTextField MedicaltextField_6;
	private JTextField HrtextField_8;
	private JTextField DatextField_9;
	private JTextField LeavetextField_10;
	private JTextField leave1textField;
	static JComboBox UIDcomboBox; 

	static JPanel panel;
	static Date dateChooser;

	public PanelSalary() {
		setBounds(0,0,1255, 656);
		setBackground(new Color(146,189,213,252));
		setVisible(true);
		setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 61, 176,255));
		panel_1.setBounds(0, 0, 1255, 47);
		add(panel_1);
		panel_1.setLayout(null);
		
		
		panel = new JPanel();
		panel.setBounds(595, 57, 650, 589);
		panel.setVisible(false);
		add(panel);
		panel.setLayout(null);  
		
		JLabel SalaryLabel = new JLabel("Salary");
		 SalaryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 SalaryLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		 SalaryLabel.setForeground(Color.WHITE);
		 SalaryLabel.setBackground(Color.WHITE);
		 SalaryLabel.setBounds(505, 0, 210, 38);
		panel_1.add(SalaryLabel);
		
		NametextField_1 = new JTextField();
		NametextField_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		NametextField_1.setForeground(new Color(0, 0, 128));
		NametextField_1.setBackground(new Color(100, 149, 237));
		NametextField_1.setBorder(null);
		NametextField_1.setColumns(10);
		NametextField_1.setBounds(258, 244, 332, 33);
		add(NametextField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 131, 1190, 14);
		add(separator);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBackground(new Color(100, 149, 237));
		dateChooser.setForeground(new Color(47, 79, 79));
		dateChooser.setBounds(258, 169, 332, 33);
		add(dateChooser);
		
		JButton GetDataNewButton = new JButton("GET DATA");	
		GetDataNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				MySQLConection mysql = new MySQLConection();
				
				uid = UIDcomboBox.getSelectedItem().toString();
				ResultSet resultSet  = mysql.getSalary(uid, bank, Name, department, HR, DA, Med, leave, travell, grosssalary, Netsalary, grosssalary, leaveday);
				
				
					try {
						while(resultSet.next()) {
							
							
						NametextField_1.setText(resultSet.getString("name"));
						DepartmentextField_2.setText(resultSet.getString("Department"));
						BanktextField.setText(resultSet.getString("Bank"));
						HrtextField_8.setText(resultSet.getString("hr"));
						DatextField_9.setText(resultSet.getString("da"));
						MedicaltextField_6.setText(resultSet.getString("med"));
						TravelltextField_5.setText(resultSet.getString("travell"));
						LeavetextField_10.setText(resultSet.getString("Leave"));
						leave1textField.setText(resultSet.getString("leaveDays"));
						
						
						basic =resultSet.getString("basicsalary");
						System.out.println(resultSet.getString("name")+resultSet.getString("leaveDays")+resultSet.getString("Bank"));
						}

						
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));
						e1.printStackTrace();
					}
				System.out.println("--------------------------------------------------------------------------------------------------------");
				
				float totalLeavededuction = Float.parseFloat(LeavetextField_10.getText())* Float.parseFloat(leave1textField.getText());
				float tot = Float.parseFloat(basic) + Float.parseFloat(MedicaltextField_6.getText()) + Float.parseFloat(TravelltextField_5.getText()) + Float.parseFloat(HrtextField_8.getText()) + Float.parseFloat(DatextField_9.getText());
				GrosstextField_3.setText(Float.toString(tot));
				System.out.println(tot);
				float tax = (float) (tot*2.1/100);
				float total = tax + totalLeavededuction;
				System.out.println(tax);
				float net = tot - total;
				System.out.println(net);
				NettextField_4.setText(Float.toString(net));
			}
			
		});
		GetDataNewButton.setForeground(new Color(255, 255, 255));
		GetDataNewButton.setBackground(new Color(46, 61, 176,255));
		GetDataNewButton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		GetDataNewButton.setBorder(null);
		GetDataNewButton.setBounds(669, 74, 332, 33);
		add(GetDataNewButton);
		
		GetDataNewButton_1 = new JButton("GENARATE SALARY");
		GetDataNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				PaySlip2 paySlip2 = new PaySlip2();
				paySlip2.setVisible(true);
				panel.add(paySlip2);
			}
		});
		GetDataNewButton_1.setForeground(Color.WHITE);
		GetDataNewButton_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		GetDataNewButton_1.setBorder(null);
		GetDataNewButton_1.setBackground(new Color(46, 61, 176));
		GetDataNewButton_1.setBounds(968, 584, 262, 33);
		add(GetDataNewButton_1);
		
		GetDataNewButton_2 = new JButton("CLEAR");
		GetDataNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NametextField_1.setText(null);
				BanktextField.setText(null);
				DepartmentextField_2.setText(null);
				LeavetextField_10.setText(null);
				GrosstextField_3.setText(null);
				NettextField_4.setText(null);
				TravelltextField_5.setText(null);
				MedicaltextField_6.setText(null);
				HrtextField_8.setText(null);
				DatextField_9.setText(null);
				leave1textField.setText(null);
				NettextField_4.setText(null);
			}
		});
		GetDataNewButton_2.setForeground(Color.WHITE);
		GetDataNewButton_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		GetDataNewButton_2.setBorder(null);
		GetDataNewButton_2.setBackground(new Color(46, 61, 176));
		GetDataNewButton_2.setBounds(320, 584, 270, 33);
		add(GetDataNewButton_2);
		
		BanktextField = new JTextField();
		BanktextField.setForeground(new Color(0, 0, 128));
		BanktextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		BanktextField.setColumns(10);
		BanktextField.setBorder(null);
		BanktextField.setBackground(new Color(100, 149, 237));
		BanktextField.setBounds(258, 287, 332, 33);
		add(BanktextField);
		
		DepartmentextField_2 = new JTextField();
		DepartmentextField_2.setForeground(new Color(0, 0, 128));
		DepartmentextField_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		DepartmentextField_2.setColumns(10);
		DepartmentextField_2.setBorder(null);
		DepartmentextField_2.setBackground(new Color(100, 149, 237));
		DepartmentextField_2.setBounds(258, 330, 332, 33);
		add(DepartmentextField_2);
		
		GrosstextField_3 = new JTextField();
		GrosstextField_3.setForeground(new Color(0, 0, 128));
		GrosstextField_3.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		GrosstextField_3.setColumns(10);
		GrosstextField_3.setBorder(null);
		GrosstextField_3.setBackground(new Color(100, 149, 237));
		GrosstextField_3.setBounds(258, 449, 332, 33);
		add(GrosstextField_3);
		
		NettextField_4 = new JTextField();
		NettextField_4.setForeground(new Color(0, 0, 128));
		NettextField_4.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		NettextField_4.setColumns(10);
		NettextField_4.setBorder(null);
		NettextField_4.setBackground(new Color(100, 149, 237));
		NettextField_4.setBounds(258, 492, 332, 33);
		add(NettextField_4);
		
		TravelltextField_5 = new JTextField();
		TravelltextField_5.setForeground(new Color(0, 0, 128));
		TravelltextField_5.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		TravelltextField_5.setColumns(10);
		TravelltextField_5.setBorder(null);
		TravelltextField_5.setBackground(new Color(100, 149, 237));
		TravelltextField_5.setBounds(898, 449, 332, 33);
		add(TravelltextField_5);
		
		MedicaltextField_6 = new JTextField();
		MedicaltextField_6.setForeground(new Color(0, 0, 128));
		MedicaltextField_6.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		MedicaltextField_6.setColumns(10);
		MedicaltextField_6.setBorder(null);
		MedicaltextField_6.setBackground(new Color(100, 149, 237));
		MedicaltextField_6.setBounds(898, 287, 332, 33);
		add(MedicaltextField_6);
		
		HrtextField_8 = new JTextField();
		HrtextField_8.setForeground(new Color(0, 0, 128));
		HrtextField_8.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		HrtextField_8.setColumns(10);
		HrtextField_8.setBorder(null);
		HrtextField_8.setBackground(new Color(100, 149, 237));
		HrtextField_8.setBounds(898, 328, 332, 33);
		add(HrtextField_8);
		
		DatextField_9 = new JTextField();
		DatextField_9.setForeground(new Color(0, 0, 128));
		DatextField_9.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		DatextField_9.setColumns(10);
		DatextField_9.setBorder(null);
		DatextField_9.setBackground(new Color(100, 149, 237));
		DatextField_9.setBounds(898, 371, 332, 33);
		add(DatextField_9);
		
		LeavetextField_10 = new JTextField();
		LeavetextField_10.setForeground(new Color(0, 0, 128));
		LeavetextField_10.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		LeavetextField_10.setColumns(10);
		LeavetextField_10.setBorder(null);
		LeavetextField_10.setBackground(new Color(100, 149, 237));
		LeavetextField_10.setBounds(898, 492, 332, 33);
		add(LeavetextField_10);
		
		JLabel lblNewLabel = new JLabel("UID          :");
		lblNewLabel.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel.setBounds(16, 74, 172, 33);
		add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date         :");
		lblDate.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblDate.setBounds(16, 169, 163, 33);
		add(lblDate);
		
		JLabel lblName = new JLabel("Name           :");
		lblName.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblName.setBounds(16, 242, 215, 33);
		add(lblName);
		
		JLabel lblBank = new JLabel("Bank           :");
		lblBank.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblBank.setBounds(17, 285, 214, 33);
		add(lblBank);
		
		JLabel lblDpartment = new JLabel("Department  :");
		lblDpartment.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblDpartment.setBounds(17, 328, 235, 33);
		add(lblDpartment);
		
		JLabel lblNewLabel_5 = new JLabel("Gross Salary:");
		lblNewLabel_5.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(17, 447, 231, 33);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Net Salary   :");
		lblNewLabel_6.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_6.setBounds(17, 490, 231, 33);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Travelling :");
		lblNewLabel_8.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_8.setBounds(650, 447, 238, 33);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Medical    :");
		lblNewLabel_9.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_9.setBounds(650, 285, 238, 33);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("HR       :");
		lblNewLabel_11.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_11.setBounds(650, 328, 238, 33);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("DA       :");
		lblNewLabel_12.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_12.setBounds(650, 371, 238, 33);
		add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Leave   :");
		lblNewLabel_13.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_13.setBounds(650, 490, 238, 33);
		add(lblNewLabel_13);
		
		JLabel lblDeduction = new JLabel("Deduction");
		lblDeduction.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeduction.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblDeduction.setBounds(929, 222, 238, 33);
		add(lblDeduction);
		
		leave1textField = new JTextField();
		leave1textField.setForeground(new Color(0, 0, 128));
		leave1textField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		leave1textField.setColumns(10);
		leave1textField.setBorder(null);
		leave1textField.setBackground(new Color(100, 149, 237));
		leave1textField.setBounds(258, 373, 332, 33);
		add(leave1textField);
		
		JLabel lblTotalLeave = new JLabel("Total Leave  :");
		lblTotalLeave.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblTotalLeave.setBounds(17, 369, 235, 33);
		add(lblTotalLeave);
		
		UIDcomboBox = new JComboBox();
		UIDcomboBox.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		UIDcomboBox.setModel(new DefaultComboBoxModel(new String[] {"mac11", "ella22", "alex33", "nora44"}));
		UIDcomboBox.setBackground(new Color(100, 149, 237));
		UIDcomboBox.setBounds(258, 76, 332, 33);
		add(UIDcomboBox);
		
		JButton GetDataNewButton_1_1 = new JButton("SAVE");
		GetDataNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf = new SimpleDateFormat();
				HR = HrtextField_8.getText().toString();
				DA = DatextField_9.getText().toString();
				Med = MedicaltextField_6.getText().toString();
				leave = LeavetextField_10.getText().toString();
				Travell = TravelltextField_5.getText().toString();
				grosssalary = GrosstextField_3.getText().toString();
				Netsalary = NettextField_4.getText().toString();
				
				
				
		
				date = sdf.format(dateChooser.getDate());
				MySQLConection mysql = new MySQLConection();
		    	uid = UIDcomboBox.getSelectedItem().toString();
		    	
		    	int	status = mysql.SaveSalray(uid, Name, department, date, HR, DA, Med, leave, Travell, grosssalary, Netsalary, leaveday);
		    	try {
		    		
		    		if(status==1) {
						JOptionPane.showMessageDialog(null, "Successfully Save");
					}else {
						JOptionPane.showMessageDialog(null, "Failed to  Save");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e2.getMessage())+(e2.getCause()));
					e2.printStackTrace();// TODO: handle exception
				}
				
				
			}
		});
		GetDataNewButton_1_1.setForeground(Color.WHITE);
		GetDataNewButton_1_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		GetDataNewButton_1_1.setBorder(null);
		GetDataNewButton_1_1.setBackground(new Color(46, 61, 176));
		GetDataNewButton_1_1.setBounds(650, 584, 262, 33);
		add(GetDataNewButton_1_1);
		
		JButton EXITNewButton_2_1 = new JButton("BACK");
		EXITNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminStatus adminStatus = new AdminStatus();
				adminStatus.setVisible(true);
				HomePage.PanelContentpanel.add(adminStatus);
				setVisible(false);
			}
		});
		EXITNewButton_2_1.setForeground(Color.WHITE);
		EXITNewButton_2_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		EXITNewButton_2_1.setBorder(null);
		EXITNewButton_2_1.setBackground(new Color(46, 61, 176));
		EXITNewButton_2_1.setBounds(17, 584, 270, 33);
		add(EXITNewButton_2_1);
	
		
		
		
	
	}
}
