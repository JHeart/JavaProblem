package chapter5;

import java.util.Scanner;

public class Chapter5_9StackApp {
	public static void main(String[] args) {

		System.out.print("총 스택 저장 공간의 크기 입력>>");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String text;
		Chapter5_9StringStack stack = new Chapter5_9StringStack(size);
		while (true) {
			System.out.print("문자열입력>>");
			text = scanner.nextLine();
			if(text.equals("그만"))break;
			if (stack.capacity() > size) {	
				stack.push(text);
			} else {
				System.out.println("스택이 꽉 차서 푸시 불가!");	
			}
			
		}
		
	}
}
