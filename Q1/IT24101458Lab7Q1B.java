import java.util.Scanner;
public class  IT24101458Lab7Q1B{
public static void main(String[]args){
		Scanner a=new Scanner(System.in);

		for(int student=1;student<=3;student++){
		double Average=0;
		int m1,m2,m3,m4;
		
		System.out.println("Student "+student);

		System.out.print("Enter marks:");
		m1=a.nextInt();
		m2=a.nextInt();
		m3=a.nextInt();
		m4=a.nextInt();

		System.out.println("Enter marks:"+m1+" "+m2+" "+m3+" "+m4);

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
	
		System.out.println();

		}
		
		a.close();
	}
}
		

		
