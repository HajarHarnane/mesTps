package ma.education.tp2.statickeyword;

public class Rappel1 {

	static int vitesse = 10;
	Rappel1(int v){
	this();
	vitesse+=v;
	}
	Rappel1(){
	vitesse++;
	}
	public static void main(String[] args) {
	Rappel1 r1=new Rappel1(20);
	Rappel1 r2=new Rappel1(30);
	System.out.println(r1.vitesse);/*62*/
	System.out.println(r2.vitesse);/*62 ( la vitesse est static)*/
	
	
	/* RappelFille donne une erreur de compilation,car l'attribut n'est pas static ds la methode static
	 */
	}


}
