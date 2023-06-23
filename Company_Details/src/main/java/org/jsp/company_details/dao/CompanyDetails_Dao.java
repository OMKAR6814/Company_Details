package org.jsp.company_details.dao;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.company_details.dto.Company;



public class CompanyDetails_Dao {
	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveCompanyDetails(Company company) {
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}
	
	public void updateCompanyDetails(Company company) {
		transaction.begin();
		manager.merge(company);
		transaction.commit();
	}
	
	public void findCompanyDetailsById(int id) {
		Company company=manager.find(Company.class, id);
		System.out.println(company);
	}
	
	public void RemoveCompanyById(int id) {
		Company company=manager.find(Company.class, id);
		
		if(company!=null) {
			transaction.begin();
			manager.remove(company);
			transaction.commit();
		}
	}
	
	
	public void findAllCompanyDetails() {
		Query q=manager.createQuery("select b from Company b");
		List<Company> l=q.getResultList();
		
		Iterator i=l.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
