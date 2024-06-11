package com.praveen.clone;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bookShop = new BookShop();
		bookShop.setShopName("A1");
		bookShop.loadData();
		System.out.println(bookShop);
		
		BookShop bookShop2 = bookShop.getClone(); // Shallow clone
		System.out.println(bookShop2);
		BookShop bookShop3 = bookShop.getDeepClone(); // DeepClone clone
		System.out.println(bookShop3);		
		
		// verifying bookShop1 & bookShop2 are different
		bookShop.getBookList().remove(1);
		bookShop.setShopName("A2");
		System.out.println("After removing object from bookshop");
		System.out.println(bookShop);
		System.out.println(bookShop2);
		System.out.println(bookShop3);
		
		

	}

}
