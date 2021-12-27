package ma.education.tp6.rappel_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test_rappel {
	public static void main(String[] args) {
		/*List<Laptop> l = new ArrayList<>();
		l.add(new Laptop(10));
		l.add(new Laptop(20));
		l.add(1,new Laptop(5));
		l.forEach(i-> System.out.println(i));//10-5-20 pq(index)*/
		//*************************************************************
		/*Set<Laptop> l = new HashSet<>();
		l.add(new Laptop(12.000));
		l.add(new Laptop(13.6));
		l.add(new Laptop(12));
		l.add(new Laptop(15.4));
		l.add(new Laptop(13.600));
		l.add(new Laptop(13.60));
		l.forEach(i-> System.out.println(i));//12.0,13.6,15.4
		}*/
		//************************************************
		Set<Point> l = new TreeSet<>((p1,p2)->(int) (p1.x-p2.x));
		l.add(new Point(12.5,13));
		l.add(new Point(14.4,15));
		l.add(new Point(12.50,15));
		l.add(new Point(11.50,15));
		l.forEach(i-> System.out.println(i));
		
	}
}
	
