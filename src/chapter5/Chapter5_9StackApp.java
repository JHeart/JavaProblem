package chapter5;

import java.util.Scanner;

public class Chapter5_9StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		int size = scanner.nextInt();
		
		Chapter5_9StringStack stack = new Chapter5_9StringStack(size);
		
		while(true) {
			System.out.print("���ڿ��Է�>> ");
			String text = scanner.next();
			if (text.equals("�׸�"))
				break;
			boolean res =stack.push(text);  
			if(res==false)	System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			
		}
		int len=stack.length();
		for (int i = 0; i <len ; i++) {
			System.out.print(stack.pop() + " ");
		}
		scanner.close();
	}
}
