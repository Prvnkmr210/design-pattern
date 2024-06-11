package com.praveen.clone;

import java.util.ArrayList;

public class BookShop implements Cloneable{
	
	private String shopName;
	private ArrayList<Book> bookList = new ArrayList<>();	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void loadData() {
		for(int i=0; i<10; i++) {
			Book b = new Book();
			b.setBanme("book" + i);
			b.setBid(i);
			getBookList().add(b);
		}
	}
	
	public BookShop getClone() throws CloneNotSupportedException {
		return (BookShop)super.clone();
	}
	
	public BookShop getDeepClone() {
		BookShop bsClone = new BookShop();
		bsClone.setShopName(this.shopName);
		for(Book b : this.getBookList()){
			bsClone.getBookList().add(b);
		}
		return bsClone;
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", bookList=" + bookList + "]";
	}
	
	

}
