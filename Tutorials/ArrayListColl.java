package Tutorials;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListColl {
	public static void main(String args[]){  
		
		//String name="Niharika";
		ArrayList li=new ArrayList();
		ArrayList<Integer> lo=new ArrayList<Integer>();
		li.add(0, "Suvi");
		li.add(2);
		li.add("Neha");
		li.add(98);
		li.add(18.76);
		li.add(88);
		System.out.println(li.contains("Neha"));
		System.out.println(li.size());
//		li.remove(1);
		lo.sort(null);
		lo.add(9);
		lo.add(10);
		lo.add(2);
		//lo.add("neha");
		li.remove(0);
		//li.remove("Neha");
		li.clear();
		
		
		//Enhanched For loop
		for (Object temp : li) {
            System.out.println(temp);
        }
		
		
		//traditional for loop		
		for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
		
		
		
		
	}

}
