package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Progam2 {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\\n-------------- TEST 1: Seller -> findById() ---------------");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\\n-------------- TEST 2: Seller -> findByDepartment() ---------------");
		Department department = new Department(2, "");
		List<Seller> listByDepartment = sellerDao.findByDepartment(department);
		listByDepartment.forEach(System.out::println);
		
		System.out.println("\\n-------------- TEST 3: Seller -> findAll() ---------------");
		List<Seller> listAll = sellerDao.findAll();
		listAll.forEach(System.out::println);
		
		/*System.out.println("\n-------------- TEST 4: Seller -> insert() ---------------");
		seller = new Seller();
		seller.setName("Greg");
		seller.setEmail("greg@gmail.com");
		seller.setBirthDate(new Date());
		seller.setBaseSalary(4000.0);
		seller.setDepartment(department);
		sellerDao.insert(seller);
		
		if(seller.getId() != null)
			System.out.println("Inserted! New id = " + seller.getId());*/
		
		/*System.out.println("\n-------------- TEST 5: Seller -> update() ---------------");
		seller = sellerDao.findById(1);
		seller.setName("Bruce Waine");
		sellerDao.update(seller);
		System.out.println("Updated!");*/
		
		System.out.println("\n-------------- TEST 6: Seller -> delete() ---------------");
		sellerDao.deleteById(20);
		System.out.println("Deleted!");
		
		System.out.println("\\n-------------- TEST 3 - repeat: Seller -> findAll() ---------------");
		listAll = sellerDao.findAll();
		listAll.forEach(System.out::println);
	}	

}
