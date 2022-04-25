package exam5;

import java.util.Scanner;

public class exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("자연수를 입력하시오.");
		int num = sc.nextInt();
		int num2 = 1;
		
		System.out.println();


		for (int y = 0; y < num; y++) {
			for (int x = 0; x < y; x++) {
				System.out.print("  ");
			}
			for (int x = num; x > y; x--) {
				System.out.print(num2++ + " ");
			}
			
			System.out.println();}

		sc.close();

	}

}
