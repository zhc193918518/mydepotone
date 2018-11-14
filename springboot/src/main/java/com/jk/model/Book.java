/** 
 * <pre>项目名称:springboot 
 * 文件名称:Book.java 
 * 包名:com.jk.model 
 * 创建日期:2018年11月12日下午1:56:39 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;



/** 
 * <pre>项目名称：springboot    
 * 类名称：Book    
 * 类描述：    
 * 创建人：张海川 193918518@qq.com    
 * 创建时间：2018年11月12日 下午1:56:39    
 * 修改人：张海川 193918518@qq.com  
 * 修改时间：2018年11月12日 下午1:56:39    
 * 修改备注：       
 * @version </pre>    
 */
public class Book extends BaseEntity{
	
	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookDate;
	private String bookAuthor;
	private String bookPhoto;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPhoto() {
		return bookPhoto;
	}
	public void setBookPhoto(String bookPhoto) {
		this.bookPhoto = bookPhoto;
	}
	
}
