package exam5;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println();
			for (int j = 1; j <= y; j++) {
				System.out.print(j*i + " ");
				
			}
			
			
		}
		
		in.close();
		
	}

}
