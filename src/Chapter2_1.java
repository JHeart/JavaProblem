/*
 * Scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է¹޾� �޷��� �ٲپ� ���� ���ÿ� ���� �ϴ� ���α׷��� �ۼ��϶� $1=1100������ �����ϰ� ����϶�
 * ��ȭ�� �Է��ϼ���(���� ��)>> 3300
 * 3300���� $3.0�Դϴ�.
 * */
import java.util.Scanner;

public class Chapter2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won=scanner.nextInt();
		double dollar=won/1100;
		System.out.println(won+"����$"+dollar+"�Դϴ�.");
	}
}
