import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;


public class Test{
	public static void main(String[] args) throws Throwable{
		Enumeration<Driver> ed = DriverManager.getDrivers();
		while(ed.hasMoreElements()){
		System.out.println((Driver)ed.nextElement());
		}

		Connection my_connection = DriverManager.getConnection("jdbc:sqlserver://localhost;user=MyUserName;password=*****;");

		Statement my_state = my_connection.createStatement();

		ResultSet my_results = my_state.executeQuery("select * from my_table");
		
	}
}

--------------
------
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
public class Test{
	public static void main(String[] args) throws Throwable{
		Enumeration<Driver> ed = DriverManager.getDrivers();
		while(ed.hasMoreElements()){
		System.out.println((Driver)ed.nextElement());
		}
		Connection my_connection = DriverManager.getConnection("jdbc:sqlserver://localhost;user=MyUserName;password=*****;");
		Statement my_state = my_connection.createStatement();
		ResultSet my_results = my_state.executeQuery("select * from my_table");
	}
}
-----
API: 
String getString(int columnNumber)
-------
slice statement: (API: Connect)
//use for insert new value to the table. (?, ? , …., ?) place holder, depends on how many columns you have
preparedStatement ps = my_connection.prepareStatement(“insert in x values (?, ?)”);

ps.setString(1, “Phillip”);
ps.setString(2, “j”);
------

DatabaseMetaData dmd = my_connect.getMetadata();
dmd.getTables();
------




