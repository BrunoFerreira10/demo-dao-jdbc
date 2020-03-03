package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Progam {
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n-------------- TEST 1: Department -> findById() ---------------");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n-------------- TEST 3: Department -> findAll() ---------------");
		List<Department> listAll = departmentDao.findAll();
		listAll.forEach(System.out::println);
		
		/*System.out.println("\n-------------- TEST 4: Department -> insert() ---------------");
		department = new Department();
		department.setName("DevOps");
		departmentDao.insert(department);*/
				
		System.out.println("\n-------------- TEST 5: Department -> update() ---------------");
		department = departmentDao.findById(1);
		department.setName("Granja");
		departmentDao.update(department);
		System.out.println("Updated!");
		
		System.out.println("\n-------------- TEST 6: Department -> delete() ---------------");
		departmentDao.deleteById(7);
		System.out.println("Deleted!");
		
		System.out.println("\n-------------- TEST 3 - repeat: Department -> findAll() ---------------");
		listAll = departmentDao.findAll();
		listAll.forEach(System.out::println);
	}	

}
