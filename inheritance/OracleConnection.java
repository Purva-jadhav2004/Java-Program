package inheritance;

import java.sql.Connecction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class OracleConnection {

	public static void main(String[] args) {
	Class.forName("orcale.jdbc.driver.oracleDriver");
	connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","BCA-20","123");
	Statment st=con.createStatment();
	String query="select* from employee";
			Resultset rs=st.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+""+rs.getString(2));
			}
	rs.close();
	st.close();
	con.close();
	// TODO Auto-generated method stub

	}

}
