import java.util.*;
public class MatchMaker{
	
	public static void main(String[] args) throws Exception{
		ArrayList<Person> ladies = new ArrayList<Person>();
		Person p1 = new Person ("jill",1);
		Person p2 = new Person ("kate",2);
		ladies.add(p1);
		ladies.add(p2);
		
		ArrayList<Person> gentlemen = new ArrayList<Person>();
		Person p3 = new Person ("bob",1);
		Person p4 = new Person ("jack",1);
		gentlemen.add(p3);
		gentlemen.add(p4);
		
		HashMap<Person,Person> matches = MatchMaker.match(ladies,gentlemen);
		for (Person lady:matches.keySet()){
			System.out.println (lady + "-matched-to->" + matches.get(lady));
		}
	}

	//  Implement the missing method here


	// ********************************

}