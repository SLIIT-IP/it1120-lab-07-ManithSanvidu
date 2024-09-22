import java.util.Scanner;
public class  IT24101458Lab7Q1A{
	public static void main(String[]args){
		Scanner a=new Scanner(System.in);

		double Average=0;
		int m1,m2,m3,m4;
		
		System.out.println("Enter marks for four subjects:");

		System.out.print("Enter Subject Mark 1:");
		m1=a.nextInt();

		System.out.print("Enter Subject Mark 2:");
		m2=a.nextInt();

		System.out.print("Enter Subject Mark 3:");
		m3=a.nextInt();

		System.out.print("Enter Subject Mark 4:");
		m4=a.nextInt();

		Average=(m1+m2+m3+m4)/4.0;

		System.out.println("Average is:"+Average);

		if(Average>=75 && Average<=100){
			System.out.println("Overall Grade is:Distinction");
		}else if(Average>=50 && Average<=74){
			System.out.println("Overall Grade is:Credit");
		}else if(Average>=0 && Average<=49){
			System.out.println("Overall Grade is:Fail");
		}else{
			System.out.println("Invalid Mark!");
		}
		
		a.close();
	}
}
		

		

		