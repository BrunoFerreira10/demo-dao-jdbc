package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Progam {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("-------------- TEST 1: Seller -> findById() ---------------");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}

}
