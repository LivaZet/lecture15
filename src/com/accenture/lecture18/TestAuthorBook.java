package com.accenture.lecture18;

public class TestAuthorBook {
	public static void main(String[] args) {

		Author author1 = new Author ("John Doe", "jd@author.com", 'm');
		System.out.println(author1);
		
		Book book1 = new Book ("First Book", author1, 5.0, 15);
		System.out.println(book1);
	}

}
