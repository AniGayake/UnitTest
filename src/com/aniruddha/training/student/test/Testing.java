package com.aniruddha.training.student.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.aniruddha.training.student.Student;

class Testing {
	Student s= new Student(100, 95, 95);
	@Test
	void testStudentGradeA() {
		assertEquals(s.calculateGrade(), "A");
	}
	Student s1= new Student(85,85,85);
	 void testGradeB() {
		 assertEquals(s1.calculateGrade(), "B");
	 }

	 Student s2= new Student(75,75,75);
	 void testGradeC() {
		 assertEquals(s1.calculateGrade(), "C");
	 }
}
