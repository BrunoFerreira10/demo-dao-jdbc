package application;

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
	}	

}
