public class Main {

	public static void main(String[] args) throws VoitureException {

		Voiture v1=new Voiture(123, "polo", 125);
		Voiture v2=new Voiture(555, "bm", 5000);
		Voiture v3=new Voiture(555, "m", 5000);
		ListVoitures L=new ListVoitures();
		L.ajoutVoiture(v1);
		L.ajoutVoiture(v2);
		L.ajoutVoiture(v3);
		
		L.affiche();
		

		
	}

}
