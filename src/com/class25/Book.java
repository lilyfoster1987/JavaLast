package com.class25;
/*Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/
public class Book {
String name;
int totalPage;
String editor;
int price;
public Book(String name,int totalPage,String editor,int price) {
	this.name=name;
	this.totalPage=totalPage;
	this.editor=editor;
	this.price=price;
	
}
public Book(String name,String editor) {
	this.name=name;
	this.editor=editor;
	
	
}
public void display() {
	System.out.println("The book is "+name);
	System.out.println("The book's editor is "+editor);
	System.out.println("The book has  "+totalPage+" pages.");
	System.out.println("The book's price is  "+"$"+ price);
}
	public static void main(String[] args) {
		Book book1=new Book("Harry Potter",5,"J.K. ROWLING",50);
		Book book2=new Book("Fallen","CHARLIE HIGSON");
book1.display();
book2.display();
	}

}
