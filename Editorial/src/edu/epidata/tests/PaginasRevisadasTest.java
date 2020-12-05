package edu.epidata.tests;

import static org.junit.Assert.assertEquals;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import edu.epidata.dto.ReporteDTO;
import edu.epidata.jpa.CargaDatos;

public class PaginasRevisadasTest {

	private TypedQuery<ReporteDTO> tpQuery;

	@BeforeClass
	public static void setUp() throws FileNotFoundException, IOException {
		CargaDatos.cargar();
	}

	@Test
	public void anioSinPaginasRevisadas() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 2020);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados2020();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas2017() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 2017);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados2017();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados2016() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 2016);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados2016();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados2013() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 2013);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados2013();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados2005() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 2005);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados2005();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1996() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 1996);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados1996();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1994() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 1994);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados1994();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1990() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 1990);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados1990();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1989() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 1989);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados1989();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1984() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReporteDTO.class);
		tpQuery.setParameter("anio", 1984);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReporteDTO> esperado = esperados1984();

		assertEquals(esperado, obtenido);
	}

	@AfterClass
	public static void after() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Query query = em.createQuery("DELETE Capitulo");
		query.executeUpdate();
		em.getTransaction().commit();

		em.getTransaction().begin();
		query = em.createQuery("DELETE Libro");
		query.executeUpdate();
		em.getTransaction().commit();

		em.getTransaction().begin();
		query = em.createQuery("DELETE Persona");
		query.executeUpdate();
		commitAndClose(emf, em);
	}

	private static void commitAndClose(EntityManagerFactory emf, EntityManager em) {
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	private List<ReporteDTO> esperados2020() {
		return new ArrayList<ReporteDTO>();
	}

	private List<ReporteDTO> esperados2017() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(7, 1));
		esperado.add(new ReporteDTO(8, 1));
		esperado.add(new ReporteDTO(11, 1));
		esperado.add(new ReporteDTO(13, 2));
		esperado.add(new ReporteDTO(22, 1));
		esperado.add(new ReporteDTO(23, 1));
		esperado.add(new ReporteDTO(26, 1));
		esperado.add(new ReporteDTO(28, 1));
		esperado.add(new ReporteDTO(29, 1));
		esperado.add(new ReporteDTO(35, 1));
		esperado.add(new ReporteDTO(36, 1));
		esperado.add(new ReporteDTO(38, 2));
		esperado.add(new ReporteDTO(39, 1));
		esperado.add(new ReporteDTO(41, 1));
		esperado.add(new ReporteDTO(42, 1));
		esperado.add(new ReporteDTO(47, 1));
		esperado.add(new ReporteDTO(48, 1));
		return esperado;
	}

	private List<ReporteDTO> esperados2016() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(12, 1));
		esperado.add(new ReporteDTO(13, 1));
		esperado.add(new ReporteDTO(15, 1));
		esperado.add(new ReporteDTO(18, 1));
		esperado.add(new ReporteDTO(23, 1));
		esperado.add(new ReporteDTO(25, 1));
		esperado.add(new ReporteDTO(33, 1));
		esperado.add(new ReporteDTO(48, 1));
		esperado.add(new ReporteDTO(49, 1));
		return esperado;
	}

	private List<ReporteDTO> esperados2013() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(3, 1));
		esperado.add(new ReporteDTO(6, 1));
		esperado.add(new ReporteDTO(7, 2));
		esperado.add(new ReporteDTO(10, 1));
		esperado.add(new ReporteDTO(15, 2));
		esperado.add(new ReporteDTO(23, 1));
		esperado.add(new ReporteDTO(30, 1));
		esperado.add(new ReporteDTO(31, 1));
		esperado.add(new ReporteDTO(34, 1));
		esperado.add(new ReporteDTO(37, 1));
		esperado.add(new ReporteDTO(38, 1));
		return esperado;
	}

	private List<ReporteDTO> esperados2005() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(8, 1));
		esperado.add(new ReporteDTO(9, 1));
		esperado.add(new ReporteDTO(19, 1));
		esperado.add(new ReporteDTO(21, 1));
		esperado.add(new ReporteDTO(30, 1));
		esperado.add(new ReporteDTO(31, 1));
		esperado.add(new ReporteDTO(35, 1));
		esperado.add(new ReporteDTO(42, 2));
		esperado.add(new ReporteDTO(48, 1));
		return esperado;
	}

	private List<ReporteDTO> esperados1996() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(2, 1));
		esperado.add(new ReporteDTO(8, 1));
		esperado.add(new ReporteDTO(14, 2));
		esperado.add(new ReporteDTO(30, 1));
		esperado.add(new ReporteDTO(36, 1));
		esperado.add(new ReporteDTO(43, 1));
		esperado.add(new ReporteDTO(44, 1));
		return esperado;
	}

	private List<ReporteDTO> esperados1994() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(16, 1));
		esperado.add(new ReporteDTO(18, 1));
		esperado.add(new ReporteDTO(19, 1));
		esperado.add(new ReporteDTO(20, 1));
		esperado.add(new ReporteDTO(22, 1));
		esperado.add(new ReporteDTO(32, 1));
		esperado.add(new ReporteDTO(34, 1));
		esperado.add(new ReporteDTO(38, 1));
		esperado.add(new ReporteDTO(39, 1));
		esperado.add(new ReporteDTO(45, 1));
		esperado.add(new ReporteDTO(49, 1));
		esperado.add(new ReporteDTO(50, 1));
		return esperado;
	}

	private List<ReporteDTO> esperados1990() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(13, 1));
		esperado.add(new ReporteDTO(19, 1));
		esperado.add(new ReporteDTO(20, 1));
		esperado.add(new ReporteDTO(26, 2));
		esperado.add(new ReporteDTO(27, 1));
		esperado.add(new ReporteDTO(40, 1));
		esperado.add(new ReporteDTO(42, 1));
		esperado.add(new ReporteDTO(44, 1));
		return esperado;
	}

	private List<ReporteDTO> esperados1989() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(1, 1));
		esperado.add(new ReporteDTO(4, 1));
		esperado.add(new ReporteDTO(10, 1));
		esperado.add(new ReporteDTO(13, 1));
		esperado.add(new ReporteDTO(19, 1));
		esperado.add(new ReporteDTO(20, 2));
		esperado.add(new ReporteDTO(35, 1));
		esperado.add(new ReporteDTO(42, 1));
		esperado.add(new ReporteDTO(48, 1));
		esperado.add(new ReporteDTO(49, 1));
		return esperado;
	}

	private List<ReporteDTO> esperados1984() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(4, 1));
		esperado.add(new ReporteDTO(6, 1));
		esperado.add(new ReporteDTO(12, 1));
		esperado.add(new ReporteDTO(16, 1));
		esperado.add(new ReporteDTO(18, 1));
		esperado.add(new ReporteDTO(32, 1));
		esperado.add(new ReporteDTO(39, 1));
		esperado.add(new ReporteDTO(44, 1));
		esperado.add(new ReporteDTO(45, 1));
		return esperado;
	}
}
