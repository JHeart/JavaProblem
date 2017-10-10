import java.util.Scanner;

public class Chapter2_8 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int [][]a=new int[2][2];
		for(int i=0;i<a.length;i++) {
			System.out.println(i+"번째 점을 입력하시오");
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		
		if(inRect(100,100,a[0][0],a[0][1],a[1][0],a[1][1]) ||  inRect(200,200,a[0][0],a[0][1],a[1][0],a[1][1])
				|| inRect(a[0][0],a[0][1],100,100,200,200) ||	inRect(a[1][0],a[1][1],100,100,200,200)) {
			System.out.println("충돌한다.");
		}else {
			System.out.println("충돌하지 않는다.");
		}
	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1&& x<=rectx2) && (y>=recty1&&y<=recty2))
			return true;
			else return false;
	}
}
