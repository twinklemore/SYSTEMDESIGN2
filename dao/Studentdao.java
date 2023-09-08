package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class Studentdao {
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
	int i=0;
	//to save student
	public Student saveStudent(Student student) {
	connection=helperClass.getconnection();
	String sql="INSERT INTO student VALUES(?,?,?)";
	try {
			//create statement
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//passed the values to delimiters/placeholders--->
		preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
		preparedStatement.setString(3,student.getEmail());
			
		preparedStatement.execute();
		
	}catch(SQLException e) {
	e.printStackTrace();
	}finally {
	try {
	connection.close();
		}
	catch(SQLException e){
			e.printStackTrace();
		}
	}
	
			
		
		return student;
	}
	
	
	//to retrieve student
	public void retrieveStudent() {
connection=helperClass.getconnection();
		
		String sql="SELECT * FROM student";
		//create statement
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//EXECUTE STATEMENT
			ResultSet resultSet=preparedStatement.executeQuery(); 
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("************************************************");}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	//to retrive all
	public void retrieveallStudent() {
		connection=helperClass.getconnection();
	
	String sql="SELECT * FROM student";
	//create statement
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		//EXECUTE STATEMENT
		ResultSet resultSet=preparedStatement.executeQuery(); 
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println("************************************************");}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
		
	
	//to delete student
	public boolean deleteStudentbyId(int id) {
		
		connection=helperClass.getconnection();
		
		String sql="DELETE FROM student WHERE id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			
			i=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		try {
		connection.close();
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(i>0) {
			return true;
		}else {
		return false;}
		}


	

		
//to update student
	public boolean updateStudentEmailbyId(int id,String Email) {
		connection=helperClass.getconnection();
		String sql="INSERT INTO student VALUES(?,?,?)";
		int i=0;
		try {
				//create statement
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				//passed the values to delimiters/placeholders--->
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2,Email);
		i=preparedStatement.executeUpdate()	;	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		try {
		connection.close();
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		if(i>0) {
			return true;
		}else {
			return false;
		}
	}
}



		
	

		