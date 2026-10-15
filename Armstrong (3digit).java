package demo;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    while(n > 0) {
    	int digit = n%10;
    	sum += digit*digit*digit;
    	n = n/10;
    }
    if(temp == sum) {
    	System.out.print("Armstrong number");
    }
    else {
    	System.out.print("Not Armstrong number");
    }
	}

}
