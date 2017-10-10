import java.util.Scanner;

public class Chapter2_12 {
	public static void main(String[] args) {
		System.out.print("연산>>");
		
		Scanner sc = new Scanner(System.in);
		
		double parameter1,parameter2;
		String op;
		
		parameter1=sc.nextDouble();
		op=sc.next();
		parameter2=sc.nextDouble();
		
		if(op.equals("+")) {
			System.out.println(parameter1+op+parameter2+"의 계산결과는"+(parameter1+parameter2));
		}else if(op.equals("-")) {
			System.out.println(parameter1+op+parameter2+"의 계산결과는"+(parameter1-parameter2));
		}else if(op.equals("*")) {
			System.out.println(parameter1+op+parameter2+"의 계산결과는"+(parameter1*parameter2));
		}else if(op.equals("/")) {
			System.out.println(parameter1+op+parameter2+"의 계산결과는"+(parameter1/parameter2));
		}
	}
}	
