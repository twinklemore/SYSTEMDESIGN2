package com.school.service;
	

	import com.school.dao.Teacherdao;
	import com.school.dto.Teacher;

	public class TeacherService {
	Teacherdao teacherdao=new Teacherdao();
	public Teacher saveTeacher(Teacher teacher) {
		return teacherdao.saveTeacher(teacher);
	}
	public void retrieveTeacher() {
		teacherdao.retrieveTeacher();
	}
	public void retrieveallTeacher() {
		teacherdao.retrieveallTeacher();
	}
	public boolean updateTeacherEmailbyId(int id,String Email) {
	boolean res=teacherdao.updateTeacherEmailbyId(id, Email);
	return res;
	}
	public boolean deleteTeacherbyId(int id) {
		boolean res=teacherdao.deleteTeacherbyId(id);
		return res;
	}
	}
	
