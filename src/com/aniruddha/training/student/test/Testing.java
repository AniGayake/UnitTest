package com.aniruddha.training.student.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.aniruddha.training.student.Student;

class Testing {
	Student s= new Student(100, 95, 95);
	Student s1= new Student(85,85,85);
	 Student s2= new Student(75,75,75);
	 
	@Test
	void testStudentGradeA() {
		assertEquals(s.calculateGrade(), "A");
	}
	
	
	@Test
	
	 void testGradeB() {
		 assertEquals(s1.calculateGrade(), "B");
	 }
	 
	 
	@Test
	 void testGradeC() {
		 assertEquals(s2.calculateGrade(), "C");
	 }
 
}
