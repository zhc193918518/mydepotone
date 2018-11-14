/** 
 * <pre>项目名称:springboot 
 * 文件名称:BookServiceImpl.java 
 * 包名:com.jk.service 
 * 创建日期:2018年11月12日下午1:51:38 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.mapper.BookMapper;
import com.jk.model.Book;

/** 
 * <pre>项目名称：springboot    
 * 类名称：BookServiceImpl    
 * 类描述：    
 * 创建人：张海川 193918518@qq.com    
 * 创建时间：2018年11月12日 下午1:51:38    
 * 修改人：张海川 193918518@qq.com  
 * 修改时间：2018年11月12日 下午1:51:38    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public Map<String, Object> findBook(int start, int pageSize) {
		
		Map<String, Object>	map = new HashMap<>();
		
		List<Book> list = bookMapper.findBook(start,pageSize);
		
		long total = bookMapper.findBookCount();
		
		map.put("total", total);
		map.put("rows", list);
		
		return map;
	}
	
	
	@Override
	public List<Book> getAll(Book book) {
		List<Book> booklist = bookMapper.getAll(book);
		return booklist;
	}

}
