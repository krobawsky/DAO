package com.tecsup.lab08.crud.app;

import com.tecsup.lab08.crud.bean.Employee;
import com.tecsup.lab08.crud.dao.EmployeeDAO;
import com.tecsup.lab08.crud.dao.EmployeeDAOImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeDAOImpl();
		
		int id = 369;
		
		Employee emp = dao.findById(id);
		
		System.out.println("Registro .. " + emp);
		
		dao.update(id, "Ricardo", "Berrospi", (double) 2000, 18);
		
		emp = dao.findById(id);
		
		System.out.println("Update .. " + emp);
				
		
		/**for (Employee item : dao.findAll()) {
			
			System.out.println(item);
		
			 
		};**/
		
	}

}
