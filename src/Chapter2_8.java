import java.util.Scanner;

public class Chapter2_8 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int [][]a=new int[2][2];
		for(int i=0;i<a.length;i++) {
			System.out.println(i+"��° ���� �Է��Ͻÿ�");
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		
		if(inRect(100,100,a[0][0],a[0][1],a[1][0],a[1][1]) ||  inRect(200,200,a[0][0],a[0][1],a[1][0],a[1][1])
				|| inRect(a[0][0],a[0][1],100,100,200,200) ||	inRect(a[1][0],a[1][1],100,100,200,200)) {
			System.out.println("�浹�Ѵ�.");
		}else {
			System.out.println("�浹���� �ʴ´�.");
		}
	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1&& x<=rectx2) && (y>=recty1&&y<=recty2))
			return true;
			else return false;
	}
}
