import java.util.Scanner;

/*
 * Scanner클래스를 이용하여 2자리 정수(10~99사이)를 입력 받고십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
 * */
public class Chapter2_2 {
	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int input;
		input=scanner.nextInt();
		if(input/10==input-(input/10)*10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("NO! 10의 자리와 1의 자리가 같지 않습니다.");
		}
	}
}
