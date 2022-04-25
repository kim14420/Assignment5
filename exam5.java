package exam5;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("자연수를 입력하시오.");
		int num = in.nextInt();
		
		System.out.println();
		
		for (int y = 0; y < num; y++) {
			for (int z = 0; z < y; z++) {
				System.out.print(" ");
			}
			for (int x = (num*2-1); x > (y*2); x--) {
				System.out.print("*");
			}
			System.out.println();}
		
		
		
		in.close();
		
	}

}
