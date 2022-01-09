import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCconnection {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/project_management", "root", "Irfan@123");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select *from employee_details where emp_id=1;");
		System.out.println();
		System.out.println("The fullname and employee id of employee's having highest velocity from each unique role type are\n");
		while(rs.next()) {
			System.out.println(rs.getString("first_name"));
		}
		con.close();
		s.close();
	}
 

}
