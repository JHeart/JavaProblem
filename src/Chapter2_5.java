import java.util.Scanner;

/*
 * 
 * */

public class Chapter2_5 {
	public static void main(String[] args) {
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		int []a=new int[3];
		int temp;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		if(a[2]<a[0]+a[1]) {
			System.out.println("�ﰢ���̵˴ϴ�.");
		}else {
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		}
	}
}
