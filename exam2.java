package exam5;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Number1: ");
		int num1 = sc.nextInt();
		System.out.print("Number2: ");
		int num2 = sc.nextInt();


		if (num1 >= num2) {
			for (int j = 1; j < 10; j++) {
				for (int i = num1; i >= num2; i--) {

					System.out.print(i + " X " + j + " = " + j*i + "   ");
				}
				System.out.println();
			}

		}

		if (num2 > num1) {
			for (int j = 1; j < 10; j++) {
				for (int i = num1; i <= num1; i++) {
					System.out.print(i + " X " + j + " = " + j*i + "   ");
				}
				System.out.println();
			}
		}
	
		sc.close();
	}




}



