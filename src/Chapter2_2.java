import java.util.Scanner;

/*
 * ScannerŬ������ �̿��Ͽ� 2�ڸ� ����(10~99����)�� �Է� �ް���� �ڸ��� 1�� �ڸ��� ������ �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * */
public class Chapter2_2 {
	public static void main(String[] args) {
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int input;
		input=scanner.nextInt();
		if(input/10==input-(input/10)*10) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else {
			System.out.println("NO! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
	}
}
