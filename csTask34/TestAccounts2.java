import java.util.Scanner;
public class TestAccounts2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the names of three people.");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String name3 = scan.nextLine();
        Account acct1 = new Account(100, name1);
        Account acct2 = new Account(100, name2);
        Account acct3 = new Account(100, name3);
        acct1.close();
        System.out.println(acct1.toString());
        System.out.println(Account.consolidate(acct2, acct3).toString());
    }
}