package Java_Program;

import java.util.Scanner;

public class String_Reverse_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String here:");
		String str = sc.nextLine();
		System.out.println("Enter the Integer here:");
		int val = sc.nextInt();
		sc.close();
		
		System.out.println("Actual String:" +str);
		String rev = "";
		for(int i=str.length()-1; i >= 0; i--) {
			rev  =  rev + str.charAt(i);
			
		}
		System.out.println("Reversed String:" +rev+val);
	}

}
