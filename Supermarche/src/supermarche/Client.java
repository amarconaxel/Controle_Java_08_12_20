package supermarche;

/**
 * Représente un client du Supermarché
 * @author axel marcon
 * @version 1.0
 */
public class Client {

	/**
	 * Date d'arrivée en caisse
	 */
	private int dateArrivee;
	
	/**
	 * Durée de traitement du caddie
	 * (en minutes)
	 */
	private int dureeTraitement;
	
	/**
	 * Contructeur utilisant la date d'arrivée
	 * et la duree de traitement du caddie
	 * @param pDateArrivee date arrivée en caisse
	 * @param pDureeTraitement duree de traitement du caddie
	 */
	public Client(int pDateArrivee, int pDureeTraitement) {
		this.dateArrivee = pDateArrivee;
		this.dureeTraitement = pDureeTraitement;
	}

	
	public int getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(int dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public int getDureeTraitement() {
		return dureeTraitement;
	}
	
}
