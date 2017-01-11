import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   try {
	            File f = new File("people.txt");
	            Scanner sc = new Scanner(f);

	            List<Person> people = new ArrayList<Person>();

	            while(sc.hasNextLine()){
	                String line = sc.nextLine();
	                String[] details = line.split(":");
	                String gender = details[0];
	                String name = details[1];
	                int age = Integer.parseInt(details[2]);
	                Person p = new Person(gender, name, age);
	                people.add(p);
	            }

	            for(Person p: people){
	                System.out.println(p.toString());
	            }

	        } catch (FileNotFoundException e) {         
	            e.printStackTrace();
	        }

	}

}
