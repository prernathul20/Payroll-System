package package1;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;

public class PanelEmployeeList extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelEmployeeList() {
	
		setBounds(0,0,1257, 656);
		setBackground(new Color(146,189,213,252));
		setLayout(null);


		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1255, 47);
		panel_1.setBackground(new Color(46, 61, 176,255));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel EmpListLabel = new JLabel("Employee List");
		EmpListLabel.setHorizontalAlignment(SwingConstants.CENTER);
		EmpListLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		 EmpListLabel.setForeground(Color.WHITE);
		 EmpListLabel.setBackground(Color.WHITE);
		 EmpListLabel.setBounds(505, 0, 210, 38);
		panel_1.add(EmpListLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(313, 645, 932, -527);
		add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(453, 174, -304, 149);
		add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Employee List");
		lblNewLabel.setBounds(427, 71, 356, 57);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 28));
		add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(415, 174, 717, -31);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 138, 1179, 5);
		add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setEnabled(false);
		scrollPane.setAutoscrolls(true);
		scrollPane.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 20));
		scrollPane.setViewportBorder(null);
		scrollPane.setForeground(Color.BLUE);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.setBounds(10, 187, 1235, 307);
		scrollPane.setForeground(getBackground());
		scrollPane.setBackground(new Color(146,189,213,252));
		add(scrollPane);
		
		table = new JTable();
		table.setPreferredScrollableViewportSize(new Dimension(511, 400));
		table.setOpaque(false);
		table.setRowHeight(20);
		table.	setBackground(new Color(146,189,213,252));
		table.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Sr no.", "UID", "name", "gender", "address", "state", "city", "pincode", "mobile", "Degree", "Designation", "Department", "email", "Bank Account", "salary"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(39);
		table.getColumnModel().getColumn(1).setPreferredWidth(79);
		table.getColumnModel().getColumn(2).setPreferredWidth(132);
		table.getColumnModel().getColumn(4).setPreferredWidth(115);
		table.getColumnModel().getColumn(5).setPreferredWidth(94);
		table.getColumnModel().getColumn(6).setPreferredWidth(94);
		table.getColumnModel().getColumn(7).setPreferredWidth(92);
		table.getColumnModel().getColumn(8).setPreferredWidth(132);
		table.getColumnModel().getColumn(9).setPreferredWidth(98);
		table.getColumnModel().getColumn(10).setPreferredWidth(122);
		table.getColumnModel().getColumn(11).setPreferredWidth(115);
		table.getColumnModel().getColumn(12).setPreferredWidth(109);
		table.getColumnModel().getColumn(13).setPreferredWidth(132);
		table.getColumnModel().getColumn(14).setPreferredWidth(103);
		scrollPane.setViewportView(table);
		JButton btnNewButton = new JButton("Show Table");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Bodoni Bk BT", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(46, 61, 176,255));
		btnNewButton.setBounds(10, 88, 321, 27);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MySQLConection mysql = new MySQLConection();
				ResultSet resultSet = mysql.getTable();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String [] columnNames = {"Sr no.","UID", "Name", "Gender", "Address", "State", "City", "Pincode", "Mobile_No", "Degree", "Designation", "Department", "Bank", "Email", "salary"};
				model.setColumnIdentifiers(columnNames);
				model.setRowCount(0);
				try {
					while(resultSet.next()) {
						model.addRow(new Object [] {
								resultSet.getString(1),
								resultSet.getString(2),
								resultSet.getString(3),
								resultSet.getString(4),
								resultSet.getString(5),
								resultSet.getString(6),
								resultSet.getString(7),
								resultSet.getString(8),
								resultSet.getString(9),
								resultSet.getString(10),
								resultSet.getString(11),
								resultSet.getString(12),
								resultSet.getString(13),
								resultSet.getString(14),
								resultSet.getString(15)
								
						});
					}		
				} catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));
				}
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				System.out.println("succeefully builded");
		
				
					
				
			}
			
			
			
		});
		add(btnNewButton);
		
		JButton Button = new JButton("BACK");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminStatus adminStatus = new AdminStatus();
				adminStatus.setVisible(true);
				HomePage.PanelContentpanel.add(adminStatus);
				setVisible(false);
			}
		});
		Button.setForeground(Color.WHITE);
		Button.setFont(new Font("Arial Black", Font.PLAIN, 19));
		Button.setBackground(new Color(46, 61, 176));
		Button.setBounds(10, 600, 321, 27);
		add(Button);
		
		JButton btnRefresh = new JButton("REFRESH");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MySQLConection mysql = new MySQLConection();
				ResultSet resultSet = mysql.getTable();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String [] columnNames = {"UID", "Name", "Gender", "Address", "State", "City", "Pincode", "Mobile_No", "Degree", "Designation", "Department", "Bank", "Email", "salary"};
				model.setColumnIdentifiers(columnNames);
			 	model.setRowCount(0);
				try {
					while(resultSet.next()) {
						model.addRow(new Object [] {
								resultSet.getString(1),
								resultSet.getString(2),
								resultSet.getString(3),
								resultSet.getString(4),
								resultSet.getString(5),
								resultSet.getString(6),
								resultSet.getString(7),
								resultSet.getString(8),
								resultSet.getString(9),
								resultSet.getString(10),
								resultSet.getString(11),
								resultSet.getString(12),
								resultSet.getString(13),
								resultSet.getString(14)
								
						});
					}		
				} catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e1.getMessage()));
				}
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				System.out.println("succeefully builded");
		
			}
			
		});
			
		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnRefresh.setBackground(new Color(46, 61, 176));
		btnRefresh.setBounds(926, 600, 321, 27);
		add(btnRefresh);
		
		
		
	}
}
