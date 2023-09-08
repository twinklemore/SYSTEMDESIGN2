package com.school.controller;

import com.school.service.StudentService;

public class StudentRetrieve {
public static void main(String args) {
	StudentService studentservice=new StudentService();
	studentservice.retrieveStudent();
}
}
