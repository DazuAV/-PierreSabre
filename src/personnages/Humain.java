package personnages;

public class Humain {
	private String nom;
	private String boissonfavorite;
	private int argentpossede;

	
	
	
	public Humain(String nom,String boissonfavorite, int argentpossede) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argentpossede=argentpossede;
	}
	
	
	String GetNom(String nom) {
		return nom;
	}
	
	
	int GetArgent(int argentpossede) {
		return argentpossede;}
	
 
	private void direBonjour() {
		System.out.println("Bonjour ! Je m’appelle" + nom + "et j’aime boire du" + boissonfavorite );
		
	}
	private void boire() {
		System.out.println("Mmmm, un bon verre de" + boissonfavorite + " ! GLOUPS !" );
		
	}
	
	public void acheter(String bien, int prix) {
		System.out.println("J'ai acheter " + bien + " pour seulement " + prix +"€");
		
	}
	public int gagnerArgent(int gain) {
		
		return gain;
	}
	
	public int perdreArgent(int perte) {

		return perte;}
	
	//doit finir de completer sans void !
	public void parler(String texte) {
		
	}
	
}
