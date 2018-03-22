package vueTextuelle;

import model.ProfilUtilisateur;
import control.ControlCreerProfil;

public class BoundaryCreerProfilAdmin {

	private static ControlCreerProfil controlCreerProfil;
	
	public BoundaryCreerProfilAdmin(ControlCreerProfil controlCreerProfil)
	{
		this.controlCreerProfil=controlCreerProfil;
	}
	
	public void creerProfil()
	{
		Clavier clavier =new Clavier();
		System.out.println("Veuillez entrez votre nom");
		String nom=clavier.entrerClavierString();
		System.out.println("Veuillez entrez votre prenom");
		String prenom=clavier.entrerClavierString();
		System.out.println("Veuillez entrez votre mot de passe");
		String mdp = clavier.entrerClavierString();
		
	    this.controlCreerProfil.creerProfilGerant(ProfilUtilisateur.ADMIN, nom, prenom, mdp);		}
	
	
}