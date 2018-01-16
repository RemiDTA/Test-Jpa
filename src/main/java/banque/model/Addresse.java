package banque.model;

import javax.persistence.*;

@Embeddable
public class Addresse {

	@Column(name = "NUM")
	private int numero;
	@Column(name = "RUE", length = 30)
	private String rue;
	@Column(name = "CODE_P") 
	private int codePostal;
	@Column(name = "VILLE", length = 30)
	private String ville;
	
	public Addresse() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}


}
