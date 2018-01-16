package biblio.model;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="livre")
public class Livre {

	@Id
	private int id;
	@Column(name = "TITRE", length = 30)
	private String titre;
	@Column(name = "AUTEUR", length = 30)
	private String auteur;
	
	//jointure
	@ManyToMany
	@JoinTable(name="compo",joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"))
	private Set<Emprunt> emprunt;
	
	public Livre() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
}
