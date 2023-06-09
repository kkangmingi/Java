package com.exmethod.controller;

public class Product {
//	상품클래스를 생성해보자
//	저장내용
//	상품번호, 상품타입, 상품이름, 상품가격, 상품할인율, 상품재고
//	모든 필드는 외부에서 접근할 수 있게 설정
//	클래스를 생성할때 
//	기본생성 가능
//	타입, 이름, 가격만 설정가능
//	타입 이름, 가격, 할인률 설정가능
//	상품이름, 가격, 할인률, 재고 설정가능
//	할 수 있게 클래스를 구성하고
//	각 객체 생성 후 내용 출력하기 생성은 매개변수 생성자로할것
//	컴퓨터, maxbook, 200
//	핸드폰, 갤럭시노트, 120, 0.2
//	마스크, 10, 0.5, 100
//	출력시에는 전체 필드출력하기
//	* 다 하신분 
//	  -> 생성시 마다 상품번호가 1부터 1씩증가해서 대입
	public static int count;
	public int number;
	public String type;
	public String name;
	public int price;
	public double nego;
	public int quantity;
	{
	number=++count;
	}
	public Product() {}
	public Product(String type,String name, int price) {
		this.type=type;
		this.name=name;
		this.price=price;
	}
	public Product(String type,String name, int price, double nego) {
		this.type=type;
		this.name=name;
		this.price=price;
		this.nego=nego;
	}
	public Product(String type, int price, double nego, int quantity) {
		this.type=type;
		this.price=price;
		this.nego=nego;
		this.quantity=quantity;
	}
	
}
