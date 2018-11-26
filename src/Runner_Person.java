//import java.util.ArrayList;


public class Runner_Person {

	public static void main(String[] args) {
		
		//1st, create people entities with attributes that the class is expecting:

		Person P1 = new Person("18","Jose","SoftDev");
		Person P2 = new Person("20","Kiki","Cleaner");
		
		
		//print results using the tostring method
		//System.out.println(P1.toString()) ;
		//System.out.println(P2.toString()) ; //no longer needed
		
		
		//add to arraylist
//		Person.peopleinfo.add(P1); //no longer needed as its incorporated in person class
//		Person.peopleinfo.add(P2);
		
		//using for loop to output people:
		
		for(Person person:Person.peopleinfo) {// Person = data type, person: ref var (placeholder), 
			System.out.println(person);// person.name if u onl want name
		}

		// no need for static methods
		Runner_Person l = new Runner_Person();// you do this to create an instance of search within the main so that static is not reqd
		System.out.println(l.search("Jose"));

	}
//Creating method 
	public String search(String filtername) {
		for(Person person:Person.peopleinfo) {
			if(person.getName().equals(filtername)) {
				return person.toString();
			}
		} 
		return null;//in case the if and for loops does not return what you are expecting
	}
	
}
