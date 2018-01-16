package banque.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "client")
public class Client {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_CLIENT")
	private int id;
	@Column(name = "NOM", length = 30)
	private String nom;
	@Column(name = "PRENOM", length = 30)
	private String prenom;
	@Column(name = "DATENAISS")
	private LocalDate dateNaissance;
	@Embedded
	private Addresse AddressePrincipale;
	
	@ManyToOne
	@JoinColumn(name="ID_BANQUE")
	Banque banque;
	
	@ManyToMany(mappedBy="listeClient")
	Set <Compte> listeCompte;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Addresse getAddressePrincipale() {
		return AddressePrincipale;
	}

	public void setAddressePrincipale(Addresse addressePrincipale) {
		AddressePrincipale = addressePrincipale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public Set<Compte> getListeCompte() {
		return listeCompte;
	}

	public void setListeCompte(Set<Compte> listeCompte) {
		this.listeCompte = listeCompte;
	}

}
