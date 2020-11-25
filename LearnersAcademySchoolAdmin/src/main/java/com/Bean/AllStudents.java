package com.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentmaster")
public class AllStudents {
	@Id
	@Column(name = "studentId")
	int studentId;
	
	@Column(name = "studentName")
	String studentName;
	
	@Column(name = "studentClass")
	String studentClass;
	
	@Column(name = "subjectCode")
	String subjectCode;
	
	public AllStudents(){
		
	}
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}



	public AllStudents(String studentName, String studentClass, String subjectCode) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.subjectCode = subjectCode;
	}



	@Override
	public String toString() {
		return "AllStudents [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", subjectCode=" + subjectCode + "]";
	}
	

}
