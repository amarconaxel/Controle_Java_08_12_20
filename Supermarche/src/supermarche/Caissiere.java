package supermarche;

/**
 * Repr�sente une caissiere prenant place 
 * dans une Caisse du Supermarche
 * @author axel marcon
 * @version 1.0
 */
public class Caissiere {

	/**
	 * Permet de saivoir si une caissiere est exp�riment�e
	 * --> true si la caissiere est exp�riment�e
	 */
	private boolean experimentee;
	
	/**
	 * Contructeur demandant l'experience de la caissiere
	 * @param pExperimentee true si exp�riment�e
	 */
	public Caissiere(boolean pExperimentee) {
		this.experimentee = pExperimentee;
	}

	public boolean isExperimentee() {
		return experimentee;
	}
	
}
