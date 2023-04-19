package main.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Saquib");

		EntityManager entity = factory.createEntityManager();

		entity.getTransaction().begin();

		Employee emp1 = new Employee(01, "ajay", 23456, "dst");
		Employee emp2 = new Employee(02, "vamsi", 5658, "vill");
		Employee emp3 = new Employee(03, "raja", 1154, "cty");
		Employee emp4 = new Employee(04, "sohel", 1156, "cty");

		entity.persist(emp1);
		entity.persist(emp2);
		entity.persist(emp3);
		entity.persist(emp4);

		entity.getTransaction().commit();

		System.out.println("Data is inserted");

	}

}
