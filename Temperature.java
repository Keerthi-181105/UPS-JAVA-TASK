package demo;
import java.util.Scanner;
public class temperature {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter Fahrenheit:");
    double f = sc.nextDouble();
    double c = (f - 32) * 5 / 9;
    System.out.println("Celsius:" + c);
    System.out.print("Enter Celsius:");
    double celsius = sc.nextDouble();
    double fahrenheit = (celsius * 9 / 5) + 32;
    System.out.println("Fahrenheit: " + fahrenheit);
    sc.close();
	
}
}
