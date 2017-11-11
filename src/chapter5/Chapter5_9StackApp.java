package chapter5;

import java.util.Scanner;

public class Chapter5_9StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		int size = scanner.nextInt();
		
		Chapter5_9StringStack stack = new Chapter5_9StringStack(size);
		
		while(true) {
			System.out.print("문자열입력>> ");
			String text = scanner.next();
			if (text.equals("그만"))
				break;
			boolean res =stack.push(text);  
			if(res==false)	System.out.println("스택이 꽉 차서 푸시 불가!");
			
		}
		int len=stack.length();
		for (int i = 0; i <len ; i++) {
			System.out.print(stack.pop() + " ");
		}
		scanner.close();
	}
}
