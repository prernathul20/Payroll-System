package package1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelLeaveEmp extends JPanel {
	String uid,date,Reason,status;

	String Days,reason,name;

	private JTextField txtClickHere;
	private JPanel panel3 ;
	private JTextField txtClickHere_1;
	private JPanel panel_2 ;
	private JSpinner noDaysspinner;
	private JTextField statustext1;
	private JTextField UIDtextField;
	private JTextField NametextField;
	private JTextField DatetextField;
	private JTextField DaystextField;
	
	
	public PanelLeaveEmp() {
		setBounds(0, 0, 1255, 656);
		setBackground(new Color(146,189,213,252));
		setLayout(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1255, 47);
		panel.setBackground(new Color(46, 61, 176,255));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Leave");
		lblNewLabel .setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel .setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel .setForeground(Color.WHITE);
		lblNewLabel .setBackground(Color.WHITE);
		lblNewLabel .setBounds(505, 0, 210, 38);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				panel3.setVisible(true);
				panel_2.setVisible(false);
			}
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(new Color(0, 139, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(new Color(46, 61, 176,255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_1.setBackground(new Color(46, 61, 176,255));
			}
		});
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(46, 61, 176));
		panel_1.setBounds(33, 100, 281, 161);
		add(panel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 56, 281, 7);
		panel_1.add(separator);
		
		JLabel applyleave = new JLabel("APPLY LEAVE");
		applyleave.setHorizontalAlignment(SwingConstants.CENTER);
		applyleave.setForeground(Color.WHITE);
		applyleave.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		applyleave.setBounds(36, 0, 209, 54);
		panel_1.add(applyleave);
		
		txtClickHere = new JTextField();
		txtClickHere.setForeground(Color.WHITE);
		txtClickHere.setHorizontalAlignment(SwingConstants.CENTER);
		txtClickHere.setText("CLICK HERE");
		txtClickHere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				panel3.setVisible(true);
				panel_2.setVisible(false);
			}
			public void mouseEntered(MouseEvent e) {
				txtClickHere.setBackground(new Color(20, 139, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtClickHere.setBackground(new Color(46, 61, 176,255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				txtClickHere.setBackground(new Color(70, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				txtClickHere.setBackground(new Color(46, 61, 176,255));
			}
		});
		txtClickHere.setMargin(new Insets(0, 0, 0, 0));
		txtClickHere.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 45));
		txtClickHere.setEditable(false);
		txtClickHere.setColumns(10);
		txtClickHere.setBorder(null);
		txtClickHere.setBackground(new Color(46, 61, 176));
		txtClickHere.setBounds(10, 75, 261, 62);
		panel_1.add(txtClickHere);
		
		panel3 = new JPanel();
		panel3.setBackground(new Color(146,189,213,252));
		panel3.setBounds(419, 58, 813, 588);
		panel3.setVisible(false);
		add(panel3);
		panel3.setLayout(null); 
		
		JLabel lblNewLabel_1_1 = new JLabel("From Date    :");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(45, 100, 265, 33);
		panel3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("No. of Days  :");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(45, 278, 265, 33);
		panel3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Reason       :");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(50, 404, 270, 33);
		panel3.add(lblNewLabel_3);
		
		JCalendar calender = new JCalendar();
		calender.getDayChooser().setBackground(new Color(100, 149, 237));
		calender.getMonthChooser().getComboBox().setBackground(new Color(173, 216, 230));
		calender.getYearChooser().getSpinner().setBackground(new Color(173, 216, 230));
		calender.setDecorationBackgroundColor(new Color(100, 149, 237));
		calender.setBackground(new Color(135, 206, 235));
		calender.setBounds(327, 10, 362, 225);
		panel3.add(calender);
		
		noDaysspinner = new JSpinner();
		noDaysspinner.setBackground(new Color(100, 149, 237));
		noDaysspinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		noDaysspinner.setBounds(321, 282, 368, 33);
		panel3.add(noDaysspinner);
		
		JTextArea reasontextArea = new JTextArea();
		reasontextArea.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		reasontextArea.setBackground(new Color(100, 149, 237));
		reasontextArea.setBounds(321, 343, 368, 140);
		panel3.add(reasontextArea);
		
		JButton btnNewButton = new JButton("LEAVE APPLY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uid = MainLogin.TextUserName.getText();
				SimpleDateFormat sdf = new SimpleDateFormat();
				date = sdf.format(calender.getDate());
				Days= noDaysspinner.getValue().toString();
				Reason = reasontextArea.getText(); 
				MySQLConection mysql = new MySQLConection();
				int status =mysql.insertData(uid, Reason, Days,date); {
				try {
					
					
					if(status==1) {
						JOptionPane.showMessageDialog(null, "Successfully Applied");
					}else {
						JOptionPane.showMessageDialog(null, "Failed to  Apply");
					}
			System.out.println(uid+date+Reason+noDaysspinner);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));
					e1.printStackTrace();
				}
				}
			}
	
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(46, 61, 176));
		btnNewButton.setBounds(545, 525, 258, 39);
		panel3.add(btnNewButton);
		
		JButton CloseNewButton_1 = new JButton("CLEAR");
		CloseNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reasontextArea.setText(null);
				noDaysspinner.setValue(1);
				calender.setActionMap(null);
				
			}
		});
		CloseNewButton_1.setForeground(Color.WHITE);
		CloseNewButton_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		CloseNewButton_1.setBackground(new Color(46, 61, 176));
		CloseNewButton_1.setBounds(278, 525, 258, 39);
		panel3.add(CloseNewButton_1);
		
		JButton BackButton_1_2 = new JButton("CLOSE");
		BackButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel3.setVisible(false);
			}
		});
		BackButton_1_2.setForeground(Color.WHITE);
		BackButton_1_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		BackButton_1_2.setBackground(new Color(46, 61, 176));
		BackButton_1_2.setBounds(10, 525, 258, 39);
		panel3.add(BackButton_1_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				panel3.setVisible(false);
				panel_2.setVisible(true);
				
			}
			public void mouseEntered(MouseEvent e) {
				panel_1_1.setBackground(new Color(0, 139, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_1.setBackground(new Color(46, 61, 176,255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1_1.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_1_1.setBackground(new Color(46, 61, 176,255));
			}
		});

		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(46, 61, 176));
		panel_1_1.setBounds(34, 357, 281, 161);
		add(panel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 56, 281, 7);
		panel_1_1.add(separator_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("STATUS");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_4_1.setBounds(36, 0, 209, 54);
		panel_1_1.add(lblNewLabel_4_1);
		
		txtClickHere_1 = new JTextField();
		txtClickHere_1.setForeground(Color.WHITE);
		txtClickHere_1.setText("CLICK HERE");
		txtClickHere_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					panel3.setVisible(false);
					panel_2.setVisible(true);
				
			}
			public void mouseEntered(MouseEvent e) {
				txtClickHere_1.setBackground(new Color(20, 139, 139));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtClickHere_1.setBackground(new Color(46, 61, 176,255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				txtClickHere_1.setBackground(new Color(70, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				txtClickHere_1.setBackground(new Color(46, 61, 176,255));
			}
		});
		txtClickHere_1.setMargin(new Insets(0, 0, 0, 0));
		txtClickHere_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 45));
		txtClickHere_1.setEditable(false);
		txtClickHere_1.setColumns(10);
		txtClickHere_1.setBorder(null);
		txtClickHere_1.setBackground(new Color(46, 61, 176));
		txtClickHere_1.setBounds(10, 68, 261, 83);
		panel_1_1.add(txtClickHere_1);
		
		panel_2 = new JPanel();
		
		panel_2.setBackground(new Color(146,189,213,252));
		panel_2.setBounds(419, 57, 813, 589);
		add(panel_2);
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		statustext1 = new JTextField();
		statustext1.setEditable(false);
		statustext1.setForeground(new Color(255, 255, 255));
		statustext1.setBackground(new Color(46, 61, 176,255));
		statustext1.setHorizontalAlignment(SwingConstants.CENTER);
		statustext1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 80));
		statustext1.setColumns(10);
		statustext1.setBounds(118, 381, 611, 94);
		panel_2.add(statustext1);
		
		JLabel lblNewLabel_2 = new JLabel("UID          :");
		lblNewLabel_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(118, 42, 193, 37);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Name        :");
		lblNewLabel_2_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_2_2.setBounds(118, 105, 193, 37);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Date          :");
		lblNewLabel_2_3.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_2_3.setBounds(118, 169, 193, 37);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Days         :");
		lblNewLabel_2_4.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_2_4.setBounds(118, 242, 193, 37);
		panel_2.add(lblNewLabel_2_4);
		
		UIDtextField = new JTextField();
		UIDtextField.setBackground(new Color(46, 61, 176,255));
		UIDtextField.setEditable(false);
		UIDtextField.setForeground(new Color(135, 206, 235));
		UIDtextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		UIDtextField.setBounds(330, 42, 399, 37);
		panel_2.add(UIDtextField);
		UIDtextField.setColumns(10);
		
		NametextField = new JTextField();
		NametextField.setBackground(new Color(46, 61, 176,255));
		NametextField.setForeground(new Color(135, 206, 235));
		NametextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		NametextField.setEditable(false);
		NametextField.setColumns(10);
		NametextField.setBounds(330, 105, 399, 37);
		panel_2.add(NametextField);
		
		DatetextField = new JTextField();
		DatetextField.setBackground(new Color(46, 61, 176,255));
		DatetextField.setEditable(false);
		DatetextField.setForeground(new Color(135, 206, 235));
		DatetextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		DatetextField.setColumns(10);
		DatetextField.setBounds(330, 169, 399, 37);
		panel_2.add(DatetextField);
		
		DaystextField = new JTextField();
		DaystextField.setBackground(new Color(46, 61, 176,255));
		DaystextField.setEditable(false);
		DaystextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		DaystextField.setForeground(new Color(135, 206, 235));
		DaystextField.setColumns(10);
		DaystextField.setBounds(330, 242, 399, 37);
		panel_2.add(DaystextField);
		
		JButton NewButton_1_1_2 = new JButton("CLOSE");
		NewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				
			}
		});
		NewButton_1_1_2.setForeground(Color.WHITE);
		NewButton_1_1_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		NewButton_1_1_2.setBackground(new Color(46, 61, 176));
		NewButton_1_1_2.setBounds(261, 527, 281, 39);
		panel_2.add(NewButton_1_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("STATUS");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_1_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
		lblNewLabel_4_1_1.setBounds(319, 328, 209, 54);
		panel_2.add(lblNewLabel_4_1_1);
		
		JButton CloseNewButton_1_1 = new JButton("BACK");
		CloseNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelMyAccountEmp panelMyAccountEmp = new PanelMyAccountEmp();
				panelMyAccountEmp.setVisible(true);
				EmployeeHomePage.contentpanel.add(panelMyAccountEmp );
				setVisible(false);
				
				
			}
		});
		CloseNewButton_1_1.setForeground(Color.WHITE);
		CloseNewButton_1_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		CloseNewButton_1_1.setBackground(new Color(46, 61, 176));
		CloseNewButton_1_1.setBounds(33, 592, 281, 39);
		add(CloseNewButton_1_1);
		setVisible(true);
		
		MySQLConection mysql = new MySQLConection();
		uid = MainLogin.TextUserName.getText();
		ResultSet resultSet= mysql.getRowleave(uid, name, date, Days, reason, status);
	
		try {
			while(resultSet.next()) {
				UIDtextField.setText(resultSet.getString("UID"));
				NametextField.setText(resultSet.getString("name"));
				DatetextField.setText(resultSet.getString("fromDate"));
				DaystextField.setText(resultSet.getString("NoofDays"));
				statustext1.setText(resultSet.getString("status"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
			
		}
		
	}
}
