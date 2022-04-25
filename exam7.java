package exam5;

import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("자연수를 입력하시오.");
		int num = sc.nextInt();

		System.out.println();

		for (int y = 1; y <= num; y++) {
			
			for(int z = num; z > y; z--) {
			System.out.print(" ");
			}
			for(int z = 1; z <= y; z++) {
				System.out.print(z);
			}
			System.out.println(); }
	
	sc.close();
	}
}