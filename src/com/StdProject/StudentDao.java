package com.StdProject;
import java.sql.*;

public class StudentDao {
	
	public void addStudent(
		
		int id,
		String name,
		String email,
		int age){
		
		String sql = "INSERT INTO Student VALUES(?,?,?,?)";
		
		try{
			
			Connection con =
					DbConnection.getConnection();


					PreparedStatement ps =
					con.prepareStatement(sql);


					ps.setInt(1,id);
					ps.setString(2,name);
					ps.setString(3,email);
					ps.setInt(4,age);


					int rows =
					ps.executeUpdate();


					System.out.println(
					rows+" Record Inserted"
					);


					con.close();

    }
	catch(Exception e){
		
		e.printStackTrace();
	}

	}
		
	public void displayStudents()
	{

	String sql =
	"SELECT * FROM Student";


	try
	{

	Connection con =
	DbConnection.getConnection();


	Statement stmt =
	con.createStatement();


	ResultSet rs =
	stmt.executeQuery(sql);


	while(rs.next())
	{

	System.out.println(
	rs.getInt("student_id")
	+" "
	+rs.getString("name")
	+" "
	+rs.getString("email")
	);

	}


	con.close();

	}
	catch(Exception e)
	{
	e.printStackTrace();
	}


	}
}
