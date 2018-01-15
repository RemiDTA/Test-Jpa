package model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

	@Id
	private int id; 
	@OneToMany(mappedBy="cli")
	private Set<Emprunt> emprunt;
	
	@Column(name = "NOM", length = 30)
	private String nom;
	
	@Column(name = "PRENOM", length = 30)
	private String prenom;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Set<Emprunt> getEmprunt() {
		return emprunt;
	}

	public void setEmprunt(Set<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}


}
