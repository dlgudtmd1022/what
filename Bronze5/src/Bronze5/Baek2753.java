package Bronze5;

import java.util.Scanner;

public class Baek2753 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		scan.close();
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println(1);				
		} else if(year % 400 == 0) {
		System.out.println(1);		
			}else System.out.println(0);
}
}