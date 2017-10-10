import java.util.Scanner;

public class Chapter2_9 {
	public static void main(String[] args) {
		System.out.print("원의 중심과 반지름 입력>>");
		Scanner sc = new Scanner(System.in);
		double x,y,r;
		x=sc.nextDouble();
		y=sc.nextDouble();
		r=sc.nextDouble();
		System.out.print("점 입력>>");
		double dotx,doty;
		dotx=sc.nextDouble();
		doty=sc.nextDouble();
		double distance=Math.sqrt(Math.exp(x-dotx)+Math.exp(y-doty));
		if(distance<r) {
			System.out.println("("+dotx+","+doty+")는 원 안에 있다.");
		}else {
			System.out.println("("+dotx+","+doty+")는 원 안에 없다.");
		}
	}
}
