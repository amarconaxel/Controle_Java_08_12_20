package supermarche;

/**
 * Représente une caissiere prenant place 
 * dans une Caisse du Supermarche
 * @author axel marcon
 * @version 1.0
 */
public class Caissiere {

	/**
	 * Permet de saivoir si une caissiere est expérimentée
	 * --> true si la caissiere est expérimentée
	 */
	private boolean experimentee;
	
	/**
	 * Contructeur demandant l'experience de la caissiere
	 * @param pExperimentee true si expérimentée
	 */
	public Caissiere(boolean pExperimentee) {
		this.experimentee = pExperimentee;
	}

	public boolean isExperimentee() {
		return experimentee;
	}
	
}
