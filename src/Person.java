
public class Person {

	 private String gender;
	 private String name;
	 private int age;

	 public Person(String gender, String name, int age){
	    this.gender = gender;
	    this.setName(name);
	    this.age = age;
	}

	public String getGender() {
	    return gender;
	}

	public void setGender(String gender) {
	    this.gender = gender;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getName() {
	    return name;
	}

	public int getAge() {
	    return age;
	}

	public void setAge(int age) {
	    this.age = age;
	}

	public String toString(){
	    return this.gender + " " + this.name + " " + this.age;
	}

}

