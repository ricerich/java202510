package ch04.ex04;

public class Book 
{
	String title;
	String author;
	
	public Book(String t) { // 생성자
		title = t; 
		author = "작자미상";
	}
	
	public Book(String title, String _author) { // 생성자
		this.title = title; 
		author = _author;
	}

}




