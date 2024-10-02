import java.util.Scanner;
public class IT24101458Lab7Q3{
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);

        char mode;
        double Amount,amounttopay,Discount=0;


        for(int i=1;i<=5;i++){
            System.out.println("Customer"+i);

            System.out.print("Enter total bill amount:");
            Amount=a.nextDouble();

            System.out.println("Enter mode of payment(C for cash,O for other):");
            mode=Character.toUpperCase(a.next().charAt(0));

            if(mode=='C'){
                Discount=Amount*0.05;  
		System.out.println("Discount is:"+Discount);
            }else if(mode=='O'){
		Discount=0;
                System.out.println("No Discount applicable");
            }else{
		Discount=0;
                System.out.println("Payment is not valid");
            }

            amounttopay=Amount-Discount;

            System.out.println("Amount to be paid:"+amounttopay);

        }




        a.close();



    }

}