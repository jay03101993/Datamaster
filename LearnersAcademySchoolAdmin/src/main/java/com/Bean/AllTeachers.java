package com.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class AllTeachers {
    
	@Id
	@Column(name = "teacherId")
	int teaherId;
	
	@Column(name = "teacherName")
	String teacherName;
	
	@Column(name = "teacherQualification")
	String teacherQualification;
	
	public AllTeachers() {
		
	}

	public int getTeaherId() {
		return teaherId;
	}

	public void setTeaherId(int teaherId) {
		this.teaherId = teaherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherQualification() {
		return teacherQualification;
	}

	public void setTeacherQualification(String teacherQualification) {
		this.teacherQualification = teacherQualification;
	}

	public AllTeachers(String teacherName, String teacherQualification) {
		super();
		this.teacherName = teacherName;
		this.teacherQualification = teacherQualification;
	}

	@Override
	public String toString() {
		return "AllTeachers [teaherId=" + teaherId + ", teacherName=" + teacherName + ", teacherQualification="
				+ teacherQualification + "]";
	}
	
		
	
	
}
