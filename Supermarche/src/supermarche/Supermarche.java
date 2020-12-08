package supermarche;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Repr�sente un supermarche compos� de Client et de Caisse
 * @author axel marcon
 * @version 1.0
 */
public class Supermarche {

	/**
	 * File globale du supermarch�
	 */
	private ConcurrentLinkedQueue<Client> fileGlobale;
	
	/**
	 * Liste des caisses pr�sentes 
	 * (et donc ouverte) du supermarch�
	 */
	private ArrayList<Caisse> listeCaisses;
	
	/**
	 * Contruit un Supermarche
	 */
	public Supermarche() {
		this.fileGlobale = new ConcurrentLinkedQueue<Client>();
		this.listeCaisses = new ArrayList<Caisse>();
	}
	
	/**
	 * Permet d'ajouter des clients dans 
	 * la file globale du supermarch�
	 * @param pListeClient liste de clients a ajouter
	 */
	public void ajouterClients(Client[] pListeClient) {
		for (Client client : pListeClient) {
			this.fileGlobale.add(client);
		}
	}
	
	/**
	 * Permet d'ajouter des caisse dans 
	 * la liste de caisses du supermarche
	 * @param pListeCaisses liste des caisses a ajouter
	 */
	public void ajouterCaisses(Caisse[] pListeCaisses) {
		for (Caisse caisse : pListeCaisses) {
			this.listeCaisses.add(caisse);
		}
	}

	public ConcurrentLinkedQueue<Client> getFileGlobale() {
		return fileGlobale;
	}

	public void setFileGlobale(ConcurrentLinkedQueue<Client> fileGlobale) {
		this.fileGlobale = fileGlobale;
	}

	public ArrayList<Caisse> getListeCaisses() {
		return listeCaisses;
	}

	public void setListeCaisses(ArrayList<Caisse> listeCaisses) {
		this.listeCaisses = listeCaisses;
	}
	
	
}
