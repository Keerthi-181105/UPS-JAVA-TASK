package demo;

import java.util.Scanner;

public class Eligibilitycheck {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter Your Attendance:");
	  int attendance = sc.nextInt();
	  System.out.print(attendance > 70 ? "Eligible For Exam" : "Not Eligible For Exam");

	}

}
