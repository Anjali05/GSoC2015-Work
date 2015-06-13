package DBFrames;

public class PageRefObj 
{
	//DB connection URL eg="jdbc:msql://ip:post_no/DBname"
	public static String ConnectionURL="jdbc:mysql://127.0.0.1/userDB";
	
	//DB username and password
	public static String DBusername="anjali";
	public static String DBpassword="anjali";
	
	//DB query
	public static String query="select * from userinfo"; //userinfo is a table
	
	//JDBC Driver
	public static String JDBCDriver="com.mysql.jdbc.Driver";
}
