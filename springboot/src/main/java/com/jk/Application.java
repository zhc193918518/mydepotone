/** 
 * <pre>项目名称:springboot 
 * 文件名称:Application.java 
 * 包名:com.jk 
 * 创建日期:2018年11月12日下午1:32:36 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/** 
 * <pre>项目名称：springboot    
 * 类名称：Application    
 * 类描述：    
 * 创建人：张海川 193918518@qq.com    
 * 创建时间：2018年11月12日 下午1:32:36    
 * 修改人：张海川 193918518@qq.com  
 * 修改时间：2018年11月12日 下午1:32:36    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.jk.mapper")
public class Application {

	public static void main (String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping("/")
	String home () {
		return "redirect:book/querybook";
	}
}
