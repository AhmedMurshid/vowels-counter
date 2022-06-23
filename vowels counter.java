package assignment_03.Proj_6_09;

import java.util.Scanner;

public class VowelsCounter {

	public static void main(String[] args) {
		int acount = 0, ecount = 0, icount = 0, ocount = 0, ucount = 0;
		int other = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string of characters:");
		String str = scan.nextLine();

		for (int index = 0; index < str.length(); index++) {
			switch (str.charAt(index)) {
			case 'a':
				acount++;
				break;
			case 'e':
				ecount++;
				break;
			case 'i':
				icount++;
				break;
			case 'o':
				ocount++;
				break;
			case 'u':
				ucount++;
				break;
			default:
				other++;
			}
		}

		System.out.println();
		System.out.println("Number of each lowercase vowel in the string:");
		System.out.println("a: " + acount);
		System.out.println("e: " + ecount);
		System.out.println("i: " + icount);
		System.out.println("o: " + ocount);
		System.out.println("u: " + ucount);
		System.out.println("other characters: " + other);

		scan.close();
	}
}
