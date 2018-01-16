package banque.model;

import javax.persistence.*;

@DiscriminatorValue("VIR")
public class Virement extends Operation{

	@Column(name = "BENEF", length=30)
	private String beneficiaire;
	public Virement() {
		// TODO Auto-generated constructor stub
	}

}
