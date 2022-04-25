package exam5;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int hol = 1;
		int count = 0;
		int plus = 0;

		while (true) {


			plus += hol;

			hol += 2;

			count++;

			if (plus >= num) {

				break;
			}

			
		}


		System.out.println(count + " " + num);

		in.close();
	}





}


