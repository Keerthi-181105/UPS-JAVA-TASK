package demo;

import java.util.Scanner;

public class operation {
   public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter a:");
	   System.out.println("enter b:");
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   int add = a+b;
	   int sub = a-b;
	   int mul = a*b;
	   int div =a/b;
	   System.out.println("Addition:"+add);
	   System.out.println("Subtraction:"+sub);
	   System.out.println("Multiplication:"+mul);
	   System.out.println("Divison:"+div);
	   sc.close();
   }
}
