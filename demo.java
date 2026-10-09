package demo;
import java.util.Scanner;
public class demo {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter name");
	String a = sc.next();
	System.out.println("enter Age");
	int b = sc.nextInt(); 
	System.out.println("enter Regno");
	int c= sc.nextInt();
	System.out.println("enter Dept");
	String d = sc.next();
	System.out.println("enter city");
	String e = sc.next();
	System.out.println("My name is:" + (a));
	System.out.println("My Age is:" + (b));
	System.out.println("My Regno is:" + (c));
	System.out.println("My Dept is:" + (d));
	System.out.println("My city is:" + (e));
  sc.close();
  
}
}
