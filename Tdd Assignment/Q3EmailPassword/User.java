package Q3EmailPassword;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User {
int userid;
String password;
public String email;

public static boolean check(String s1,String s2) throws SQLException,ClassNotFoundException {
	boolean ufound=false;
	List<User> slist=new ArrayList<User>();
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("1");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdd", "root", "root");
	//System.out.println("Driver is uploaded");
	Statement s=con.createStatement();
	System.out.println("2");
	
	ResultSet rs= s.executeQuery("select * from user ");
	
	System.out.println("3");
	
	while(rs.next()) {
		slist.add(new User(1, "sumedha", "sumedha.pachghare@gmail.com"));
		System.out.println("4");
		System.out.println("ID: "+rs.getInt("userid")+" "  +" password: "+rs.getString("password")+" " +" email: "+ rs.getString("email"));
		System.out.println("4.5");
	}
	for(User u : slist) {
		if(u.password.equals(s1) && u.email.equals(s2));
			System.out.println("5");
			ufound =true;
	}
	return ufound;
}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println(User.check("sumedha" , "sumedha.pachghare@gmail.com"));
}
public User(int userid, String password, String email) {
	super();
	this.userid = userid;
	this.password = password;
	this.email = email;
}
}
