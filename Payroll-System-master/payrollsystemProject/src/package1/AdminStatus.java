package package1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.Insets;
import java.sql.ResultSet;

public class AdminStatus extends JPanel {
	String uid,name,date,days,reason,status;
	private JTextField leavetextField;
	private JTextField approvedtextField;
	private JTextField rejectedtextField;
	private JTextField totalEmptextField;

	/**
	 * Create the panel.
	 */
	public AdminStatus() {
		setBorder(null);
		setVisible(false);
		setBounds(0,0,1255, 656);
		setBackground(new Color(146,189,213,252));
		setLayout(null);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1255, 47);
		panel_1.setBackground(new Color(46, 61, 176,255));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel AddEmpLabel = new JLabel("Welcome To Admin Login");
		AddEmpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AddEmpLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		AddEmpLabel.setForeground(Color.WHITE);
		AddEmpLabel.setBackground(Color.WHITE);
		AddEmpLabel.setBounds(238, 0, 810, 47);
		panel_1.add(AddEmpLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(46, 61, 176,255));
		panel.setBounds(82, 145, 281, 161);
		add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 56, 281, 7);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("NEW LEAVE");
		lblNewLabel.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(36, 0, 209, 54);
		panel.add(lblNewLabel);
		
		leavetextField = new JTextField();
		leavetextField.setHorizontalAlignment(SwingConstants.CENTER);
		leavetextField.setForeground(new Color(255, 255, 255));
		leavetextField.setBorder(null);
		leavetextField.setMargin(new Insets(0, 0, 0, 0));
		leavetextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 60));
		leavetextField.setEditable(false);
		leavetextField.setBackground(new Color(46, 61, 176,255));
		leavetextField.setBounds(36, 68, 209, 83);
		panel.add(leavetextField);
		leavetextField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(46, 61, 176));
		panel_2.setBounds(485, 145, 281, 161);
		add(panel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 56, 281, 7);
		panel_2.add(separator_1);
		
		JLabel lblApproved = new JLabel("LEAVE APPROVED");
		lblApproved.setHorizontalAlignment(SwingConstants.CENTER);
		lblApproved.setForeground(Color.WHITE);
		lblApproved.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblApproved.setBounds(36, 0, 209, 54);
		panel_2.add(lblApproved);
		
		approvedtextField = new JTextField();
		approvedtextField.setHorizontalAlignment(SwingConstants.CENTER);
		approvedtextField.setForeground(new Color(255, 255, 255));
		approvedtextField.setMargin(new Insets(0, 0, 0, 0));
		approvedtextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 60));
		approvedtextField.setEditable(false);
		approvedtextField.setColumns(10);
		approvedtextField.setBorder(null);
		approvedtextField.setBackground(new Color(46, 61, 176));
		approvedtextField.setBounds(46, 68, 199, 83);
		panel_2.add(approvedtextField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(46, 61, 176));
		panel_3.setBounds(82, 418, 281, 161);
		add(panel_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 56, 281, 7);
		panel_3.add(separator_2);
		
		JLabel lblRejected = new JLabel("LEAVE REJECTED");
		lblRejected.setHorizontalAlignment(SwingConstants.CENTER);
		lblRejected.setForeground(Color.WHITE);
		lblRejected.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblRejected.setBounds(36, 0, 209, 54);
		panel_3.add(lblRejected);
		
		rejectedtextField = new JTextField();
		rejectedtextField.setHorizontalAlignment(SwingConstants.CENTER);
		rejectedtextField.setForeground(new Color(255, 255, 255));
		rejectedtextField.setMargin(new Insets(0, 0, 0, 0));
		rejectedtextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 60));
		rejectedtextField.setEditable(false);
		rejectedtextField.setColumns(10);
		rejectedtextField.setBorder(null);
		rejectedtextField.setBackground(new Color(46, 61, 176));
		rejectedtextField.setBounds(36, 68, 209, 83);
		panel_3.add(rejectedtextField);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(46, 61, 176));
		panel_4.setBounds(485, 418, 281, 161);
		add(panel_4);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 56, 281, 7);
		panel_4.add(separator_3);
		
		JLabel lblEmployee = new JLabel("TOTAL EMPLOYEE");
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setForeground(Color.WHITE);
		lblEmployee.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblEmployee.setBounds(36, 0, 209, 54);
		panel_4.add(lblEmployee);
		
		totalEmptextField = new JTextField();
		totalEmptextField.setHorizontalAlignment(SwingConstants.CENTER);
		totalEmptextField.setForeground(new Color(255, 255, 255));
		totalEmptextField.setMargin(new Insets(0, 0, 0, 0));
		totalEmptextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 60));
		totalEmptextField.setEditable(false);
		totalEmptextField.setColumns(10);
		totalEmptextField.setBorder(null);
		totalEmptextField.setBackground(new Color(46, 61, 176));
		totalEmptextField.setBounds(36, 68, 209, 83);
		panel_4.add(totalEmptextField);
		

		MySQLConection mysql = new MySQLConection();
		ResultSet resultSet = mysql.getleaveapplication(uid, name, date, days, reason, status);
					try {	
					while(resultSet.next()) {
						approvedtextField.setText(resultSet.getString("rowcount"));
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));// TODO: handle exception
				}
		
		ResultSet resultSet1 = mysql. getleaveapplication1(uid, name, date, days, reason, status);
					try {	
					while(resultSet1.next()) {
						rejectedtextField.setText(resultSet1.getString("row1count"));
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));// TODO: handle exception
				}
		
		
		ResultSet resultSet2 = mysql. getleaveapplication2(uid, name, date, days, reason, status);
					try {	
					while(resultSet2.next()) {
						leavetextField.setText(resultSet2.getString("row2count"));
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));// TODO: handle exception
				}
					
		ResultSet resultSet4 = mysql.getRowCount(); 
					try {
						while(resultSet4.next()) {
							
							totalEmptextField.setText(resultSet4.getString("count"));
							
							}
					} catch (Exception e) {
						JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
		
					}
	}

	
}
