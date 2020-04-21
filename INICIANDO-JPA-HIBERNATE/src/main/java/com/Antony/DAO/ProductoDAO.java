package com.Antony.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Antony.model.Producto;

public class ProductoDAO {
public List<Producto> productoLista(){
 
	List<Producto> listapr = new ArrayList<>();
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HIBERNATE");
	em = emf.createEntityManager();
	
	try {
		
		em.getTransaction().begin();
		
		listapr = em.createQuery("from Producto").getResultList();
		em.getTransaction().commit();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
	return listapr;
}

public void agregarDatos(Producto pr) {
	
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HIBERNATE");
	em = emf.createEntityManager();
	
	em.getTransaction().begin();
	em.persist(pr);
	em.flush();
	em.getTransaction().commit(); 
}

public void actualizarDatos(Producto pr) {
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HIBERNATE");
	em = emf.createEntityManager();
	
	pr.getId();
	pr.getCantidadProducto();
	pr.getNombreProducto();
	pr.getPrecioProducto();
	pr.getTotalProducto();
	em.getTransaction().begin();
	em.merge(pr);
	em.flush();
	em.getTransaction().commit(); 
}

public void eliminarDatos(Producto pr) {
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HIBERNATE");
	em = emf.createEntityManager();
	
	pr = em.getReference(Producto.class, pr.getId());
	em.getTransaction().begin();
	em.remove(pr);
	em.flush();
	em.getTransaction().commit();
}

}
