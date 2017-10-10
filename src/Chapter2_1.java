/*
 * Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 하는 프로그램을 작성하라 $1=1100원으로 가정하고 계산하라
 * 원화를 입력하세요(단위 원)>> 3300
 * 3300원은 $3.0입니다.
 * */
import java.util.Scanner;

public class Chapter2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won=scanner.nextInt();
		double dollar=won/1100;
		System.out.println(won+"원은$"+dollar+"입니다.");
	}
}
