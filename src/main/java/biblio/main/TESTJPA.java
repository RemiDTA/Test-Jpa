package biblio.main;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import biblio.model.Emprunt;
import biblio.model.Livre;

public class TESTJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pizzeria");
		EntityManager em = entityManagerFactory.createEntityManager();
		System.out.println("bienvenu dans la biblioth�que");
		
		//R�aliser une requ�te qui permet d�extraire un emprunt et tous ses livres associ�s.
		
		Query query = em.createQuery("select e from emprunt e where id=1");
		Emprunt Emp1 = (Emprunt) query.getResultList().get(0);
	}

}
