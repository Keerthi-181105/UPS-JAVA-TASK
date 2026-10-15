package demo;
import java.util.Scanner;
public class Armstrongbasedonpower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int temp = n ;
		int digit = String.valueOf(n).length();
		int sum = 0;
		while(n >  0) {
			int num = n%10;
			sum += (int)Math.pow(num, digit);
			n = n/10;
			
		}
		if(sum == temp) {
			System.out.print("Armstrong");
		}
		else {
			System.out.print("Not Armstrong");

		}
		
	}

}
