package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
public static void main(String[] args) {
	Student student=new Student();
	student.setId(20);
	student.setName("panu");
	student.setEmail("@mail.com");
	
	StudentService studentservice=new StudentService();
	Student s=studentservice.saveStudent(student);
	if(s!=null) {
	System.out.println(s.getId()+" saved successfully");
	}
	if(s!=null) {
	System.out.println(s.getId()+ "deleted successfully");
	}
	if(s!=null) {
	
	System.out.println(s.getId()+ " retrieved successfully");
	}
	if(s!=null) {
	System.out.println(s.getEmail()+" updated successfully");
	}
	if(s!=null) {
	System.out.println(s.getName()+" retrieve all successfully!!!");
}
}
}
