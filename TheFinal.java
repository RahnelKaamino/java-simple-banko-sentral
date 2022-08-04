import java.util.Scanner;
public class TheFinal{
	public static void main(String []args){
	
	System.out.println("WELCOME TO BANGKO SENTRAL NG PILIPINAS");
		System.out.print("");		
		System.out.print("Enter your Pin Code: ");
		Scanner keyboard = new Scanner(System.in);
		int attemps = 0;
		int pin = 0;
		int correctpin = 123;
		while(pin != correctpin && attemps < 3)
        {
            pin  = keyboard.nextInt();
            attemps++;
            if (pin != correctpin && attemps < 3) { 
               System.out.println("PIN is Incorrect! Try Again!" ); 
            }
        }
        if (pin == correctpin && attemps <= 3) {  
            System.out.println("Acount Athunticated");  
        }
         else {
         	System.out.println("==================================================="); 
         	System.out.println("ACCOUNT DEACTIVATED | CONTACT BSP FOR REACTIVATION");
         	System.out.println("==================================================="); 
           System.exit(0);
        }

          int balance = 0, withdraw, deposit, send;
        Scanner a = new Scanner(System.in);
        while(true)
        {
            System.out.println("===================================");   
            System.out.println("BANGKO SENTRAL NG PILIPINAS");
            System.out.println("===================================");
            System.out.println("");
            System.out.println("Choose Operation to Perform Task:");
            System.out.println("Press [1] to Withdraw");
            System.out.println("Press [2] to Deposit");
            System.out.println("Press [3] to Send Money");
            System.out.println("Press [4] to Check Remaining Balance");
            System.out.println("Press [5] to Exit");
            int b = a.nextInt();
            switch(b)
            {
                case 1:
                System.out.println("Enter Amount to Withdraw: PHP ");
                withdraw = a.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("GET YOUR MONEY HERE");
                    System.out.println("");
                    System.out.println("===================================");
                    System.out.println("Your Current Balance is: PHP "+balance);
                }
                else
                {
                    System.out.println("Connot Withdraw | Insufficient Balance");
                }
                System.out.println("");
                break;

                case 2:
                System.out.println("Enter Amount to Deposit: PHP ");
                deposit = a.nextInt();
                balance = balance + deposit;
                System.out.println("");
                System.out.println("MONEY HAS BEEN DEPOSITED SUCCESSFULLY");
                System.out.println("");
                break;

                case 3:
                System.out.println("Enter Amount to Send Money: PHP ");
                send = a.nextInt();
                if(balance >= send)
                {
                    balance = balance - send;
                    System.out.println("MONEY HAS BEEN SENT SUCCESSFULLY");
                    System.out.println("===================================");
                    System.out.println("Your Current Balance is: PHP "+balance);
                }
                else
                {
                    System.out.println("Money Not Send | Insufficient Balance");
                }
                System.out.println("");

                case 4:
                {
                    System.out.println("===================================");
                    System.out.println("Your Current Balance is: PHP "+balance);
                }
                System.out.println("");
                break;

                case 5:
                System.exit(0);
            }
        }

	}
}