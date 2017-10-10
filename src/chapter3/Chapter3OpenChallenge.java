package chapter3;

import java.util.Scanner;

public class Chapter3OpenChallenge {
	public static void main(String[] args) {
		int random_number= (int) Math.random()*99;
		int min;
		System.out.println("수를 결정하였습니다. 맞추어보세요");
		System.out.println("0-99");
		
		while(true) {
			System.out.print("1>>");
			Scanner sc= new Scanner(System.in);
			int input=sc.nextInt();
			
			if(input<random_number) {
				System.out.println("더 높게");
				System.out.println(input+"-99");
			}else if(input>random_number) {
				min=input;
				System.out.println("더 낮게");
				System.out.println(min+"-"+input);
			}
		}
		
	}
}
