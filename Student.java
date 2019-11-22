package final_project;

public class Student extends Person {
	private String name;
	private int student_id;
	private double balance;
	
	public Student() {
		name="";
		student_id=0;
		balance=0.0;
	}
	
	public Student(String name, int student_id) {
		this.name = name;
		this.student_id = student_id;
		balance = 0.0;
	}

	public int getStudentID() {
		return student_id;
	}

	public void setStudentID(int number) {
		this.student_id = number; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
	}
	
	public double getBalance() {
		return balance;
	}

}
