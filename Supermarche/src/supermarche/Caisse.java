package supermarche;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Repr�sente une caisse du Supermarche
 * @author axel marcon
 * @version 1.0
 */
public class Caisse {

	/**
	 * File des clients attendant a la caisse
	 */
	private ConcurrentLinkedQueue<Client> fileClients;
	
	/**
	 * Caissi�re travaillant a la caisse
	 * experiment�e ou non (voir boolean)
	 */
	private Caissiere caissiere;
	
	/**
	 * Constructeur demandant une caissiere
	 * @param pCaissiere caissiere
	 */
	public Caisse(Caissiere pCaissiere) {
		this.caissiere = pCaissiere;
		this.fileClients = new ConcurrentLinkedQueue<Client>();
	}

	public ConcurrentLinkedQueue<Client> getFileClients() {
		return fileClients;
	}

	public void setFileClients(ConcurrentLinkedQueue<Client> fileClients) {
		this.fileClients = fileClients;
	}

	public Caissiere getCaissiere() {
		return caissiere;
	}
	
}
