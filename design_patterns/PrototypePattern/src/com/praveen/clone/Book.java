package com.praveen.clone;

public class Book {
	
	private int bid;
	private String banme;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBanme() {
		return banme;
	}
	public void setBanme(String banme) {
		this.banme = banme;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", banme=" + banme + "]";
	}
	
	

}
