package com.librarymanagementsystem;

public class Library {
	
//	we create an array with the book type and it is also an class.
//	when ever we create an class as an array in the another class is called as "object array".
	Book[] books=new Book[10];
	int count=0;
	
	public boolean addBook(int bookid, String bookname, String author, double price) {
			if(count>=books.length) {
				System.out.println("library full");
				return false;
			}
			//check book whether book already exist or not
			if(findBook(bookid) != null) {
				System.out.println("book id already exist");
				return false;
		}
			books[count]=new Book(bookid,bookname,author,price);
			count++;
			System.out.println("Book added successfully");
			return true;
	}
		
		public boolean updatebook(int bookid, String newbookname, String newauthor, double newprice) {
			for(int i=0;i<count;i++) {
				if(books[i].getBookid()==bookid) {
					books[i].setBookname(newbookname);
					books[i].setAuthor(newauthor);
					books[i].setPrice(newprice);
					System.out.println("Book updated successfully");
					return true;
				}
			}
			System.out.println("Book not found");
			return false;
		}
		
		public Book findBook(int bookid) {
			for(int i=0;i<count;i++) {
				if(books[i]!=null && books[i].getBookid()==bookid ){
					return books[i];
				}
			}
			return null;
		}
		
		public boolean deletebook(int bookid) {
			for (int i=0;i<count;i++) {
				if(books[i] != null && books[i].getBookid()==bookid) {
//					shift remaining books to the left
					for(int j=i;i<count-1;j++) {
						books[i]=books[j+1];
					}
						books[count-1]=null;
						count--;
						System.out.println("Book deleted successfully");
						return true;
				}
			}
			System.out.println("Book bot found");
			return false;
		}
		
	public void displayBooks() {
		if(count ==0) {
			System.out.println("No books available in the library");
			return;
		}
		System.out.println("\n-------------BOOK LIST-----------------");
			for(int i=0;i<count;i++) {
				System.out.println(books[i]);
			}
			System.out.println("--------------------------");
		}
		
		
	}
	