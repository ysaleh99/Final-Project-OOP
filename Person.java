package Week_3;

import java.util.ArrayList;

abstract public class Person {

	
	private String name;
	private String gender;
	private int age;
	
	/**
	 * Constructs a person with empty name and gender and age.
	 */
	public Person() {
		name = "";
		gender= "";
	}
	
	public Person(String n, String g) {
		name = n;
		gender= g;
	}
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		name = this.name;
	}
	public void setGender(String gender) {
		gender = this.gender;
	}
	public void setAge(int age) {
		age = this.age;
	}
	abstract ArrayList<String> getPeople();
}
