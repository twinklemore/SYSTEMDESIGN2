package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.school.configuration.HelperClass;
import com.school.dto.Teacher;

public class Teacherdao {
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
	
	
	
	//to save a student data
	public Teacher saveTeacher(Teacher teacher) {
		connection=helperClass.getconnection();
		String sql="INSERT INTO teacher VALUES(?,?,?)";
		try {
			//create statement by dynamic approach
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//passed the values to delimiters/placeholders--->
			preparedStatement.setInt(1,teacher.getId());
			preparedStatement.setString(2,teacher.getName());
			preparedStatement.setString(3,teacher.getEmail());
			
			preparedStatement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return teacher;

		}
	
//to retrieve student
	public void retrieveTeacher() {
connection=helperClass.getconnection();
		
		String sql="SELECT * FROM teacher";
		//create statement
		try {
			//dynamic approach
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
		public void retrieveallTeacher() {
			connection=helperClass.getconnection();
		
		String sql="SELECT * FROM teacher";
		//create statement
		try {
			//dynamic approach
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
		public boolean deleteTeacherbyId(int id) {
			
			connection=helperClass.getconnection();
			
			String sql="DELETE FROM teacher WHERE id=?";
			int i=0;
			
			try {
				//dynamic approach
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
	public boolean updateTeacherEmailbyId(int id,String Email) {
		connection=helperClass.getconnection();
		String sql="INSERT INTO student VALUES(?,?,?)";
		int i=0;
		try {
				//create statement by dynamic approach
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
	
		
		
	

