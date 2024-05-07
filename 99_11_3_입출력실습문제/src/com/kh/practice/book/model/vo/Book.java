package com.kh.practice.book.model.vo;

import java.util.Calendar;

public class Book {
//필드
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
//메서드
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public Calendar getDate() {
		return date;
	}
	public double getDiscount() {
		return discount;
	}
	//기본 생성자
	public Book() {
		// TODO Auto-generated constructor stub
	}
	//필수 생성자
	public Book(String title, String author, int price, Calendar date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}
	//@Override
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
