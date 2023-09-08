package com.school.controller;

import com.school.service.StudentService;
import com.school.service.TeacherService;

public class TeacherUpdate {
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		boolean res=teacherService.updateTeacherEmailbyId(2,"efg@mail.com");
		System.out.println(res);
	}
}

