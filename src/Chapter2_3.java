import java.util.Scanner;

/*
 * ScannerŬ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¹޾� ���� ����.....1��¥�� �� ��� 	��ȯ�Ǵ� �� ����϶�.
 * 
 * */
public class Chapter2_3 {
	public static void main(String[] args) {
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		double input=scanner.nextDouble();
		
		int []a= {50000,10000,1000,100,50,10,1};
		int num[]=new int[7];
		
		for(int i=0;i<a.length;i++) {
	if(input>a[i]) {
		num[i]=(int)input/a[i];
		System.out.println(a[i]+"��"+num[i]);
		if(num[i]!=0)input-=num[i]*a[i]; 
	}
		}
	/*if( input>10000) {
		num[1]=(int)input/a[1];
		System.out.println("������"+num[1]);
		if(num[1]!=0)input-=num[1]*a[1];
	}
	if(input>1000) {
		num[2]=(int)input/a[2];
		System.out.println("õ����"+num[2]);
	}
	if(input>100) {
		num[3]=(int)input/a[3];
		System.out.println("���"+num[3]);
	}
	if(input>50) {
		num[4]=(int)input/a[4];
		System.out.println("���ʿ�"+num[4]);
	}
	if(input>10) {
		num[5]=(int)input/a[5];
		System.out.println("�ʿ�"+num[5]);
	}
	if(input>1) {
		num[6]=(int)input/a[6];
		System.out.println("�Ͽ�"+num[6]);	
	}*/
	
	
	
	
	}
}
