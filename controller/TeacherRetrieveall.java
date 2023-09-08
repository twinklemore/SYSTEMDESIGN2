package com.school.controller;

import com.school.service.TeacherService;

public class TeacherRetrieveall {
	public static void main(String args) {
		TeacherService teacherservice=new TeacherService();
		teacherservice.retrieveallTeacher();
}
}
