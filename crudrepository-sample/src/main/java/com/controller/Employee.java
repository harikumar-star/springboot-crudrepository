package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.interfaces.UserDao;
import com.example.demo.Employees;

@Controller
@EnableJpaRepositories(basePackages = "com.interfaces")
public class Employee {

	@Autowired
	UserDao dao;

	@RequestMapping(value = "/add", method = RequestMethod.GET)

	public void saveOrUpdate(Employees books) {
		System.out.println(books.getAge() + "" + books.getName());
		dao.save(books);

		System.out.println("add success");
	}

	@RequestMapping(value = "/showrecord", method = RequestMethod.GET)
	public List<Employees> getAllEmployees()   
	{  
	List<Employees> books = new ArrayList<Employees>();  
	dao.findAll().forEach(books1 -> books.add(books1));  
	System.out.println("All records");	
	System.out.println(books);
	return books;  
	}   
	
	@RequestMapping(value = "/getrecordbyid", method = RequestMethod.GET)
	public void getBooksById(Employees emp)   
	{  
		System.out.println("get record bt id ");	
		System.out.println(dao.findById(emp.getAge()).get());
	//return dao.findById(emp.getAge()).get();  
	}  
	
	public void delete(Employees emp)   
	{  
	dao.deleteById(emp.getAge());  
	System.out.println("Record delete successs");
	}  
	
	
}
