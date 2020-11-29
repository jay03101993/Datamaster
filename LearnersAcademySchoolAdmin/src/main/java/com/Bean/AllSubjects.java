package com.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class AllSubjects {
    
	@Id
	@Column(name = "subjectId")
	int subjectId;
	@Column(name = "subjectName")
	String subjectName;
	@Column(name = "subjectClass")
	String subjectClass;
	@Column(name = "subjectCode")
	String subjectCode;
	
	public AllSubjects() {
		
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectClass() {
		return subjectClass;
	}

	public void setSubjectClass(String subjectClass) {
		this.subjectClass = subjectClass;
	}
	
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	
	public AllSubjects(String subjectName, String subjectClass, String subjectCode) {
		super();
		this.subjectName = subjectName;
		this.subjectClass = subjectClass;
		this.subjectCode = subjectCode;
	}

	@Override
	public String toString() {
		return "AllSubjects [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectClass=" + subjectClass
				+ ", subjectCode=" + subjectCode + "]";
	}
	
	
	
}
