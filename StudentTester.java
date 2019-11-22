package Week_3;

import java.util.Scanner;

public class StudentTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student student1 = new Student();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Rutgers Student Financial Account.");
		System.out.print("\n Enter name: ");
		String name = in.nextLine();
		System.out.print("\n Enter ID#: ");
		int iD = in.nextInt();
		
		
		Student student3 = new Student();
		
		
		student3.setName(name);
		student3.setStudentID(iD);
		System.out.println();
		System.out.println("Student Name: " + student3.getName());
		System.out.println("StudentID: " + student3.getStudentID());
		System.out.println();
		
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
		/*
		int id2 = student2.getStudentID();
		String name2 = student2.getName();
		System.out.println("ID 2: " + id2);
		System.out.println("Name 2: " + name2);
		*/
	}
}
