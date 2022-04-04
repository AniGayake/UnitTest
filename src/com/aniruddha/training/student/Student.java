package com.aniruddha.training.student;

public class Student {

	public int phy;
	public int chem;
	public int math;
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChem() {
		return chem;
	}
	public void setChem(int chem) {
		this.chem = chem;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Student(int phy, int chem, int math) {
		super();
		this.phy = phy;
		this.chem = chem;
		this.math = math;
	}
	
	public String calculateGrade() {
		
		int avg = avg();
		
		if(avg>=90&&avg<=100) {
			return "A";
		}
		else if(avg>=80&&avg<90)
			return "B";
		else if(avg>=70&&avg<80)
			return "C";
		else return "F";
	}
	
	public int avg() {
		int r= (phy + chem + math)/3;
		System.out.println(r);
		return r;
	}
}
