package biblio.main;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import biblio.model.Client;
import biblio.model.Emprunt;
import biblio.model.Livre;

public class biblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pizzeria");
		EntityManager em = entityManagerFactory.createEntityManager();
		System.out.println("bienvenu dans la bibliothèque");
		
		Query query = em.createQuery("select l from Livre l where l.titre='Vingt mille lieues sous les mers'");
		Livre l = (Livre) query.getResultList().get(0);
		if (l != null){
			System.out.println("Le livre a été trouvé");
			System.out.println(l.getAuteur());
			System.out.println(l.getTitre());
			}
		//Réaliser une requête qui permet d’extraire un emprunt et tous ses livres associés.
		
		Query query1 = em.createQuery("select e from Emprunt e where e.id=1");
		Emprunt Emp1 = (Emprunt) query1.getResultList().get(0);
		
		for (Livre livre : Emp1.getLivre())
		{
			System.out.println(livre.getTitre());
		}
		//Réaliser une requête qui permet d’extraire tous les emprunts d’un client donné.
		Query query2 = em.createQuery("select c from Client c where c.id=1");
		Client client1 = (Client) query2.getResultList().get(0);
		for (Emprunt emp : client1.getEmprunt())
		{
			System.out.println(emp.getDateDebut());
		}
	}
}
