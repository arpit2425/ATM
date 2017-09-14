import java.util.Scanner;
class ATm
{

    public static Scanner kbd;

    public static void main(String as[])throws Exception

    {
        String a[]=new String[100];
        String b[]=new String[100];
        double w[]=new double [100];//to store record of amount withdraw
        double d[]=new double [100];//to store record of amount deposit
        double f[]=new double [100];//to store record of amount withdraw

        int c=0;
        checkId ob1=new checkId();
        cal o1=new cal();
        ca o2=new ca();
        men ob=new men();
        f obq=new f();
        aa qa=new aa();
        aa1 qa1=new aa1();
        Deposi ob2=new Deposi();
        fast ob5=new fast();
        n qw=new n();
        withdraal ob3=new withdraal();
        Displaybalanc ob4=new Displaybalanc();
        menu1 ob6=new menu1();
        String userAnswer=null;//declaring the String
        Scanner kbd=new Scanner(System.in);
        double accountbalance=0,deppositAmount=0,withdrawal=0;//declaring the variable accountbalance deppositAmount,withdrawal as double
        String accnum,pwd,acctres;//declaring the String
        int counter=0,choice;//to store how many time you have entered wrong entry 
        ob6.menu1();
        System.out.println();
        System.out.println();
        obq.aq();
        do
        {
            System.out.println("\t\t\tPlease enter your account number");
            System.out.print("\t\t\t");  
            accnum=kbd.nextLine();//getting the input

            System.out.println("\t\t\tPlease enter your account password");
            System.out.print("\t\t\t");
            pwd=kbd.nextLine();//getting the input
            System.out.println();
            System.out.println();   
            obq.aq();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            acctres=ob1.checkId(accnum,pwd);//initialing 
            if(!acctres.equals("error"))//checking for sitiuation of variable for error
            {
                accountbalance=Double.parseDouble(acctres);//to store Account Balance
                do//gives the do while loop the condition to repeat the statement
                { 
                    choice=ob.menu();//function invoking
                    if(choice==1)
                    {
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        qa.acca(accountbalance);
                    }// ends if
                    else if(choice==2)
                    {
                        System.out.println("                    How much would you want to deposit");
                        System.out.print("\t\t\t");  
                        d[c]=deppositAmount=kbd.nextDouble();//to store Deposit Amount
                        a[c]=o1.man();
                        System.out.println();
                        b[c]=o2.man();
                        c++;
                        double calculatbalance=ob2.Deposit(accountbalance,deppositAmount);
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        qa.acca(calculatbalance);
                        accountbalance=ob4.Displaybalance(calculatbalance);
                    }// ends else if
                    else if(choice==3)
                    {
                        System.out.println("\t\t How much would you want to withdrawal");
                        System.out.print("\t\t\t");  
                        w[c]=withdrawal=kbd.nextDouble();//to store Withdraw Amount
                        qw.as(w[c]);
                        a[c]=o1.man();
                        System.out.println();
                        b[c]=o2.man();
                        double calculatbalance1=ob3.withdrawal(accountbalance,withdrawal);//to store amount after withdrawing Amount
                        qa.acca(calculatbalance1);
                        accountbalance=ob4.Displaybalance(calculatbalance1);
                        c++;
                    }// ends else if
                    else if(choice==4)
                    {
                        double calculatbalance1=ob5.fastcash(accountbalance);
                        qa.acca(calculatbalance1);
                        a[c]=o1.man();
                        System.out.println();
                        b[c]=o2.man();
                        f[c]=accountbalance-calculatbalance1;
                        c++;
                        accountbalance=ob4.Displaybalance(calculatbalance1);
                    }
                    else if(choice==5)
                    {
                        System.out.println("*********************************************************************************************************************************************");
                        System.out.println();
                        System.out.println();
                        System.out.println("                                                PUNJAB NATIONAL BANK");
                        System.out.println();
                        System.out.println();
                        System.out.println("                                                MINI STATEMENT");
                        System.out.println();
                        System.out.println();
                        System.out.println("                    CARD NUMBER:4561*********893" );
                        System.out.println();
                        System.out.println();
                        qw.as(w[c]);
                        System.out.println();
                        System.out.println("Date           Time           Transaction          Amount");
                        for(int i=0;i<c;i++)
                        {

                            System.out.print(b[i]+"       "+a[i]+"        ");
                            if(d[i]!=0)
                                System.out.print("Deposit Amount        Rs"+d[i]);
                            if(f[i]!=0)
                                System.out.print("Withdrawal Amount      Rs"+f[i]);                                                                                                                                                                                       
                            else if(w[i]!=0)
                                System.out.print("Withdrawal Amount      Rs"+w[i]);
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("                    TXN NO:760");
                        System.out.println();
                        System.out.println("                    BALANCE INQIURY  SAVINGS");
                        System.out.println();
                        System.out.println();
                        System.out.println("                                              HAVE A NICE DAY !");
                        System.out.println();
                        System.out.println("*********************************************************************************************************************************************");

                    }// ends else if
                    else if(choice==6)
                    {
                        System.out.println("\t\t do you want to Log out(y or n)");
                        System.out.print("\t\t\t");  
                        userAnswer=kbd.next();
                        userAnswer=userAnswer.toUpperCase();
                        if(userAnswer.equals("Y"))//checking the sitution if Y it means yes
                        {
                            System.out.println("\t\t You are now loged out ");
                            System.out.println("\t\t           ################## THANK YOU VISIT AGAIN##########");
                            System.exit(0);
                        }
                    }// ends else if
                }while((choice<=6));// checking input n
            }// ends if
            else//checking for other input except the ones that are already metioned
            {
                System.out.println("\t\t Wrong password ! enter again");
                counter++;
            }// ends else 
        }while(counter<3);//checking for a counter to be less than 3
        if(counter>=3)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("\t\tYou Have Exceeded Maximum Number of times");
            System.out.println("\t\tYou are now loged out ");
            System.out.println("                   ################## THANK YOU VISIT AGAIN##########");
        }// ends if

    }// ends main
}// ends class

