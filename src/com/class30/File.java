package com.class30;

public abstract class File {
	File(String str){
		
	}
public abstract void open();
public void edit() {
	System.out.println("you can edit files");
}
public void close() {
	System.out.println("you can close the files");
}
	

}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("it opens .java");
	}
	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("it opens .doc");
		
	}
	
}
class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("it opens .pdf");
		
	}
	
}
