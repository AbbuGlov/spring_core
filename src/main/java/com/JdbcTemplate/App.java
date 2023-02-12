package com.JdbcTemplate;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.JdbcTemplate.dao.EmployeDao;
import com.JdbcTemplate.dao.EmployeDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	AbstractApplicationContext a=  new AnnotationConfigApplicationContext(BeanConfigCls.class);
    			
    			//new ClassPathXmlApplicationContext("Config.xml");
    	
    	
    EmployeDao e	=a.getBean("servicePookanna",EmployeDaoImpl.class);	
    		
    	
    List.of(new Employe("GA21039","","",""),
    		
    		new Employe("GA21040","","",""),
    		new Employe("GA20001","","",""),
    		new Employe("GA20088","","","")
    		
    		
    		).stream().map(x->x.getId()).forEach(x->System.out.println(e.getEmploye(x)));
    
    
    	
    	
    }
}
