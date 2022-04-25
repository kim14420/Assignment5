package exam5;

import java.util.Scanner;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오.");
		int num = in.nextInt();
		int count = 1;
		int mul;

		
		if ((num > 0) && (num < 101)) {
			
			while (true) {
				
				mul = num * count;
				
				count++;
				
				if (mul > 100) {
					
					break;
				}
			
				if (mul % 10 == 0) {
					
					break;
				}
				
				System.out.print(mul + " ");
			}
	
			in.close();
		}
	}

}
