package exam5;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오.");
		int num = in.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		in.close();
	}

}
