package ma.eduction.tp1_1.introduction;

import ma.eduction.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle{
	AccesHorsPackage()
	{
		super("k");
	}

	public void afficher(Salle s) {
		System.out.println(super.id );
		System.out.println(super.nom );
		System.out.println(id );
		System.out.println(nom );}
	
	public  void main(String[] args) {
		Salle SalleA=new Salle(1,"hajar");
		System.out.println(super.id+" "+super.nom);
		
}}