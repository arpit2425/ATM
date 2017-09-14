import java.util.Scanner;
class menu1
{
    public void menu1()
    {
        int i=0;
        Scanner kbd2=new Scanner(System.in);
        System.out.println("\t\t \t?=============================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("       \t\t \t                                ###########          WELCOME TO PUNJAB NATIONAL BANK      ##########             ");
        System.out.println();
        System.out.println();
        System.out.println("\t\t \t===============================================================================================================================================?");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        do
        {

            System.out.println("                                                  1. CURRENT ACCOUNT  " );
            System.out.println("                                                  2. SAVING ACCOUNT  " );
            System.out.println();
            System.out.println("                                   PLEASE ENTER YOUR CHOICE");
            System.out.print("\t\t\t");
            int ch=kbd2.nextInt();
            if(ch==1||ch==2)
            {
                i=1;
            }
            else
            {
                System.out.println("\t\t Wrong Choice ! Enter Again ");
            }
            System.out.println();
        }while(i!=1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
