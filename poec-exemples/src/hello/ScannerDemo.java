package hello;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String line;
//		line = sc.nextLine();
//		
//		System.out.println(line);
//		
//		int i = sc.nextInt();
//		System.out.println(i);
		
		for(;;) {
			String line = sc.nextLine();
			System.out.println(line);
			if (line.equals("quit")) {
				break;
			}
			System.out.println(line);
		}
	}

}
