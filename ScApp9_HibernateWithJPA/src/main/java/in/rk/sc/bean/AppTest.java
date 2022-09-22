package in.rk.sc.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTest {

	public static void main(String[] args) {

		EntityTransaction tx = null;

		try {
			// 1. Create EntityManagerFctory by passing persistent unit name: Load Drivers,
			// Create DB connection, Prepare statement
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppDB");

			// 2. Create EntityManager object from Factory(To do DB operation)
			EntityManager et = emf.createEntityManager();

			// 3. Get Transaction object form EntityManager to Begin Transaction
			// 4. start Transaction
			tx = et.getTransaction();
			tx.begin();
			
			
			// 5. Prepare Entity Object: emp object
			Employee emp = new Employee();
			emp.setEmpId(100);
			emp.setEmpName("Ravi");
			emp.setEmpSal(5000.00);
			
			// 6. Perform DB operation:
			et.persist(emp);
			
			//7. Commit Transaction
			tx.commit();
			
			//8. Close EntityManagerFactory
			emf.close();

		} catch (Exception e) {
			//9. Rollback Transaction if any Exception
			tx.rollback();
			e.printStackTrace();
		}

	}

}
