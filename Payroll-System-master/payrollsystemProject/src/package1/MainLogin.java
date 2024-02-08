package package1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.management.OperatingSystemMXBean;
import java.rmi.server.Operation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.plaf.ComboBoxUI;
import javax.xml.xpath.XPathVariableResolver;
import javax.swing.DefaultComboBoxModel;

public class MainLogin {

	//protected static final String Radio = null;
	private JFrame frmDrDyPatil;
	static JTextField TextUserName;
	private JPasswordField pwdEnterThePassword;
	private JComboBox ComboBox;
	private Connection con;
   
	private PreparedStatement preparedStatement;
	private ResultSet resultSet; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin window = new MainLogin();
					window.frmDrDyPatil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDrDyPatil = new JFrame();
		frmDrDyPatil.setIconImage(Toolkit.getDefaultToolkit().getImage(MainLogin.class.getResource("/image/kisspng-dr-d-y-patil-college-of-engineering.png")));
		frmDrDyPatil.setTitle("DR.   D.Y. patil collage of Engineering and Innovation");
		frmDrDyPatil.getContentPane().setBackground(new Color(46, 61, 176,255));
		frmDrDyPatil.setForeground(new Color(72, 209, 204));
		frmDrDyPatil.setEnabled(true);
		frmDrDyPatil.setBackground(new Color(46, 61, 176,255));
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmDrDyPatil.setSize(width,height+10);
		frmDrDyPatil.getContentPane().setLayout(null);
		frmDrDyPatil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 1510, 155);
		panel.setBackground(new Color(146,189,213,252));
		frmDrDyPatil.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel paySystemLogo = new JLabel("");
		paySystemLogo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		paySystemLogo .setIcon(new ImageIcon(HomePage.class.getResource("/image/Untitled1_20220225174414.png")));
		paySystemLogo .setBounds(-5, -7, 1507, 150);
		panel.add(paySystemLogo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-5, 150, 1537, 9);
		panel.add(separator);
		separator.setBackground(new Color(46, 61, 176,255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(146,189,213,252));
		panel_1.setBounds(5, 167, 1510, 649);
		frmDrDyPatil.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(506, 169, 501, 317);
		panel_2.setBackground(new Color(46, 61, 176,255));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 3, 482, 304);
		panel_3.setBackground(new Color(146,189,213,252));
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(4, 5, 474, 48);
		panel_4.setBackground(new Color(46, 61, 176,255));
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel LoginAreaLabel = new JLabel("LOGIN AREA");
		LoginAreaLabel.setForeground(Color.WHITE);
		LoginAreaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LoginAreaLabel.setFont(new Font("Bodoni Bd BT", Font.PLAIN, 25));
		LoginAreaLabel.setBounds(107, 0, 248, 48);
		panel_4.add(LoginAreaLabel);
		
		
		TextUserName = new JTextField();
		TextUserName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TextUserName.setText(null);
			}
			public void mousePressed(MouseEvent e) {
				TextUserName.setText(null);
			}	
		});
		TextUserName.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		TextUserName.setText("Enter User Name");
		TextUserName.setBounds(202, 128, 259, 36);
		panel_3.add(TextUserName);
		TextUserName.setColumns(10);
		
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String uid =TextUserName.getText();
				String passwordStr = pwdEnterThePassword.getText();
				String UserType =  ComboBox.getSelectedItem().toString();
				
				if(uid.equals("")||passwordStr.equals("")||UserType.equals("")) {
					JOptionPane.showMessageDialog(null, "PLease Fill all field");
				}else {
					try {
						con = MySQLConection.getconnection();
						preparedStatement =con.prepareStatement("select *from employee where UID=? and Password=?");
						preparedStatement.setString(1, uid);
						preparedStatement.setString(2, passwordStr);
						resultSet = preparedStatement.executeQuery();
						
						if(resultSet.next()) {
							String s1 = resultSet.getString("Usertype");
							if(UserType.equalsIgnoreCase("Admin") && s1.equalsIgnoreCase("admin")){
								JOptionPane.showMessageDialog(null, "Successfully login in Admin Page");
									HomePage.main(null);
									
							}
							else if(UserType.equalsIgnoreCase("Employee")&& s1.equalsIgnoreCase("employee")){
								JOptionPane.showMessageDialog(null, "Successfully login in Employee Page");
									EmployeeHomePage.main(null);
									
							}else {
									JOptionPane.showMessageDialog(null, "Login failed PLease Input Valid Data");
							}
							System.out.println("running");
						} 
					} catch (Exception e2) {
						JOptionPane.showMessageDialog( null, "Database error:" +  ( e2.getMessage()));
					}
				}
		 	}	

		});
		
		LoginButton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		LoginButton.setBackground(new Color(46, 61, 176,255));
		LoginButton.setBounds(53, 258, 127, 36);
		panel_3.add(LoginButton);
		
		JLabel UserNameLabel = new JLabel("USER NAME    :");
		UserNameLabel.setFont(new Font("Bodoni Bd BT", Font.PLAIN, 20));
		UserNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		UserNameLabel.setBounds(18, 128, 166, 36);
		panel_3.add(UserNameLabel);
		
	
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextUserName.setText(null);
				pwdEnterThePassword.setText(null);
			}
		});
		
		ResetButton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		ResetButton.setBackground(new Color(46, 61, 176,255));
		ResetButton.setBounds(308, 258, 126, 36);
		panel_3.add(ResetButton);
		
		pwdEnterThePassword = new JPasswordField();
		pwdEnterThePassword.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		pwdEnterThePassword.setToolTipText("Enter the Password");
		
		pwdEnterThePassword.setBounds(203, 186, 258, 36);
		panel_3.add(pwdEnterThePassword);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD    :");
		lblNewLabel_1.setFont(new Font("Bodoni Bd BT", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(18, 186, 162, 36);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblSelectUser = new JLabel("SELECT USER :");
		lblSelectUser.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelectUser.setFont(new Font("Bodoni Bd BT", Font.PLAIN, 20));
		lblSelectUser.setBounds(14, 70, 166, 36);
		panel_3.add(lblSelectUser);
		
		ComboBox = new JComboBox();
		ComboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Employee"}));
		ComboBox.setFont(new Font("Arial Black", Font.PLAIN, 20));
		ComboBox.setBackground(new Color(64, 224, 208));
		ComboBox.setForeground(new Color(72, 61, 139));
		ComboBox.setBounds(203, 69, 259, 36);
		panel_3.add(ComboBox);
		
		JLabel lblNewLabel = new JLabel("www.dypatilcoei.com");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 40));
		lblNewLabel.setBounds(501, 548, 550, 42);
		panel_1.add(lblNewLabel);
		JLabel WelComeLabel = new JLabel("WELCOME TO PAYROLL SYSTEM");
		WelComeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		WelComeLabel.setFont(new Font("Arial Black", Font.ITALIC, 40));
		WelComeLabel.setBounds(345, 22, 831, 55);
		panel_1.add(WelComeLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Copyrights 2022 @ PAYROLL SYSTEM");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Bodoni Bk BT", Font.BOLD, 15));
		lblNewLabel_2.setBounds(554, 817, 353, 20);
		frmDrDyPatil.getContentPane().add(lblNewLabel_2);
		
		frmDrDyPatil.setLocationRelativeTo(null);
	
	}	
}
