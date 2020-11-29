package com.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classes")
public class AllClasses {
    
	@Id
	@Column(name = "classID")
	int classID;
	
	@Column(name = "className")
	String className;
	
	@Column(name = "subjectCode")
	String subjectCode;
	
	public AllClasses() {
		
	}
    
	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public AllClasses(String className, String subjectCode) {
		super();
		this.className = className;
		this.subjectCode = subjectCode;
	}

	@Override
	public String toString() {
		return "AllClasses [classID=" + classID + ", className=" + className + ", subjectCode=" + subjectCode + "]";
	}
	
	
}
