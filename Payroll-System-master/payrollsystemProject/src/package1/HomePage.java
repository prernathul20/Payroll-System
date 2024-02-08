package package1;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

public class HomePage {

	private JFrame frmDrDyPatil;
	private AdminStatus adminStatus;
	private PanelEmployeeUpdate panelEmployeeUpdate;
	private PanelAddEmpolyee panelAddEmpolyee;
	private PanelDeleteEmployee panelDeleteEmployee;
	private PanelEmployeeList panelEmployeeList;
	private PanelEmployeeDetail panelEmployeeDetail;
	private PanelLeave panelLeave;
	private PanelSalary panelSalary;
	private PanelAttendance attendance;
	static public 	JPanel PanelContentpanel ;
	
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frmDrDyPatil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public  HomePage() {
		initialize();
	}
	
public   void initialize() {
		frmDrDyPatil = new JFrame();
		frmDrDyPatil.setTitle("Dr. D.Y. Patil Collage of Engineering and Innovation");
		frmDrDyPatil.setIconImage(Toolkit.getDefaultToolkit().getImage(HomePage.class.getResource("/image/kisspng-dr-d-y-patil-college-of-engineering.png")));
		frmDrDyPatil.getContentPane().setBackground(new Color(46, 61, 176,255));
		frmDrDyPatil.setForeground(null);
		frmDrDyPatil.setEnabled(true);
		frmDrDyPatil.setBackground(new Color(46, 61, 176,255));
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmDrDyPatil.setSize(width,height+10);
		frmDrDyPatil.getContentPane().setLayout(null);
		frmDrDyPatil.setLocationRelativeTo(null);
		frmDrDyPatil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			panel.setBounds(5, 163, 249, 656);
			panel.setBackground(new Color(146,189,213,252));
			frmDrDyPatil.getContentPane().add(panel);
			panel.setLayout(null);
			
			JPanel HomeMenuPane = new JPanel();
			HomeMenuPane.setBounds(10, 57, 226, 462);
			panel.add(HomeMenuPane);
			HomeMenuPane.setBackground(new Color(46, 61, 176,255));
			HomeMenuPane.setLayout(null);
			
			JPanel paneEmployeeUpdate = new JPanel();
			paneEmployeeUpdate.setBounds(7, 7, 212, 46);
			paneEmployeeUpdate.addMouseListener(new PanelButtonMouseAdapter(paneEmployeeUpdate) {
				
					@Override
					public void mouseClicked(MouseEvent e) {
						menuClicked(panelEmployeeUpdate);
					}
				}
			);
			HomeMenuPane.add(paneEmployeeUpdate);
			paneEmployeeUpdate.setLayout(null);
			paneEmployeeUpdate.setBackground(new Color(146,189,213,252));
			
			JLabel EmpUpdateLabel = new JLabel("Employee Update");
			EmpUpdateLabel.setBackground(new Color(0, 139, 139));
			EmpUpdateLabel.setForeground(Color.WHITE);
			EmpUpdateLabel.setHorizontalAlignment(SwingConstants.LEFT);
			EmpUpdateLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
			EmpUpdateLabel.setBounds(10, 10, 202, 31);
			paneEmployeeUpdate.add(EmpUpdateLabel);
			
			JPanel paneAddEmployee = new JPanel();
			paneAddEmployee.setBounds(7, 57, 212, 46);
			paneAddEmployee.addMouseListener(new PanelButtonMouseAdapter(paneAddEmployee) {
					@Override
					public void mouseClicked(MouseEvent e) {
						menuClicked(panelAddEmpolyee);
					}
				}
			);
			HomeMenuPane.add(paneAddEmployee);
			paneAddEmployee.setLayout(null);
			paneAddEmployee.setBackground(new Color(146,189,213,252));
			
			JLabel AddempLabel = new JLabel("Add Employee");
			AddempLabel.setHorizontalAlignment(SwingConstants.LEFT);
			AddempLabel.setForeground(Color.WHITE);
			AddempLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
			AddempLabel.setBounds(10, 10, 202, 31);
			paneAddEmployee.add(AddempLabel);
			
			JPanel paneDeleteEmployee = new JPanel();
			paneDeleteEmployee.setBounds(7, 107, 212, 47);
			paneDeleteEmployee.addMouseListener(new PanelButtonMouseAdapter(paneDeleteEmployee) {
					@Override
					public void mouseClicked(MouseEvent e) {
						menuClicked(panelDeleteEmployee);
					}
				}
			);
			HomeMenuPane.add(paneDeleteEmployee);
			paneDeleteEmployee.setLayout(null);
			paneDeleteEmployee.setBackground(new Color(146,189,213,252));
			
			JLabel DeleteLabel = new JLabel("Delete Employee");
			DeleteLabel.setForeground(Color.WHITE);
			DeleteLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
			DeleteLabel.setBounds(10, 10, 202, 27);
			paneDeleteEmployee.add(DeleteLabel);
			
			JPanel paneEmployeeReport = new JPanel();
			paneEmployeeReport.setBounds(7, 158, 212, 46);
			paneEmployeeReport.addMouseListener(new PanelButtonMouseAdapter(paneEmployeeReport) {
					@Override
					public void mouseClicked(MouseEvent e) {
						menuClicked(panelEmployeeDetail);
					
					}
				}
			);
			HomeMenuPane.add(paneEmployeeReport);
			paneEmployeeReport.setLayout(null);
			paneEmployeeReport.setBackground(new Color(146,189,213,252));
			
			JLabel EmpReortLabel = new JLabel("Employee Detail");
			EmpReortLabel.setForeground(Color.WHITE);
			EmpReortLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
			EmpReortLabel.setBounds(10, 10, 202, 31);
			paneEmployeeReport.add(EmpReortLabel);
			
			JPanel paneEmployeeList = new JPanel();
			paneEmployeeList.setBounds(7, 208, 212, 46);
			paneEmployeeList.addMouseListener(new PanelButtonMouseAdapter(paneEmployeeList) {
					@Override
					public void mouseClicked(MouseEvent e) {
						menuClicked(panelEmployeeList);
					}
				}
			);
			HomeMenuPane.add(paneEmployeeList);
			paneEmployeeList.setLayout(null);
			paneEmployeeList.setBackground(new Color(146,189,213,252));
			
			JLabel EmpListLabel = new JLabel("Employe List");
			EmpListLabel.setForeground(Color.WHITE);
			EmpListLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
			EmpListLabel.setBounds(10, 10, 202, 31);
			paneEmployeeList.add(EmpListLabel);
			
			JPanel paneLeave = new JPanel();
			paneLeave.setBounds(7, 258, 212, 46);
			paneLeave.addMouseListener(new PanelButtonMouseAdapter(paneLeave) {
					@Override
					public void mouseClicked(MouseEvent e) {
						menuClicked(panelLeave);
					}
				}
			);
			HomeMenuPane.add(paneLeave);
			paneLeave.setLayout(null);
			paneLeave.setBackground(new Color(146,189,213,252));
			
			JLabel Leavelabel = new JLabel("Leave");
			Leavelabel.setHorizontalAlignment(SwingConstants.LEFT);
			Leavelabel.setForeground(Color.WHITE);
			Leavelabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
			Leavelabel.setBounds(10, 10, 202, 31);
			paneLeave.add(Leavelabel);
			
			JPanel paneSalary = new JPanel();
			paneSalary.setBounds(7, 308, 212, 47);
			paneSalary.addMouseListener(new PanelButtonMouseAdapter(paneSalary) {
					@Override
					public void mouseClicked(MouseEvent e) {
						menuClicked(panelSalary);
					}
				}
			);
			HomeMenuPane.add(paneSalary);
			paneSalary.setLayout(null);
			paneSalary.setBackground(new Color(146,189,213,252));
			
			JLabel SalaryLabel = new JLabel("Salary");
			SalaryLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
			SalaryLabel.setHorizontalAlignment(SwingConstants.LEFT);
			SalaryLabel.setForeground(Color.WHITE);
			SalaryLabel.setBounds(10, 10, 202, 31);
			paneSalary.add(SalaryLabel);
			
			JPanel paneSalaryReport = new JPanel();
			paneSalaryReport.setBounds(7, 359, 212, 46);
			paneSalaryReport.addMouseListener(new PanelButtonMouseAdapter(paneSalaryReport) {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						menuClicked(attendance);
					}
				}
			);
			HomeMenuPane.add(paneSalaryReport);
			paneSalaryReport.setLayout(null);
			paneSalaryReport.setBackground(new Color(146,189,213,252));
			
			JLabel SalaryReportLabel = new JLabel("Attendence");
			SalaryReportLabel.setHorizontalAlignment(SwingConstants.LEFT);
			SalaryReportLabel.setForeground(Color.WHITE);
			SalaryReportLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
			SalaryReportLabel.setBounds(10, 10, 202, 31);
			paneSalaryReport.add(SalaryReportLabel);
			
			JPanel paneLogout = new JPanel();
			paneLogout.setBounds(7, 409, 212, 46);
			paneLogout.addMouseListener(new PanelButtonMouseAdapter(paneLogout) {
				@Override
				public void mouseClicked(MouseEvent e) {
					MainLogin.main(null);
				}
				
			});
			HomeMenuPane.add(paneLogout);
			paneLogout.setLayout(null);
			paneLogout.setBackground(new Color(146,189,213,252));
			
			
			JLabel LogoutLabel = new JLabel("Logout");
			LogoutLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
			LogoutLabel.setHorizontalAlignment(SwingConstants.LEFT);
			LogoutLabel.setForeground(Color.WHITE);
			LogoutLabel.setBounds(10, 10, 202, 31);
			paneLogout.add(LogoutLabel);
				
				JPanel Homepane = new JPanel();
				Homepane.setBackground(new Color(46, 61, 176,255));
				Homepane.setBounds(0, 0, 249, 47);
				panel.add(Homepane);
				Homepane.setLayout(null);
				
				JLabel LabelHome = new JLabel("Home");
				LabelHome.setHorizontalAlignment(SwingConstants.CENTER);
				LabelHome.setForeground(Color.WHITE);
				LabelHome.setFont(new Font("Arial Black", Font.PLAIN, 30));
				LabelHome.setBounds(10, 0, 208, 47);
				Homepane.add(LabelHome);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(10, 521, 226, 125);
				panel.add(panel_3);
				panel_3.setBackground(new Color(146,189,213,252));
				panel_3.setLayout(null);
				
				JLabel lblDrDyPatil = new JLabel("");
				lblDrDyPatil.setIcon(new ImageIcon(HomePage.class.getResource("/image/PngItem_1111076.png")));
				lblDrDyPatil.setBounds(0, 10, 226, 115);
				panel_3.add(lblDrDyPatil);
							
							
							
							JPanel panel_1 = new JPanel();
							panel_1.setBounds(5, 5, 1510, 205);
							frmDrDyPatil.getContentPane().add(panel_1);
							panel_1.setBackground(new Color(146,189,213,252));
							panel_1.setLayout(null);
							
							JLabel lblNewLabel = new JLabel("");
							lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
							lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("/image/Untitled1_20220225174414.png")));
							lblNewLabel.setBounds(-5, -7, 1507, 150);
							panel_1.add(lblNewLabel);
							
							
							
							JSeparator separator_1 = new JSeparator();
							separator_1.setBounds(-5, 150, 1537, 9);
							separator_1.setBackground(new Color(46, 61, 176,255));
							panel_1.add(separator_1);
								
								
								
								
								
								
								JPanel panel_2 = new JPanel();
								panel_2.setBounds(255, 158, 1255, 47);
								panel_1.add(panel_2);
								panel_2.setBackground(new Color(46, 61, 176,255));
								panel_2.setLayout(null);
								
								JLabel lblNewLabel_1 = new JLabel("WelCome to Admin Login");
								lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 30));
								lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
								lblNewLabel_1.setForeground(Color.WHITE);
								lblNewLabel_1.setBounds(357, 10, 518, 27);
								panel_2.add(lblNewLabel_1);
								
								
								
								
								 	adminStatus = new AdminStatus();
									panelEmployeeUpdate = new PanelEmployeeUpdate();
									panelAddEmpolyee = new PanelAddEmpolyee();
									panelDeleteEmployee = new PanelDeleteEmployee();
									panelEmployeeList =new PanelEmployeeList();
									panelEmployeeDetail = new PanelEmployeeDetail();
									panelLeave =new PanelLeave();
									panelSalary =new PanelSalary();
									attendance = new PanelAttendance();
									
									
									PanelContentpanel = new JPanel();
									PanelContentpanel.setBounds(260, 163, 1255, 656);
									frmDrDyPatil.getContentPane().add(PanelContentpanel);
									PanelContentpanel.setBackground(new Color(146,189,213,252));
									PanelContentpanel.setLayout(null);
									
									PanelContentpanel.add(adminStatus);
									PanelContentpanel.add(panelEmployeeUpdate);
									PanelContentpanel.add(panelAddEmpolyee);
									PanelContentpanel.add(panelDeleteEmployee);
									PanelContentpanel.add(panelEmployeeList);
									PanelContentpanel.add(panelEmployeeDetail);
									PanelContentpanel.add(panelLeave);
									PanelContentpanel.add(panelSalary);
									PanelContentpanel.add(attendance);
									menuClicked(adminStatus);
									
									JLabel lblNewLabel_2 = new JLabel("Copyrights 2022 @ PAYROLL SYSTEM");
									lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
									lblNewLabel_2.setForeground(Color.WHITE);
									lblNewLabel_2.setFont(new Font("Bodoni Bk BT", Font.BOLD, 15));
									lblNewLabel_2.setBounds(673, 817, 353, 20);
									frmDrDyPatil.getContentPane().add(lblNewLabel_2);
		

					
	}
	public void menuClicked(JPanel PanelContentpanel) {
		
		adminStatus.setVisible(false);
		panelEmployeeUpdate.setVisible(false);
		panelAddEmpolyee.setVisible(false);
		panelDeleteEmployee.setVisible(false);
		panelEmployeeDetail.setVisible(false);
		panelEmployeeList.setVisible(false);
		panelLeave.setVisible(false);
		panelSalary.setVisible(false);
		attendance.setVisible(false);
		PanelContentpanel.setVisible(true);
		
		
		
	}
	
	public class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(0, 139, 139));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(146,189,213,252));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(146,189,213,252));
		}
	}
}








