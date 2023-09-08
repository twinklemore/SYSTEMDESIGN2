package com.school.controller;
import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentDelete {
public static void main(String[] args) {
	StudentService studentService=new StudentService();
	boolean res=studentService.deleteStudentbyId(2);
	System.out.println(res);
}
}
