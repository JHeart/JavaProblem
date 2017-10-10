import java.util.Scanner;

/*
 * Scanner클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권.....1원짜리 각 몇개로 	변환되는 지 출력하라.
 * 
 * */
public class Chapter2_3 {
	public static void main(String[] args) {
		System.out.print("금액을 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		double input=scanner.nextDouble();
		
		int []a= {50000,10000,1000,100,50,10,1};
		int num[]=new int[7];
		
		for(int i=0;i<a.length;i++) {
	if(input>a[i]) {
		num[i]=(int)input/a[i];
		System.out.println(a[i]+"권"+num[i]);
		if(num[i]!=0)input-=num[i]*a[i]; 
	}
		}
	/*if( input>10000) {
		num[1]=(int)input/a[1];
		System.out.println("만원권"+num[1]);
		if(num[1]!=0)input-=num[1]*a[1];
	}
	if(input>1000) {
		num[2]=(int)input/a[2];
		System.out.println("천원권"+num[2]);
	}
	if(input>100) {
		num[3]=(int)input/a[3];
		System.out.println("백원"+num[3]);
	}
	if(input>50) {
		num[4]=(int)input/a[4];
		System.out.println("오십원"+num[4]);
	}
	if(input>10) {
		num[5]=(int)input/a[5];
		System.out.println("십원"+num[5]);
	}
	if(input>1) {
		num[6]=(int)input/a[6];
		System.out.println("일원"+num[6]);	
	}*/
	
	
	
	
	}
}
