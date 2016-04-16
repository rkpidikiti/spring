package in.javahome.springjdbc.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteProduct {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("javahome-jdbc.xml");
		ProductDAO productDAO = context.getBean(ProductDAO.class);
		productDAO.deleteProduct(333);
	}
}
