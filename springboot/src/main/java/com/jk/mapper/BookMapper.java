/** 
 * <pre>项目名称:springboot 
 * 文件名称:BookMapper.java 
 * 包名:com.jk.mapper 
 * 创建日期:2018年11月12日下午1:52:19 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.jk.model.Book;

/** 
 * <pre>项目名称：springboot    
 * 类名称：BookMapper    
 * 类描述：    
 * 创建人：张海川 193918518@qq.com    
 * 创建时间：2018年11月12日 下午1:52:19    
 * 修改人：张海川 193918518@qq.com  
 * 修改时间：2018年11月12日 下午1:52:19    
 * 修改备注：       
 * @version </pre>    
 */
@Mapper
public interface BookMapper {

	/** <pre>findBook(这里用一句话描述这个方法的作用)   
	 * 创建人：张海川 193918518@qq.com      
	 * 创建时间：2018年11月12日 下午2:12:06    
	 * 修改人：张海川 193918518@qq.com      
	 * 修改时间：2018年11月12日 下午2:12:06    
	 * 修改备注： 
	 * @param start
	 * @param pageSize
	 * @return</pre>    
	 */
	@Select("SELECT bookId AS bookId,bookName AS bookName,bookPrice AS bookPrice,DATE_FORMAT(bookDate,'%Y-%m-%d') AS bookDate,bookPhoto AS bookPhoto FROM t_book LIMIT #{start},#{pageSize}")
	List<Book> findBook(@Param("start")int start,@Param("pageSize") int pageSize);

	/** <pre>findBookCount(这里用一句话描述这个方法的作用)   
	 * 创建人：张海川 193918518@qq.com      
	 * 创建时间：2018年11月12日 下午2:12:13    
	 * 修改人：张海川 193918518@qq.com      
	 * 修改时间：2018年11月12日 下午2:12:13    
	 * 修改备注： 
	 * @return</pre>    
	 */
	@Select("select count(*) from t_book")
	long findBookCount();

	/** <pre>getAll(这里用一句话描述这个方法的作用)   
	 * 创建人：张海川 193918518@qq.com      
	 * 创建时间：2018年11月12日 下午4:40:08    
	 * 修改人：张海川 193918518@qq.com      
	 * 修改时间：2018年11月12日 下午4:40:08    
	 * 修改备注： 
	 * @param book
	 * @return</pre>    
	 */
	@ResultType(com.jk.model.Book.class)
	@Select("select * from t_book")
	List<Book> getAll(Book book);
	
	

}
