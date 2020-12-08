package supermarche;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Représente une caisse du Supermarche
 * @author axel marcon
 * @version 1.0
 */
public class Caisse {
	
	/**
	 * Duree de traitement de l'ensemble 
	 * des clients de la caisse (en minutes)
	 */
	private int dureeTraitement;

	/**
	 * File des clients attendant a la caisse
	 */
	private ConcurrentLinkedQueue<Client> fileClients;
	
	/**
	 * Caissière travaillant a la caisse
	 * experimentée ou non (voir boolean)
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
	
	/**
	 * Permet d'ajouter un client a la file d'attente de la caisse
	 * et ajoute le temps de traitement du caddie 
	 * au temps de traitement de la caisse
	 * @param pClient client a ajouter
	 */
	public void ajouterClient(Client pClient) {
		this.fileClients.add(pClient);
		if (this.caissiere.isExperimentee()) {
			this.dureeTraitement += pClient.getDureeTraitement() / 2;
		} else {
			this.dureeTraitement += pClient.getDureeTraitement();
		}
	}

	
	public int getDureeTraitement() {
		return dureeTraitement;
	}

	public ConcurrentLinkedQueue<Client> getFileClients() {
		return fileClients;
	}

	public Caissiere getCaissiere() {
		return caissiere;
	}
	
	
}
