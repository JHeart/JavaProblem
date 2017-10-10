import java.util.Scanner;

public class Chapter2_6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		int input=sc.nextInt();
		int array[]= new int[2];
		
		
		if(input>=10) {
		array[0]=input/10;
		array[1]=input%10;}
		else if(input<10) {
			array[0]=input;
		}
		
		
			if((array[0]==3||array[0]==6||array[0]==9)&&(array[1]==3||array[1]==6||array[1]==9))
			{
				System.out.println("¹Ú¼öÂ¦Â¦");
			}
			else if(array[0]==3||array[0]==6||array[0]==9) {
				System.out.println("¹Ú¼öÂ¦");
			}
			
		
		
	}
}
