package supermarche;


import org.junit.jupiter.api.Test;

/**
 * Classe de test pour l'ensemble du Projet Supermarche
 * @author axel marcon
 * @version 1.0
 */
class TestSupermarche {

	@Test
	void testSupermarche() {
		
		Client[] clients = 
			{ 
				new Client(0, 2),
				new Client(0, 2),
				new Client(0, 2),
				new Client(1, 2)
			};
		
		Caisse[] caisses = 
			{	new Caisse(new Caissiere(false)), 
				new Caisse(new Caissiere(false))
			};
		
		Supermarche supermarket = new Supermarche();
		
		supermarket.ajouterClients(clients);
		supermarket.ajouterCaisses(caisses);
		
	}
	
	@Test
	void testCaisse() {
		Client client1 = new Client(0, 2);
		Client client2 = new Client(0, 2);

		Caisse caisseExp = new Caisse(new Caissiere(true));
		Caisse caisseNonExp = new Caisse(new Caissiere(false));
		
		caisseExp.ajouterClient(client1);
		caisseExp.ajouterClient(client2);
		
		caisseNonExp.ajouterClient(client1);
		caisseNonExp.ajouterClient(client2);
		
		System.out.println("Caisse exp : " + caisseExp.getDureeTraitement());
		System.out.println("Caisse non exp : " + caisseNonExp.getDureeTraitement());
	}
	
	@Test
	void testRepartition() {
		Client[] clients = 
			{ 
				new Client(0, 2),
				new Client(0, 2),
				new Client(0, 2),
				new Client(1, 2)
			};
		
		Caisse[] caisses = 
			{	new Caisse(new Caissiere(false)), 
				new Caisse(new Caissiere(false))
			};
		
		Supermarche supermarket = new Supermarche();
		
		supermarket.ajouterClients(clients);
		supermarket.ajouterCaisses(caisses);
		
		supermarket.repartirClients();
		
	}
	
	@Test
	void testPasserClients() {
		Client[] clients = 
			{ 
				new Client(0, 2),
				new Client(0, 2),
				new Client(0, 2),
				new Client(1, 2)
			};
		
		Caisse[] caisses = 
			{	new Caisse(new Caissiere(false)), 
				new Caisse(new Caissiere(false))
			};
		
		Supermarche supermarket = new Supermarche();
		
		supermarket.ajouterClients(clients);
		supermarket.ajouterCaisses(caisses);
		
		supermarket.repartirClients();
		
		for(Caisse caisse : supermarket.getListeCaisses()) {
			caisse.passerClients();
		}
	}

}
