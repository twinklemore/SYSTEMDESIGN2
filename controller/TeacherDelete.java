package com.school.controller;

import com.school.service.StudentService;
import com.school.service.TeacherService;

public class TeacherDelete {
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		boolean res=teacherService.deleteTeacherbyId(3);
		System.out.println(res);
}
}
