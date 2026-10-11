package com.librarymanagementsystem;

import java.util.Scanner;

public class Librarymanagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Library lib=new Library();
		
		while(true) {
		System.out.println("\n=============LIBRARY MANAGEMENT SYSTEM=============");
		System.out.println("1.Add Book");
		System.out.println("2.Update Book");
		System.out.println("3.Delete Book");
		System.out.println("4.Find Book");
		System.out.println("5.Display All Book");
		System.out.println("6.Exit");
		System.out.println("-----------------------------");
		
		
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		
		switch(choice) {
		case 1:
			System.out.println("Enter Book Id:");
			int bookid=sc.nextInt();
		
			sc.nextLine();
			System.out.println("Enter Book Name:");
			String bookname=sc.nextLine();
			
			System.out.println("Enter Author Name:");
			String author=sc.nextLine();
			
			System.out.println("Enter price:");
			double price=sc.nextDouble();
			
			lib.addBook(bookid,bookname,author,price);
			break;
			
		case 2:
			System.out.println("Enter book id to update:");
			int updatedid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter new book name:");
			String newbookname=sc.nextLine();
			
			System.out.println("Enter new Author:");
			String newauthor=sc.nextLine();
			
			System.out.println("Enter new price:");
			double newprice=sc.nextDouble();
			
			lib.updatebook(updatedid, newbookname, newauthor, newprice);
			break;
			
		case 3:
			System.out.println("Enter Book id to delete:");
			int deleteid=sc.nextInt();
			
			lib.deletebook(deleteid);
			break;
			
		case 4: 
			System.out.println("Enter Book id to find:");
			int findid=sc.nextInt();
			
			Book foundBook=lib.findBook(findid);
			
			if(foundBook != null) {
				System.out.println("\n Book Found");
				System.out.println(foundBook);
			} else {
				System.out.println("Book not found");
			}
			break;
			
		case 5:
			lib.displayBooks();
			break;
			
		case 6:
			System.out.println("Thank you for using library management system");
			sc.close();
			return;
			
		default	:
			System.out.println("Invalid option. please choose 1-6 ");
		}
		
		}
	}

}
