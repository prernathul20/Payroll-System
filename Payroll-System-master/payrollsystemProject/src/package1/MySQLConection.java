package package1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class MySQLConection {
	private Connection con;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	
	public static Connection getconnection(){
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						System.out.println("WOW : Driver Mil gaya");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Problem in loading driver");
					}
					Connection con = null;
					try {
					
						con =DriverManager.getConnection("jdbc:mysql://localhost:3306/PayrollSystem","root","root");
						System.out.println("WOW : GOT Connection");
					} catch (SQLException e) {

						e.printStackTrace();
						System.out.println("Problem in getting connection");
					}
					return con;
			}
		
	
	
	
	
	

	
	
		// MY Account from Employee Page,PanelAttendence from Admin page
		 ResultSet displaymyaccount(String uid ,String passwordStr,String Name,String gender,String address,String state,String city ,String pincode,String mobile,String Degree,String Designation,String Department,String Bank,String email,String Salary,String Usertype  ,String deduction ,String allowance ,String salary  ) {
				
				try {
					con = MySQLConection.getconnection();
					String sql = "select * from employee NATURAL JOIN salary NATURAL JOIN applyleave where UID=?";
					System.out.println("out....................................................");
					preparedStatement = con.prepareStatement(sql);
					preparedStatement.setString(1,uid);
					
				    resultSet = preparedStatement.executeQuery();
				
				} catch (Exception e3) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e3.getMessage()));
				}
				System.out.println("out...................332432..............");
				return resultSet;	
			};
			
			
			/////Leave Employee from Employee page
		int  insertData(String uid,String reason,String Days,String date) {
				
				int status = 0;
				try {
					con = MySQLConection.getconnection();
				
					String sql = " Update  applyleave set fromDate ='"+date
							+"',Noofdays='"+Days
							+"',reason='"+reason
							+"' where UID =?";
					System.out.println("out....................................................");
					preparedStatement = con.prepareStatement(sql);
					preparedStatement.setString(1, uid);
					
				    status = (int) preparedStatement.executeUpdate();
					
				} catch (Exception e3) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e3.getMessage()));
				}
				return status;
				
			}
		
		
		
		//Update Page from Admin Page
		
		int UpdateAdmin(String uid ,String passwordStr,String Name,String gender,String address,String state,String city ,String pincode,String mobile,String Degree,String Designation,String Department,String Bank,String email,String Salary,String Usertype  ) {	
		 int status = 0;
			try {
				con = MySQLConection.getconnection();
				preparedStatement=con.prepareStatement(" Update employee set name =?,gender =?,address =?,state =?,city =?,pincode =?,mobile =?,Degree =?,Designation =?,Department =?,Bank =?,email =?,salary =? Where UID = ?");
				preparedStatement.setString(1, Name);
				preparedStatement.setString(2, gender);
				preparedStatement.setString(3, address);
				preparedStatement.setString(4, state);
				preparedStatement.setString(5, city);
				preparedStatement.setString(6, pincode);
				preparedStatement.setString(7, mobile);
				preparedStatement.setString(8, Degree);
				preparedStatement.setString(9, Designation);
				preparedStatement.setString(10, Department);
				preparedStatement.setString(11, Bank);
				preparedStatement.setString(12, email);
				preparedStatement.setString(13, Salary);
				preparedStatement.setString(14, uid);
			
				 status =(int) preparedStatement.executeUpdate();
				System.out.println("out........................1.");	
			} catch (Exception e4) {
				
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
			return status;	
		}
		
		
		
		//Update ,ADDEmployee Page from Admin Page
		int insertdataAdmin(String uid ,String passwordStr,String Name,String gender,String address,String state,String city ,String pincode,String mobile,String Degree,String Designation,String Department,String Bank,String email,String Salary,String Usertype  ) {
			int status=0;
			try {
				con = MySQLConection.getconnection();
				String sql ="insert into employee(UID,password,name,gender,address,state,city,pincode,mobile,Degree,Designation,Department,Bank,email,salary,Usertype) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				preparedStatement=con.prepareStatement(sql);
				preparedStatement.setString(1, uid);
				preparedStatement.setString(2, passwordStr);
				preparedStatement.setString(3, Name);
				preparedStatement.setString(4, gender);
				preparedStatement.setString(5, address);
				preparedStatement.setString(6, state);
				preparedStatement.setString(7, city);
				preparedStatement.setString(8, pincode);
				preparedStatement.setString(9, mobile);
				preparedStatement.setString(10, Degree);
				preparedStatement.setString(11, Designation);
				preparedStatement.setString(12, Department);
				preparedStatement.setString(13, Bank);
				preparedStatement.setString(14, email);
				preparedStatement.setString(15, Salary);
				preparedStatement.setString(16, Usertype);
			
				status = preparedStatement.executeUpdate();
				System.out.println("out........................2.");
				System.out.println(Name+"Update fail"+""+address+""+""+city+""+pincode+""+mobile+""+Salary+""+Bank+""+email+""+Department+""+uid+""+passwordStr+""+gender+""+state+""+Degree+""+Designation+""+Usertype);	
			} catch (Exception e4) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			}
			return status;	
		
		}
		
		
		
		
		//Delete,Employee Detail,Update Employee Page from Admin Page
		ResultSet getRow(String uid ,String passwordStr,String Name,String gender,String address,String state,String city ,String pincode,String mobile,String Degree,String Designation,String Department,String Bank,String email,String Salary,String Usertype  ) {

			try {
				con = MySQLConection.getconnection();
				String sql = "select  * from employee where UID=? ";
				preparedStatement=con.prepareStatement(sql);
				preparedStatement.setString(1, uid);
				resultSet = preparedStatement.executeQuery();
				System.out.println("out........................2.");
				
			} catch (Exception e4) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			}
			return resultSet;	
			
		}
		
		
		
		//Employee List  Page from Admin Page
		ResultSet getTable() {
			try {
				con = MySQLConection.getconnection();
				Statement stmt = con.createStatement();
				resultSet = stmt.executeQuery("select  * from employee");
				java.sql.ResultSetMetaData rsmd = resultSet.getMetaData();
				int cols = rsmd.getColumnCount();
				System.out.println("succeefully builded3");
			} catch (Exception e) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
			}
			return resultSet;
			
		}
		
		

		//Delete Page from Admin Page
		int DeleteData(String uid) {
			int status =0;
			try {
				
				con = MySQLConection.getconnection();
				preparedStatement = con.prepareStatement("DELETE from employee WHERE UID =?");
				preparedStatement.setString(1, uid);
				status = preparedStatement.executeUpdate();		
				} catch (Exception e) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
				
			}
			
			return status;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			//leaveadmin,LeaveEmployee Employee  for info from Admin page 
		ResultSet getRowleave(String uid,String name,String date,String days,String reason,String status) {
			ResultSet resultSet = null;
			try {
				con = MySQLConection.getconnection();
				String sql = "select * from applyleave where UID=?";
				System.out.println("out....................................................");
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1,uid);
				
			    resultSet = preparedStatement.executeQuery();
				
			} catch (Exception e4) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			}
			return resultSet;	
			
		}
		
			//leave Employee  for approvedButton from Admin page 
		int getStatusApproved (String uid,String date,String days,String reason,String status) {
				int result = 0;
			try {
				con = MySQLConection.getconnection();
				String sql = "Update  applyleave set status = 'Approved' where UID=? ";
				preparedStatement=con.prepareStatement(sql);
				preparedStatement.setString(1, uid);
				result = preparedStatement.executeUpdate();
				System.out.println("out........................2.");
				
			} catch (Exception e4) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			}
			return result;	
			
		}
		
		//leave Employee  for DeclinedButton from Admin page 
		
		int getStatusDeclined(String uid,String date,String days,String reason,String status) {
			int result = 0;
		try {
			con = MySQLConection.getconnection();
			String sql = "Update  applyleave set status = 'Decline' where UID=? ";
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1, uid);
			result = preparedStatement.executeUpdate();
			System.out.println("out........................2.");
			
		} catch (Exception e4) {
			JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
			e4.printStackTrace();
		}
		return result;	
		
	}
		
		//leaveapproved status Employee,AdminStatus   for info from Admin page 
		ResultSet getleaveapplication(String uid,String name,String date,String days,String reason,String status ) {
			ResultSet resultSet0 = null;
			try {
				con = MySQLConection.getconnection();
				String sql = "select   COUNT(*) as rowcount from applyleave where status ='approved'";
				System.out.println("out....................................................");
				preparedStatement = con.prepareStatement(sql);
				//preparedStatement.setString(1,uid);
				
			    resultSet0 = preparedStatement.executeQuery();
				
			} catch (Exception e4) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			}
			return resultSet0;	
			
		}	
		
		
		//leavedecline status employee ,Adminstatus  admin page
		ResultSet getleaveapplication1(String uid,String name,String date,String days,String reason,String status ) {
			ResultSet resultSet1 = null;
			try {
				con = MySQLConection.getconnection();
				String sql = "select   COUNT(*) as row1count from applyleave where status ='declined'";
				System.out.println("out....................................................");
				preparedStatement = con.prepareStatement(sql);
				//preparedStatement.setString(1,uid);
				
			    resultSet1 = preparedStatement.executeQuery();
				
			} catch (Exception e4) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			}
			return resultSet1;	
			
		}	
		
		
		///leave pending status employee,AdminStatus admin page
		ResultSet getleaveapplication2(String uid,String name,String date,String days,String reason,String status ) {
			ResultSet resultSet2 = null;
			try {
				con = MySQLConection.getconnection();
				String sql = "select   COUNT(*) as row2count from applyleave where status =''";
				System.out.println("out....................................................");
				preparedStatement = con.prepareStatement(sql);
		
				
			    resultSet2 = preparedStatement.executeQuery();
				
			} catch (Exception e4) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			}
			return resultSet2;	
			
		}
		
	//	panelLeave  next,search  button from Admin page
		ResultSet leavedata(String uid,String date,String days,String reason,String status,int ID) {
			Statement stmt = null;
	//		ResultSet resultSet = null;
			try {
				
				con = MySQLConection.getconnection();
				 stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			//	preparedStatement =con.prepareStatement("select ID,UID, name, fromDate, Noofdays, reason, status, leaveDays from applyleave ");
			//	preparedStatement.setString(1, uid);
				
				resultSet = stmt.executeQuery("select*  from applyleave where status is NULL OR status ='' ");
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));// TODO: handle exception
			}
			return resultSet;
		}
		
		
		ResultSet getleaveapplication4(String uid,String name,String date,String days,String reason,String status ) {
		//	ResultSet resultSet4 = null;
			try {
				con = MySQLConection.getconnection();
				String sql = "select * from applyleave where UID= ? ";
				System.out.println("out....................................................");
				
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1,uid);
				
				
				  resultSet = preparedStatement.executeQuery();
				
			} catch (Exception e4) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
				e4.printStackTrace();
			}
			return resultSet;	
			
		}	
		
		
		
		
		
		//total Employee from admin status page
		ResultSet getRowCount() {
			ResultSet resultSet4 = null;
			try {
				con = MySQLConection.getconnection();
				Statement stmt = con.createStatement();
				resultSet4 = stmt.executeQuery("select count(UID) AS count from employee ");

			} catch (Exception e) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
			}
			return resultSet4;
			
		}
		
		
		
		
	//	Panel Salary ,PaySlip  from Admin page
		//PanelSlaryemp PaySlip2 from employee
		ResultSet getSalary( String uid,String bank,String leave,String Name,String department,String HR,String DA,String Med,String leaveday,String travell,String grosssalary,String Netsalary,String basicsalary  ) {
			try {
				con = MySQLConection.getconnection();
				String sql = "select *from salary NATURAL LEFT JOIN  employee NATURAL LEFT JOIN applyleave where UID=?";
				System.out.println("out....................................................");
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1,uid);
				
			    resultSet = preparedStatement.executeQuery();
			
			} catch (Exception e3) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e3.getMessage()));
			}
			System.out.println("out...................332432..............");
			return resultSet;	
		};
		
		
		
	/*	ResultSet payslip( String uid,String bank,String leave,String Name,String department,String HR,String DA,String Med,String Leave,String travell,String grosssalary,String Netsalary  ) {
			
			try {
				con = MySQLConection.getconnection();
				String sql = "select *from employee NATURAL  LEFT JOIN salary NATURAL LEFT JOIN applyleave where UID=?";
				System.out.println("out....................................................");
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1,uid);
				
			    resultSet = preparedStatement.executeQuery();
			
			} catch (Exception e3) {
				JOptionPane.showMessageDialog( null, "Database error2222222222222:" +  ( e3.getMessage()));
			}
			System.out.println("out...................332432..............");
			return resultSet;	
		
		}*/
		
		
		
		
		
	/*		ResultSet attandanceFHalf(String uid ,String Name,String firstHalf,String SecondHalf,String Date) {
			ResultSet resultSet2 = null;
			try {
				con = MySQLConection.getconnection();
				String sql = "select   COUNT(*) as present from applyleave where  f_half ='Present'";
				System.out.println("out....................................................");
				preparedStatement = con.prepareStatement(sql);
			//	preparedStatement.setString(1,uid);
			    resultSet2 = preparedStatement.executeQuery();
			
			} catch (Exception e3) {
				JOptionPane.showMessageDialog( null, "Database error:" +  ( e3.getMessage()));
			}
			System.out.println("out....                  ...............332432..............");
			return resultSet2;
			
		}  
		
		
			ResultSet attandanceSHalf(String uid ,String Name,String firstHalf,String SecondHalf,String Date) {
				ResultSet resultSet3 = null;
				try {
					con = MySQLConection.getconnection();
					String sql = "select   COUNT(*) as present1 from applyleave where  s_half ='Present' ";
					System.out.println("out....................................................");
					preparedStatement = con.prepareStatement(sql);
				//	preparedStatement.setString(1,uid);
				    resultSet3 = preparedStatement.executeQuery();
				
				} catch (Exception e3) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e3.getMessage()));
				}
				System.out.println("out....                  ...............332432..............");
				return resultSet3;
				
			}  */
		
			
			//PanelSalary Save button from Admin page
			  int SaveSalray(String uid ,String Name,String department,String date,String HR,String DA,String Med,String leave,String Travell,String grosssalary,String Netsalary,String leaveday ) {
				  int status = 0;
				  try {
					con = MySQLConection.getconnection();
					preparedStatement = con.prepareStatement(" Update salary Set hr ='"+HR
						+"',da ='"+ DA
						+"',med='"+ Med
				//		+"',Leave ='"+ leave
						+"',travell ='"+ Travell
						+"',grosssalary ='"+ grosssalary
						+"',netsalary ='"+ Netsalary
						+"',Date ='"+date
						+"' where UID=?");
					
				
					preparedStatement.setString(1, uid);
					status = preparedStatement.executeUpdate();
				} catch (Exception e) {
					JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
					e.printStackTrace();
					// TODO: handle exception
				}finally {
					try {
						con.close();
					} catch (SQLException e) {
						JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				  
				return status;
			  
			  }
			  
			  
			  
			
			  // Atendence panel from Admin Page
				int uploadattendence(String uid ,String Name,String firstHalf,String SecondHalf,Date date) {
			
				int status=0;
				try {
					con = MySQLConection.getconnection();
					String sql =
							" Update attendence Set f_half ='"+firstHalf
							+"',s_half ='"+SecondHalf
							+"',Date ='"+ date
							+"' where UID=?";   
					preparedStatement=con.prepareStatement(sql);
					preparedStatement.setString(1, uid);
					 status =(int) preparedStatement.executeUpdate();
						System.out.println("out........................1.");	
					} catch (Exception e4) {
						
						JOptionPane.showMessageDialog( null, "Database error:" +  ( e4.getMessage()));
						e4.printStackTrace();
					
					}finally {
						try {
							con.close();
						} catch (SQLException e) {
							JOptionPane.showMessageDialog( null, "Database error:" +  ( e.getMessage()));
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}		
					return status;	
				}	  
			  
	}


