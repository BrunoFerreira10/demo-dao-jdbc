package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Progam {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("-------------- TEST 1: Seller -> findById() ---------------");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("-------------- TEST 2: Seller -> findByDepartment() ---------------");
		Department department = new Department(2, "");
		List<Seller> listByDepartment = sellerDao.findByDepartment(department);
		listByDepartment.forEach(System.out::println);
		
		System.out.println("-------------- TEST 3: Seller -> findAll() ---------------");
		List<Seller> listAll = sellerDao.findAll();
		listAll.forEach(System.out::println);
		
		System.out.println("-------------- TEST 4: Seller -> insert() ---------------");
		seller = new Seller();
		seller.setName("Greg");
		seller.setEmail("greg@gmail.com");
		seller.setBirthDate(new Date());
		seller.setBaseSalary(4000.0);
		seller.setDepartment(department);
		sellerDao.insert(seller);
		
		if(seller.getId() != null)
			System.out.println("Inserted! New id = " + seller.getId());
	}	

}
