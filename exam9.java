package exam5;

import java.util.Scanner;

public class exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		System.out.print("자연수를 입력하시오.");


		int num = sc.nextInt();


		System.out.println();

		if (num >= 1){
			int num2 = 1;

			for(int y = 1; y <=num; y++) {
				for (int x = 1; x <= num; x++) {
					System.out.print(num2 + " ");
					num2 +=2;
					if (num2 > 10) {
						num2 = 1;
					}
				}

				System.out.println();
			
				sc.close();
			}	
		}
	}

}
