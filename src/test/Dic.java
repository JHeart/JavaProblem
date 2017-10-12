package test;

import java.util.Arrays;
import java.util.Scanner;

class App {
	private String text;

	public String getText() {
		return text;
	}

	public App(String text) {
		this.text = text;
	}

	void test() {
		char cp[] = text.toCharArray();
		Arrays.sort(cp);
		for (int i = 0; i < text.length(); i++)
			System.out.println(cp[i]);

	}

	void run() {
		// int size=text.length()*(text.length()-1);
		// int index=0;
		// App a[]=new App[size];

		// char temp[];
		for (int i = text.length() - 1; i == 1; i--) {
			for (int j = text.length() - 2; j == 0; j--) {
				if (text.charAt(i) > text.charAt(j)) {
							
				}
			}
		}
	}

}

public class Dic {

	public static void main(String[] args) {
		String text="dcba";
		App a= new App(text);
		a.test();
		/*int size;
		String text;
		Scanner scanner = new Scanner(System.in);
		System.out.print("input: ");
		size = scanner.nextInt();
		App[] a = new App[size];*/
		
		/*for (int i = 0; i < size; i++) {
			System.out.print("input");
			text = scanner.next();
			a[i] = new App(text);

		}
*/	}
}
