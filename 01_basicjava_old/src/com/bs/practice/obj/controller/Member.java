package com.bs.practice.obj.controller;

public class Member {
//	회원정보를 저장하는 클래스(Member)를 만들고 
//	3명의 회원을 등록하고 그 정보를 출력해보자
//	기본생성자로 생성하고 setter/getter를 이용해서
//	값을 넣고 출력해보자
//	멤버변수 : 아이디, 패스워드, 이름, 나이, 이메일
//	* 데이터는 아무거나 넣기
//
//	게시글을 저장할 수 있는 클래스(post)를 만들고 
//	2개의 게시글을 저장하고 출력해보자.
//	매개변수있는 생성자로 생성하고 get을 이용해서 
//	출력하자
	private String id;
	private String password;
	private String name;
	private int age;
	private String email;
	
	public Member() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
