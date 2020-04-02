package com.Antony.controladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Antony.model.*;

/**
 * Servlet implementation class ServeleteControler
 */
public class ServeleteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String id = request.getParameter("id");
		String nombrepr = request.getParameter("Nproductos");
		String preciopr = request.getParameter("Pproductos");
		String cantidadpr = request.getParameter("Cproductos");
		String totalpr = request.getParameter("Tproductos");
		
		Producto pr = new Producto();
		pr.setId(Integer.parseInt(id));
		pr.setNombreProducto(nombrepr);
		pr.setPrecioProducto(Double.parseDouble(preciopr));
		pr.setCantidadProducto(Integer.parseInt(cantidadpr));
		pr.setTotalProducto(Double.parseDouble(totalpr));
		
		EntityManager em;
		
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HIBERNATE");
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(pr);
		//em.merge(pr);
		//pr = em.getReference(Producto.class, pr.getId());
		//em.remove(pr);
		em.flush();
		em.getTransaction().commit();
		response.sendRedirect("index.jsp")
		
		; 
		
		
		
		
		
		
		
		
		
		
	}

}
