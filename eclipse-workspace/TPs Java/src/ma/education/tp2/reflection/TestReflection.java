package ma.education.tp2.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

import ma.eduction.tp1.introduction.Salle;

public class TestReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls=Salle.class;
		Field[] fields= cls.getDeclaredFields();
		for(Field att:fields) {
			System.out.println(att.getName());
		}
	
		Method[] meth=cls.getDeclaredMethods();
		for(Method m : meth) {
			System.out.println(m.getName());
		}
		Salle o1=null;
		Salle o2=null;
		Salle o3=null;
		Constructor[] c =cls.getDeclaredConstructors();
		for(Constructor cons :c){
			int count = cons.getParameterCount();
			switch(count) {
			case 0:{
				o1=(Salle) cons.newInstance();
				break;
			}
			case 1:{
				o2=(Salle) cons.newInstance("Salle Informatique");
				break;
			}
			case 2:{
				o3=(Salle) cons.newInstance(2,"Salle des cours");
				break;
			}
			default : {
				
				break;
			}
			}
		}
		System.out.println(o2.equals(o3));
		
	}
	

}
