package chapter5;

import java.util.Scanner;

public class Chapter5_9StackApp {
	public static void main(String[] args) {

		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String text;
		Chapter5_9StringStack stack = new Chapter5_9StringStack(size);
		while (true) {
			System.out.print("���ڿ��Է�>>");
			text = scanner.nextLine();
			if(text.equals("�׸�"))break;
			if (stack.capacity() > size) {	
				stack.push(text);
			} else {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");	
			}
			
		}
		
	}
}
