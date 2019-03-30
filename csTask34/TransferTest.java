import java.util.Scanner;
public class TransferTest
{
    public static void main(String[] args)
    {
        boolean go = true;
        int x = 0;
        int amount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the name of two people.");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        Account acct1 = new Account(100, name1);
        Account acct2 = new Account(100, name2);
        while(go == true)
        {
            System.out.println("What would you like to do?");
            System.out.println("1 = Transfer from account 1 to 2");
            System.out.println("2 = Transfer from account 1 to 2");
            System.out.println("3 = Quit");
            x = scan.nextInt();
            if (x == 1)
            {
                System.out.println("How much do want to transfer?");
                amount = scan.nextInt();
                acct1.transfer(acct2, amount);
            }
            else if (x == 2)
            {
                System.out.println("How much do want to transfer?");
                amount = scan.nextInt();
                Account.transfer(acct2, acct1, amount);
            }
            else if (x == 3)
            {
                go = false;
            }
            else
            {
                System.out.println("Not a valid option");
            }
        }
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
    }
}
