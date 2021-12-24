package ma.eduction.tp1.introduction;

public class Salle
{
	protected long id;
	protected String nom;
	/*Salle(){};*/
	public Salle(String nom){this.nom=nom;};
	public Salle(long id,String nom){this.id=id;this.nom=nom;};
	
	boolean equals(Object o1,Object o2)
	{
		Salle s1=(Salle)o1;
		Salle s2=(Salle)o2;
		
		if(s1.id==s2.id) {
			return true;
		}
		return false;
		
	}
	
}


	
		
	

