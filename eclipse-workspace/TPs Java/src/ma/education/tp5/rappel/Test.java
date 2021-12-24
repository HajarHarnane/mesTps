package ma.education.tp5.rappel;

public class Test {

	public static void main(String[] args) {
		Testable t = email->{
			if (email=="hajarharnane@gmail.com") {
				return true;
			}
			return false;
		};
		System.out.println(t.isCorrect("hajr"));
		Operation o=(a,b)->a+b;
		System.out.println(o.addition(1,1));
		Logger l=log->System.out.println(log);
		l.display("abc");
		//2) 2;4
		
		

	}

}
