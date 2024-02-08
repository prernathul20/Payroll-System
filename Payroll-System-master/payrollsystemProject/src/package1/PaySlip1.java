package package1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class PaySlip1 extends JInternalFrame {
	String uid, Name,department,bank,leave,HR, DA,Med,Leave,travell,grosssalary,Netsalary ,firstHalf,SecondHalf, Date,basicsalary ;
	private JTextField UIDtextField;
	private JTextField NametextField_1;
	private JTextField BanktextField_2;
	private JTextField DepartmenttextField_3;
	private JTextField HrtextField_4;
	private JTextField DatextField_5;
	private JTextField MedtextField_6;
	private JTextField TotaltextField_7;
	private JTextField TravelltextField_8;
	private JTextField LeavetextField_9;
	private JTextField grosstextField_10;
	private JTextField NettextField_11;
	private JTextField TaxtextField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaySlip1 frame = new PaySlip1();
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
	public PaySlip1() {
		setDoubleBuffered(true);
	
			setRootPaneCheckingEnabled(false);
			setTitle("Dr. D.Y. patil Collage of Engineering and Innovation ");
			setMaximizable(true);
			setBackground(new Color(100, 149, 237));
			setBorder(null);
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setFrameIcon(new ImageIcon(PanelSalary.class.getResource("/image/kisspng-dr-d-y-patil-college-of-engineering.png")));
			setBounds(0, 0, 650, 589);
			getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setForeground(Color.BLACK);
			panel.setBackground(Color.WHITE);
			panel.setBounds(5, 5, 638, 510);
			getContentPane().add(panel);
			
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
			UIDtextField.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			UIDtextField.setEditable(false);
			UIDtextField.setDisabledTextColor(Color.WHITE);
			UIDtextField.setColumns(10);
			UIDtextField.setBorder(null);
			UIDtextField.setBackground(Color.WHITE);
			UIDtextField.setBounds(138, 59, 191, 28);
			panel.add(UIDtextField);
			
			NametextField_1 = new JTextField();
			NametextField_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			NametextField_1.setEditable(false);
			NametextField_1.setColumns(10);
			NametextField_1.setBorder(null);
			NametextField_1.setBackground(Color.WHITE);
			NametextField_1.setBounds(138, 96, 191, 28);
			panel.add(NametextField_1);
			
			BanktextField_2 = new JTextField();
			BanktextField_2.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			BanktextField_2.setEditable(false);
			BanktextField_2.setColumns(10);
			BanktextField_2.setBorder(null);
			BanktextField_2.setBackground(Color.WHITE);
			BanktextField_2.setBounds(439, 58, 191, 28);
			panel.add(BanktextField_2);
			
			DepartmenttextField_3 = new JTextField();
			DepartmenttextField_3.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			DepartmenttextField_3.setEditable(false);
			DepartmenttextField_3.setColumns(10);
			DepartmenttextField_3.setBorder(null);
			DepartmenttextField_3.setBackground(Color.WHITE);
			DepartmenttextField_3.setBounds(439, 96, 191, 28);
			panel.add(DepartmenttextField_3);
			
			HrtextField_4 = new JTextField();
			HrtextField_4.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			HrtextField_4.setEditable(false);
			HrtextField_4.setColumns(10);
			HrtextField_4.setBorder(null);
			HrtextField_4.setBackground(Color.WHITE);
			HrtextField_4.setBounds(104, 139, 191, 28);
			panel.add(HrtextField_4);
			
			DatextField_5 = new JTextField();
			DatextField_5.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			DatextField_5.setEditable(false);
			DatextField_5.setColumns(10);
			DatextField_5.setBorder(null);
			DatextField_5.setBackground(Color.WHITE);
			DatextField_5.setBounds(104, 175, 191, 28);
			panel.add(DatextField_5);
			
			MedtextField_6 = new JTextField();
			MedtextField_6.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			MedtextField_6.setEditable(false);
			MedtextField_6.setColumns(10);
			MedtextField_6.setBorder(null);
			MedtextField_6.setBackground(Color.WHITE);
			MedtextField_6.setBounds(104, 213, 191, 28);
			panel.add(MedtextField_6);
			
			TotaltextField_7 = new JTextField();
			TotaltextField_7.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			TotaltextField_7.setEditable(false);
			TotaltextField_7.setColumns(10);
			TotaltextField_7.setBorder(null);
			TotaltextField_7.setBackground(Color.WHITE);
			TotaltextField_7.setBounds(412, 211, 191, 28);
			panel.add(TotaltextField_7);
			
			TravelltextField_8 = new JTextField();
			TravelltextField_8.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			TravelltextField_8.setEditable(false);
			TravelltextField_8.setColumns(10);
			TravelltextField_8.setBorder(null);
			TravelltextField_8.setBackground(Color.WHITE);
			TravelltextField_8.setBounds(412, 175, 191, 28);
			panel.add(TravelltextField_8);
			
			LeavetextField_9 = new JTextField();
			LeavetextField_9.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			LeavetextField_9.setEditable(false);
			LeavetextField_9.setColumns(10);
			LeavetextField_9.setBorder(null);
			LeavetextField_9.setBackground(Color.WHITE);
			LeavetextField_9.setBounds(412, 139, 191, 28);
			panel.add(LeavetextField_9);
			
			grosstextField_10 = new JTextField();
			grosstextField_10.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			grosstextField_10.setEditable(false);
			grosstextField_10.setColumns(10);
			grosstextField_10.setBorder(null);
			grosstextField_10.setBackground(Color.WHITE);
			grosstextField_10.setBounds(149, 279, 367, 28);
			panel.add(grosstextField_10);
			
			NettextField_11 = new JTextField();
			NettextField_11.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			NettextField_11.setEditable(false);
			NettextField_11.setColumns(10);
			NettextField_11.setBorder(null);
			NettextField_11.setBackground(Color.WHITE);
			NettextField_11.setBounds(149, 315, 367, 28);
			panel.add(NettextField_11);
			
			TaxtextField_12 = new JTextField();
			TaxtextField_12.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
			TaxtextField_12.setEditable(false);
			TaxtextField_12.setColumns(10);
			TaxtextField_12.setBorder(null);
			TaxtextField_12.setBackground(Color.WHITE);
			TaxtextField_12.setBounds(149, 351, 367, 28);
			panel.add(TaxtextField_12);
			
			JButton NewButton_1_1 = new JButton("CLOSE");
			NewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					PanelSalaryEmp.panel_1.setVisible(false);
				}
			});
			NewButton_1_1.setForeground(Color.WHITE);
			NewButton_1_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
			NewButton_1_1.setBackground(new Color(46, 61, 176));
			NewButton_1_1.setBounds(5, 520, 264, 37);
			getContentPane().add(NewButton_1_1);
			
			JButton PrintbtnNewButton_1 = new JButton("Print");
			PrintbtnNewButton_1.addActionListener(new ActionListener() {
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
			PrintbtnNewButton_1.setForeground(Color.WHITE);
			PrintbtnNewButton_1.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 30));
			PrintbtnNewButton_1.setBackground(new Color(46, 61, 176));
			PrintbtnNewButton_1.setBounds(387, 520, 253, 37);
			getContentPane().add(PrintbtnNewButton_1);
			
			
			

			MySQLConection mysql = new MySQLConection();
			uid = MainLogin.TextUserName.getText();
			ResultSet resultSet  = mysql.getSalary(uid, bank, leave, Name, department, HR, DA, Med, Leave, travell, grosssalary, Netsalary, basicsalary);
			
			
				try {
					while(resultSet.next()) {
							UIDtextField.setText(MainLogin.TextUserName.getText());
							datetextArea.setText(" PAY SLIP FOR THE DATE OF "+resultSet.getString("Date")+"  ");
							NametextField_1.setText(resultSet.getString("name"));
							DepartmenttextField_3.setText(resultSet.getString("Department"));
							BanktextField_2.setText(resultSet.getString("Bank"));
							LeavetextField_9.setText(resultSet.getString("Leave"));
						//	leave1textField.setText(resultSet.getString("leaveDays"));
							HrtextField_4.setText(resultSet.getString("hr"));
							DatextField_5.setText(resultSet.getString("da"));
							MedtextField_6.setText(resultSet.getString("med"));
							TravelltextField_8.setText(resultSet.getString("travell"));
							float tot = Float.parseFloat(MedtextField_6.getText())+Float.parseFloat(TravelltextField_8.getText())+Float.parseFloat(HrtextField_4.getText())+Float.parseFloat(DatextField_5.getText());

							TotaltextField_7.setText(Float.toString(tot));								
						
							
							float gross = tot + Float.parseFloat(resultSet.getString("basicsalary"));
						
							grosstextField_10.setText(String.valueOf(gross));
							
						
							float tax = (float) (gross*2.1/100);
							TaxtextField_12.setText(String.valueOf(tax));
							float net = gross -	Float.parseFloat(LeavetextField_9.getText())-tax;
							NettextField_11.setText(Float.toString(net));
						
					}
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));
					e1.printStackTrace();
				}
			System.out.println("--------------------------------------------------------------------------------------------------------");
		

	}
}
