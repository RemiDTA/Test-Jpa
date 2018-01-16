package banque.main;

import java.awt.List;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import banque.model.Addresse;
import banque.model.Banque;
import banque.model.Client;
import banque.model.Compte;
import banque.model.Operation;

public class AppliBancaire {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		System.out.println("€ $ £ ฿ ¤ ¢ ₭ ₦ ¥ Bienvenu dans l'appli bancaire PLEIN DE FLOUZ € $ £ ฿ ¤ ¢ ₭ ₦ ¥");

		// Creation d'instance
		// Addresse
		Addresse addr1 = new Addresse();
		addr1.setCodePostal(80000);
		addr1.setNumero(1);
		addr1.setRue("Rue blabla");
		addr1.setVille("Amiens");

		Addresse addr2 = new Addresse();
		addr2.setCodePostal(60000);
		addr2.setNumero(2);
		addr2.setRue("Rue de Paris");
		addr2.setVille("Beauvais");

		// Banque
		Banque banq = new Banque();
		banq.setNom("Société Générale");
				
		
		// Client
		Client cli1 = new Client();
		cli1.setAddressePrincipale(addr1);
		cli1.setBanque(banq);
		LocalDate dateN1 = LocalDate.of(1998, 2, 24);
		cli1.setDateNaissance(dateN1);
		cli1.setNom("Dupont");
		cli1.setPrenom("Jean");
		
		Client cli11 = new Client();
		cli1.setAddressePrincipale(addr1);
		cli1.setBanque(banq);
		LocalDate dateN11 = LocalDate.of(2000, 10, 27);
		cli1.setDateNaissance(dateN11);
		cli1.setNom("Dupont");
		cli1.setPrenom("Sarah");
		
		Client cli2 = new Client();
		cli2.setAddressePrincipale(addr2);
		cli2.setBanque(banq);
		LocalDate dateN2 = LocalDate.of(1975, 5, 17);
		cli2.setDateNaissance(dateN2);
		cli2.setNom("Dickens");
		cli2.setPrenom("Charles");
		
		Set listecli = new HashSet();
		listecli.add(cli1);
		listecli.add(cli2);
		listecli.add(cli11);
		banq.setClient(listecli);
//		
//		
//		// Compte
		Compte c1=new Compte();
		Compte c2=new Compte();
		Compte c3=new Compte();
		
		Set couple = new HashSet();
		couple.add(cli11);
		couple.add(cli1);
		
		
		c1.setListeClient(couple);
		c1.setNumero(3487875855874L);
		c1.setSolde(250);
//		
//		
//		//-------------------------------------------
//		
		Set solocli1 = new HashSet();
		solocli1.add(cli1);
		
		
		c2.setListeClient(solocli1);
		c2.setNumero(7545126871L);
		c2.setSolde(1000);
//		
//		//------------------------------------------
//		
		Set solocli11 = new HashSet();
		solocli11.add(cli11);
		
		
		c3.setListeClient(solocli11);
		c3.setNumero(565452468L);
		c3.setSolde(-100);
		
		
		Set listeCompte11 = new HashSet();
		listeCompte11.add(c1);
		listeCompte11.add(c3);
		
		Set listeCompte1 = new HashSet();
		listeCompte1.add(c1);
		
		Set listeCompte2 = new HashSet();
		listeCompte1.add(c2);
		
		cli2.setListeCompte(listeCompte2);		
		cli1.setListeCompte(listeCompte1);
		cli11.setListeCompte(listeCompte11);
		

//		// Operation
		Operation op=new Operation();
		op.setCompte(c1);
		LocalDate dateop = LocalDate.of(2018, 1, 1);
		op.setDate(dateop);
		op.setMontant(90);
		op.setMotif("J'avais froid au pied (doudoune integrer)");
		
		Set listeOpe = new HashSet();
		listeOpe.add(op);
		
		Set listeOpeVide = new HashSet();
		
		c1.setOpe(listeOpe);
		c2.setOpe(listeOpeVide);
		c3.setOpe(listeOpeVide);	
//		

		// Insertion des instances dans la base
		//client
		em.persist(cli1);
		em.persist(cli11);
		em.persist(cli2);
		
//		//banque
		em.persist(banq);
		
//		//compte
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		//operation
		
		em.persist(op);
		
		transaction.commit();
		
		em.close();
		entityManagerFactory.close();
	}

}
