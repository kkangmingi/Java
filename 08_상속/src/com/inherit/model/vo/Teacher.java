package com.inherit.model.vo;

public class Teacher extends Person {
	//이름, 나이, 성별, 전화번호, 주소,
	//과목, 경력, 연봉
	private String subject;
	private int career;
	private int salary;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String subject, int career, int salary) {
		super();
		this.subject = subject;
		this.career = career;
		this.salary = salary;
	}
	public Teacher(String name, int age, char gender, String phone, String address,String subject, int career, int salary) {
		super(name,age,gender,phone,address);
		this.subject = subject;
		this.career = career;
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String infoTeacher() {
		return	infoPerson()+subject+" "+career+" "+salary;
		
	}
	
	@Override
	public String info() {
		return infoTeacher();
	}
	@Override
	public boolean equals(Object o) {
		Teacher t=(Teacher)o;
		if(getName()==t.getName()&&getAge()==t.getAge()
				&&getSubject()==t.getSubject()
				&&getCareer()==t.getCareer()) {
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+getPhone()+" "+getAddress()+" "+subject+career+salary;
	}
	
	
}
