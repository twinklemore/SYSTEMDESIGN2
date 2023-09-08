package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherController {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		teacher.setId(12);
		teacher.setName("hajra");
		teacher.setEmail("hajra@mail.com");
		
		TeacherService teacherservice=new TeacherService();
		Teacher t=teacherservice.saveTeacher(teacher);
		if(t!=null) {
			System.out.println(t.getId()+" its saved!!!");
			
		}
		//if(t!=null) {
		//	System.out.println(t.getId()+ " deleted successfully");
			//}
		//if(t!=null) {
			//System.out.println(t.getEmail()+" updated successfully");
		//	}
		//if(t!=null) {
			
		//	System.out.println(t.getId()+ " retrieved successfully");
		//	}
		//if(t!=null) {
		//	System.out.println(t.getName()+" retrieve all successfully!!!");
		//}
		
	}
	}


