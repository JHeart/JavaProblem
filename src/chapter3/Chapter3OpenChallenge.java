package chapter3;

import java.util.Scanner;

public class Chapter3OpenChallenge {
	public static void main(String[] args) {
		int random_number= (int) Math.random()*99;
		int min;
		System.out.println("���� �����Ͽ����ϴ�. ���߾����");
		System.out.println("0-99");
		
		while(true) {
			System.out.print("1>>");
			Scanner sc= new Scanner(System.in);
			int input=sc.nextInt();
			
			if(input<random_number) {
				System.out.println("�� ����");
				System.out.println(input+"-99");
			}else if(input>random_number) {
				min=input;
				System.out.println("�� ����");
				System.out.println(min+"-"+input);
			}
		}
		
	}
}
