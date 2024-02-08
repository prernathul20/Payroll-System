package package1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelLeave extends JPanel {
	private JTextField leavetextField;
	private JTextField panelDeclinetext;
	private JTextField panelapprovedtext;
	private JTextField datetext;
	private JTextField reasontext;
	private JTextField Daystext;
	private JPanel panel_4 ;
	private JTextField uidtext;
	int ID;
	String uid,name,date,days,reason,status;
	private JTextField nametext;

	/**
	 * Create the panel.
	 */
	public PanelLeave() {
		setBounds(0,0,1255, 656);
		setBackground(new Color(146,189,213,252));
		setVisible(true);
		setLayout(null);
		
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 61, 176,255));
		panel_1.setBounds(0, 0, 1255, 47);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel LeaveLabel = new JLabel("Leave");
		
		LeaveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LeaveLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		LeaveLabel .setForeground(Color.WHITE);
		LeaveLabel.setBackground(Color.WHITE);
		LeaveLabel.setBounds(505, 0, 210, 38);
		panel_1.add(LeaveLabel);
		
		
		
		
		MySQLConection mysql = new MySQLConection();
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.setVisible(true);
			
						
			
				
			}
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new Color(0, 139, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(46, 61, 176,255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel.setBackground(new Color(46, 61, 176,255));
			}
		});
		panel.setBackground(new Color(46, 61, 176,255));
		panel.setBounds(61, 68, 278, 146);
		add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 45, 278, 17);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("Leave Application");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 0, 258, 44);
		panel.add(lblNewLabel);
		
		leavetextField = new JTextField();
		leavetextField.setHorizontalAlignment(SwingConstants.CENTER);
		leavetextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.setVisible(true);
			}
			
			
		});
		leavetextField.setEditable(false);
		leavetextField.setBorder(null);
		leavetextField.setForeground(Color.WHITE);
		leavetextField.setBackground(new Color(46, 61, 176,255));
		leavetextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 40));
		leavetextField.setBounds(42, 50, 198, 50);
		panel.add(leavetextField);
		leavetextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Click Here");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 110, 258, 36);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(46, 61, 176));
		panel_2.setBounds(61, 242, 278, 146);
		add(panel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 45, 278, 17);
		panel_2.add(separator_1);
		
		JLabel lblApproved = new JLabel("Approved");
		lblApproved.setHorizontalAlignment(SwingConstants.CENTER);
		lblApproved.setForeground(Color.WHITE);
		lblApproved.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblApproved.setBounds(54, 0, 174, 44);
		panel_2.add(lblApproved);
		
		panelapprovedtext = new JTextField();
		panelapprovedtext.setHorizontalAlignment(SwingConstants.CENTER);
		panelapprovedtext.setEditable(false);
		panelapprovedtext.setBorder(null);
		panelapprovedtext.setForeground(Color.WHITE);
		panelapprovedtext.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 40));
		panelapprovedtext.setColumns(10);
		panelapprovedtext.setBackground(new Color(46, 61, 176));
		panelapprovedtext.setBounds(30, 54, 222, 82);
		panel_2.add(panelapprovedtext);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(46, 61, 176));
		panel_3.setBounds(61, 415, 278, 146);
		add(panel_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 45, 278, 17);
		panel_3.add(separator_2);
		
		JLabel lblDecline = new JLabel("Decline");
		lblDecline.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecline.setForeground(Color.WHITE);
		lblDecline.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblDecline.setBounds(54, 0, 174, 44);
		panel_3.add(lblDecline);
		
		panelDeclinetext = new JTextField();
		panelDeclinetext.setHorizontalAlignment(SwingConstants.CENTER);
		panelDeclinetext.setEditable(false);
		panelDeclinetext.setBorder(null);
		panelDeclinetext.setForeground(Color.WHITE);
		panelDeclinetext.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 40));
		panelDeclinetext.setColumns(10);
		panelDeclinetext.setBackground(new Color(46, 61, 176));
		panelDeclinetext.setBounds(43, 54, 198, 82);
		panel_3.add(panelDeclinetext);
		
	    panel_4 = new JPanel(); 		
		panel_4.setBorder(null);
		panel_4.setBounds(392, 69, 839, 546);
		panel_4.setVisible(false);
		panel_4.setBackground(new Color(146,189,213,252));
		add(panel_4);
		panel_4.setLayout(null);
		
		datetext = new JTextField();
		datetext.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		datetext.setBorder(null);
		datetext.setBackground(new Color(100, 149, 237));
		datetext.setBounds(299, 183, 302, 43);
		panel_4.add(datetext);
		datetext.setColumns(10);
		
		Daystext = new JTextField();
		Daystext.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		Daystext.setBorder(null);
		Daystext.setBackground(new Color(100, 149, 237));
		Daystext.setBounds(299, 252, 302, 43);
		panel_4.add(Daystext);
		Daystext.setColumns(10);
		
		JTextArea reasontext = new JTextArea();
		reasontext.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		reasontext.setBackground(new Color(100, 149, 237));
		reasontext.setBounds(299, 324, 302, 95);
		panel_4.add(reasontext);
		
		JButton BACkbutton = new JButton("CLOSE");
		BACkbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(false);;
			}
		});
		 BACkbutton.setBackground(new Color(46, 61, 176));
		BACkbutton.setForeground(Color.WHITE);
		BACkbutton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		BACkbutton.setBounds(10, 472, 140, 43);
		panel_4.add(BACkbutton);
		
		JButton Approvedbutton = new JButton("APPROVE");
		Approvedbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MySQLConection mysql = new MySQLConection();
				uid = uidtext.getText(); 
				int result= mysql.getStatusApproved(uid, date, days, reason, status);
				try {
					if (result==1) {
						JOptionPane.showMessageDialog( Approvedbutton, "Leave Application is Approved");
						
					} else {

						JOptionPane.showMessageDialog( Approvedbutton, "Leave Application is FAILDED");	
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e2.getMessage()));
				}
			}
		});
		Approvedbutton .setBackground(new Color(46, 61, 176));
		Approvedbutton.setForeground(Color.WHITE);
		Approvedbutton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		Approvedbutton.setBounds(471, 472, 140, 43);
		panel_4.add(Approvedbutton);
		
		JLabel lblNewLabel_2 = new JLabel("Date :");
		lblNewLabel_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(88, 183, 187, 43);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("No. of Days");
		lblNewLabel_2_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(88, 254, 201, 43);
		panel_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Reason :");
		lblNewLabel_2_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(88, 357, 204, 43);
		panel_4.add(lblNewLabel_2_2);
		
		JButton declineButton = new JButton("DECLINE");
		declineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MySQLConection mysql = new MySQLConection();
				uid = uidtext.getText();
				
				int result= mysql.getStatusDeclined(uid, date, days, reason, status);
				try {
					if (result==1) {
						JOptionPane.showMessageDialog( Approvedbutton, "Leave Application is Delclined");
						
					} else {

						JOptionPane.showMessageDialog( Approvedbutton, "Leave Application is FAILDED");	
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e2.getMessage()));
				}	
				
				
			}
		});
		declineButton.setBackground(new Color(46, 61, 176));
		declineButton.setForeground(Color.WHITE);
		declineButton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		declineButton.setBounds(689, 472, 140, 43);
		panel_4.add(declineButton);
		
		uidtext = new JTextField();
		uidtext.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		uidtext.setColumns(10);
		uidtext.setBorder(null);
		uidtext.setBackground(new Color(100, 149, 237));
		uidtext.setBounds(299, 32, 302, 43);
		panel_4.add(uidtext);
		
		JLabel lblNewLabel_2_3 = new JLabel("UID :");
		lblNewLabel_2_3.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(88, 34, 201, 43);
		panel_4.add(lblNewLabel_2_3);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MySQLConection mysql = new MySQLConection();
				//uid = uidtext.getText(); 
		    	ResultSet resultSet = mysql.leavedata(uid, date, days, reason, status, ID);
		    
							
							try {
								
								while(resultSet.next()){
								uidtext.setText(resultSet.getString(2));
								nametext.setText(resultSet.getString(3));
								datetext.setText(resultSet.getString(4));
								Daystext.setText(resultSet.getString(5));
								reasontext.setText(resultSet.getString(6));
								
								}
							} catch (SQLException e1) {
								JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));
								e1.printStackTrace();
							}
						
					
		 	}
	
			
		});
		btnNewButton .setBackground(new Color(46, 61, 176));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		btnNewButton.setBounds(657, 139, 160, 43);
		panel_4.add(btnNewButton);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Name");
		lblNewLabel_2_3_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		lblNewLabel_2_3_1.setBounds(88, 106, 201, 43);
		panel_4.add(lblNewLabel_2_3_1);
		
		nametext = new JTextField();
		nametext.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		nametext.setColumns(10);
		nametext.setBorder(null);
		nametext.setBackground(new Color(100, 149, 237));
		nametext.setBounds(299, 106, 302, 43);
		panel_4.add(nametext);
		
		JButton NEXTbutton_1 = new JButton("NEXT");
		NEXTbutton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MySQLConection mysql = new MySQLConection();
				ResultSet resultSet = mysql.leavedata(uid, date, days, reason, status, ID);
				try {
					
						if(!resultSet.isLast()) {
							
						while(resultSet.next()) {
						
						uidtext.setText(resultSet.getString(2));
						nametext.setText(resultSet.getString(3));
						datetext.setText(resultSet.getString(4));
						Daystext.setText(resultSet.getString(5));
						reasontext.setText(resultSet.getString(6));
						}
					}
					System.out.println("not fetch database");
				} catch (SQLException e2) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e2.getMessage()));
				}
			}
		});
	
		NEXTbutton_1.setForeground(Color.WHITE);
		NEXTbutton_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		NEXTbutton_1.setBackground(new Color(46, 61, 176));
		NEXTbutton_1.setBounds(657, 192, 160, 43);
		panel_4.add(NEXTbutton_1);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nametext.setText(null);
				datetext.setText(null);
				Daystext.setText(null);
				reasontext.setText(null);
				uidtext.setText(null);
				
			}
			
			
			
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		btnClear.setBackground(new Color(46, 61, 176));
		btnClear.setBounds(242, 472, 140, 43);
		panel_4.add(btnClear);
		
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
		btnExit.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		btnExit.setBackground(new Color(46, 61, 176));
		btnExit.setBounds(61, 590, 278, 43);
		add(btnExit);

	//	MySQLConection mysql = new MySQLConection();
		ResultSet resultSet0 = mysql.getleaveapplication(uid, name, date, days, reason, status);
			try {	
			while(resultSet0.next()) {
				panelapprovedtext.setText(resultSet0.getString("rowcount"));
			
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));// TODO: handle exception
		}
			
			ResultSet resultSet1 = mysql. getleaveapplication1(uid, name, date, days, reason, status);
			try {	
			while(resultSet1.next()) {
				panelDeclinetext.setText(resultSet1.getString("row1count"));
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
		
	
	}

	private void panelMethod() {
		// TODO Auto-generated method stub
		
	}
}

