package com.school.controller;

import com.school.service.StudentService;
import com.school.service.TeacherService;

public class TeacherRetrieve {
	public static void main(String args) {
		TeacherService teacherservice=new TeacherService();
		teacherservice.retrieveTeacher();
	}
}
