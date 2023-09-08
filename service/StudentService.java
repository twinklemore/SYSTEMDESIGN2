package com.school.service;

import com.school.dao.Studentdao;
import com.school.dto.Student;

public class StudentService {
Studentdao studentdao=new Studentdao();

//public boolean deleteStudentbyId(int id) {
	//return studentdao.deleteStudentbyId(id);
//}

public Student saveStudent(Student student) {
	return studentdao.saveStudent(student);
}

public boolean deleteStudentbyId(int i) {
	// TODO Auto-generated method stub
	return false;
}

public void retrieveStudent() {
	studentdao.retrieveStudent();
	
}
public boolean updateStudentEmailbyId(int id,String Email) {
	boolean res=studentdao.updateStudentEmailbyId(id, Email);
	return res;
}

public void retrieveallStudent() {
	studentdao.retrieveallStudent();
}



}