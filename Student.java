package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	void studentName()
	{
		System.out.println("Student name : Rajarajeswari Kuppuraj");
	}
	
	void studentDept()
	{
		System.out.println("Student Dept is : CSE");
	}
	
	void studentId()
	{
		System.out.println("Student Id : RA20030509");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College colObj = new College();
		System.out.println("****College class Single Inheritance****");
		colObj.collegeName();
		colObj.collegeCode();
		colObj.collegeRank();
		Department depObj = new Department();
		System.out.println("****Department Class - Multi Level Inheritance****");
		depObj.deptName();
		depObj.collegeName();
		Student stuObj = new Student();
		System.out.println("***Student Class - Multi Level Inheritance**");
		stuObj.collegeName();
		stuObj.collegeRank();
		stuObj.collegeCode();
		stuObj.deptName();
		stuObj.studentName();
		stuObj.studentId();
		stuObj.studentDept();
	}

}
