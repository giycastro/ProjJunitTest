
public class Compte {
	private int numero;
	private String nom;
	private double solde;

	public Compte(int numero, String nom, double solde) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.solde = solde;
	}

	public void Deposer(double s) {
			solde = solde + s;
	}
	
	private final double fraisFerm = 8;
	public void Retirer(double s) {
		if (solde - fraisFerm >= fraisFerm) {
			solde = solde - s;
		}
	}

	public String info() {

		return (numero + ", Solde : " + solde);
	}

	public double GetSolde() {
		return solde;
	}

	public int Getnumero() {
		return numero;
	}
}
