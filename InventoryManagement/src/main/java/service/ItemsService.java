package service;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Service;

import com.InventoryManagement.dto.Items;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Service
public class ItemsService {
	
	
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rushi");
	 
	 EntityManager entityManager=entityManagerFactory.createEntityManager();
	 
	 EntityTransaction entityTransaction=entityManager.getTransaction();
	 
	 
	 
	 public String saveItems(Items items)
	 {
		 entityTransaction.begin();
		 
		 entityManager.persist(items);
		 
		 entityTransaction.commit();
		 
		 return "Items added Successfully ";
	 }
	 
	 public void updateItems(Integer ID, Items items)
	 {
		 Items it=entityManager.find(Items.class, ID);
		 
		 if(it.getID()!=null)
		 {
	
			 entityTransaction.begin();
			 entityManager.persist(items);
			 entityTransaction.commit();
			 
		 }
	 }
	 
	 public void deleteItems(Integer ID) {
		 
		 Items it2=entityManager.find(Items.class, ID);
		 
		 entityTransaction.begin();
		 entityManager.remove(it2);
		 entityTransaction.commit();
	 }
	 
	 

}
