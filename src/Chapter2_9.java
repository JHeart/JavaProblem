import java.util.Scanner;

public class Chapter2_9 {
	public static void main(String[] args) {
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		Scanner sc = new Scanner(System.in);
		double x,y,r;
		x=sc.nextDouble();
		y=sc.nextDouble();
		r=sc.nextDouble();
		System.out.print("�� �Է�>>");
		double dotx,doty;
		dotx=sc.nextDouble();
		doty=sc.nextDouble();
		double distance=Math.sqrt(Math.exp(x-dotx)+Math.exp(y-doty));
		if(distance<r) {
			System.out.println("("+dotx+","+doty+")�� �� �ȿ� �ִ�.");
		}else {
			System.out.println("("+dotx+","+doty+")�� �� �ȿ� ����.");
		}
	}
}
