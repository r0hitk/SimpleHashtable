package simpleHashtable;

public class MainClass {

	public static void main(String[] args) {
		
		Person one = new Person(26, "Rohan", "Patna");
		Person two = new Person(21, "Abhijeet", "Kolkata");
		Person three = new Person(22, "Ankita", "Bangalore");
		Person four = new Person(24, "Richa", "Ranchi");
		
		SimpleHashtable ht = new SimpleHashtable(10);
		
		ht.put("Rohan", one);
		ht.put("Abhijeet", two);
		ht.put("Ankita", three);
		ht.put("Richa", four);
		
		System.out.println();
		
		ht.printHashTable();
		
		System.out.println(ht.get("Richa"));
		System.out.println(ht.get("Ankita"));
		
		
	}

}
