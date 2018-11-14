/** 
 * <pre>项目名称:springboot 
 * 文件名称:BookController.java 
 * 包名:com.jk 
 * 创建日期:2018年11月12日下午1:31:17 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.jk.model.Book;
import com.jk.service.BookService;

/** 
 * <pre>项目名称：springboot    
 * 类名称：BookController    
 * 类描述：    
 * 创建人：张海川 193918518@qq.com    
 * 创建时间：2018年11月12日 下午1:31:17    
 * 修改人：张海川 193918518@qq.com  
 * 修改时间：2018年11月12日 下午1:31:17    
 * 修改备注：       
 * @version </pre>    
 */
@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	/*@RequestMapping("findBook")
	@ResponseBody
	Map<String, Object> findBook(int start,int pageSize){
		
		Map<String, Object> map = bookService.findBook(start,pageSize);
		return map;
	}*/
	
	@RequestMapping("querybook")
	public PageInfo<Book> getAll(Book book) {
        List<Book> booklist = bookService.getAll(book);
        return new PageInfo<Book>(booklist);
    }
	
	
	/*@RequestMapping
    public ModelAndView getAll(Book book) {
        ModelAndView result = new ModelAndView("index");
        List<Book> countryList = bookService.getAll(book);
        result.addObject("pageInfo", new PageInfo<Book>(bookList));
        result.addObject("queryParam", book);
        result.addObject("page", book.getPage());
        result.addObject("rows", book.getRows());
        return result;
    }*/
	
	
	
	@RequestMapping("/index")
	String sys(){
		System.out.println("66666");
		return "index";
	}

}
