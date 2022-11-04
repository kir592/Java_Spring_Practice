package com.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springorm.product.dao.ProductDao;
import com.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springorm/product/test/config.xml");
		ProductDao productDAO = (ProductDao) context.getBean("productdaoimpl");
		Product pro = new Product();
		pro.setId(3);
		pro.setName("tv");
		pro.setPrice(23412);
		pro.setDesc("A Phone");
		//productDAO.create(pro);
		
		//productDAO.update(pro);
		
		//productDAO.delete(pro);
		
		//Product p = productDAO.find(1);
		//System.out.println(p.toString());
		
		
		List<Product> products = productDAO.findAll();
		System.out.println(products);
		
		
		
	}

}
