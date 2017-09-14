import java.util.Scanner;
class men
{
    int menu()
    {
        int option;
        do//gives the do while loop condition to repeat statement
        {
            Scanner kbd1=new Scanner(System.in);
            System.out.println("\t\t\t 1. Balance Inqiuiry");
            System.out.println("\t\t\t 2. Deposit");
            System.out.println("\t\t\t 3. Withdrawl");
            System.out.println("\t\t\t 4. Fast Cash");
            System.out.println("\t\t\t 5. Mini Statement");
            System.out.println("\t\t\t 6. Logout");
            System.out.println("\t\t\t  $$$$$$$$$$$$$$$$$$$Enter your choice$$$$$$$$$$$$$$$$$$$");
            System.out.print("\t\t\t");  
            option=kbd1.nextInt();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            if(option<=0||option>6)
                System.out.println("Error choose again !");//checking for statement
        } 
        while(option<=0||option>6);
        return option;
    }
}
