package Week_3;

import java.util.Scanner;

public class StudentTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student student1 = new Student();
		Student student2 = new Student("Alex Alvero", 180005066);
		Student student3 = new Student();
		/*
		int id = student1.getStudentID();
		String name = student1.getName();
		System.out.println("ID 1: " + id);
		System.out.println("Name 1: " + name);
		 */
		student3.setName("Youssef Saleh");
		student3.setStudentID(180007048);
		System.out.println("Student Name: " + student3.getName());
		System.out.println("StudentID: " + student3.getStudentID());
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Would you like to check balance or deposit money? (please type \"balance\" or \"deposit\", and press enter): ");
		boolean checker = false;
		do {
			String ans = in.nextLine();
		
			if (ans.equals("deposit")) {
				System.out.print("Enter amount of money to deposit: ");
				double amount = in.nextDouble();
				student3.deposit(amount);
				System.out.print("Your balance is: $" + student3.getBalance());
				boolean checker3 = false;
				System.out.println();
				System.out.print("To get back to the previous menu type \"prev\", and to exit type \"exit\": ");
				while (checker3==false) {
					String choose2 = in.nextLine();
					if (choose2.equals("prev")) {
						checker3 = true;
						checker=false;
						System.out.print("Would you like to check balance or deposit money? (please type \"balance\" or \"deposit\", and press enter: ");
					} else if (choose2.equals("exit")) {
						checker3 = true;
						checker = true;
					} else {
						checker3 = false;
					} 
				} 				
			} else if (ans.equals("balance")) {
				System.out.println("Your balance is: $" + student3.getBalance());
				boolean checker2 = false;
				do {
					System.out.println();
					System.out.print("To get back to the previous menu type \"prev\", and to exit type \"exit\": ");
					String choose = in.nextLine();
					if (choose.equals("prev")) {
						checker2 = true;
						checker=false;
						System.out.print("Would you like to check balance or deposit money? (please type \"balance\" or \"deposit\", and press enter): ");
					} else if (choose.equals("exit")) {
						checker2 = true;
						checker = true;
					} else {
						checker2 = false;
					} 
				} while (checker2==false);

			} else {
				System.out.print("Error. please type \"balance\" or \"deposit\", and press enter: ");
				checker=false;
			} 
		} while (checker==false);
		
		System.out.println("Thank you for using our system!");

	}
	
	public static int inputStudentID() { //return non-negative number
		 int studentID = 0;
		 System.out.println("Please enter the student ID");
		 Scanner scan = new Scanner(System.in);
		 try {
		     studentID = scan.nextInt();
		} catch (InputMismatchException e) {			
			System.out.println("Id must be a number");		
			inputStudentID();
		}		
		if (studentID < 0 ) {
			System.out.println("Id cannot be negative");		
			studentID = inputStudentID()();
		}
		 return studentID;
	 }
	
	public static int inputName() { //return non-negative number
		 String name = 0;
		 System.out.println("Please enter the name");
		 Scanner scan = new Scanner(System.in);
		 name = scan.nextLine();
		 if (!isNumeric(name)) { //if valid
			 return name;		 	
		}else {
			System.out.println("Please enter a valid name");
			inputName();
		}
		 return studentID;
	 }

	
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
}
