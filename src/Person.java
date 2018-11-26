import java.util.ArrayList;

public class Person {

	 
		private String name;
		private String age;
		private String job_title;
		
//Create ArrayList
	public static ArrayList<Person> peopleinfo = new ArrayList<Person>();
		
 //add methods now
	public String toString() {
		return "This person is called " + getName() + ", is "+ age + " years old and works as a "+ job_title+".";
	}
	// method to take person info when an entity of the object( so when a person is created)
	public Person(String age, String name, String job_title) {//no data type because it constructor and not returning nada
		this.name = name;
		this.age = age;
		this.job_title = job_title;
		peopleinfo.add(this);// you add whatever new instance you create into the peopleinfo arraylist.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	}
	
