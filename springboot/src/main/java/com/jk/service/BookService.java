/** 
 * <pre>项目名称:springboot 
 * 文件名称:BookService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年11月12日下午1:51:17 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;
import java.util.Map;

import com.jk.model.Book;

/** 
 * <pre>项目名称：springboot    
 * 类名称：BookService    
 * 类描述：    
 * 创建人：张海川 193918518@qq.com    
 * 创建时间：2018年11月12日 下午1:51:17    
 * 修改人：张海川 193918518@qq.com  
 * 修改时间：2018年11月12日 下午1:51:17    
 * 修改备注：       
 * @version </pre>    
 */
public interface BookService {

	/** <pre>findBook(这里用一句话描述这个方法的作用)   
	 * 创建人：张海川 193918518@qq.com      
	 * 创建时间：2018年11月12日 下午2:07:52    
	 * 修改人：张海川 193918518@qq.com      
	 * 修改时间：2018年11月12日 下午2:07:52    
	 * 修改备注： 
	 * @param start
	 * @param pageSize
	 * @return</pre>    
	 */
	Map<String, Object> findBook(int start, int pageSize);

	/** <pre>getAll(这里用一句话描述这个方法的作用)   
	 * 创建人：张海川 193918518@qq.com      
	 * 创建时间：2018年11月12日 下午4:39:23    
	 * 修改人：张海川 193918518@qq.com      
	 * 修改时间：2018年11月12日 下午4:39:23    
	 * 修改备注： 
	 * @param book
	 * @return</pre>    
	 */
	List<Book> getAll(Book book);

}
