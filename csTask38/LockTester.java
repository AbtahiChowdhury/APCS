import java.util.*;
public class LockTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the first number of your lock.");
        int x = scan.nextInt();
        System.out.println("Give me the second number of your lock.");
        int y = scan.nextInt();
        System.out.println("Give me the third number of your lock.");
        int z = scan.nextInt();
        Lock lock = new Lock(x, y, z);
        System.out.println("Your lock was created.");
        System.out.println("How much to the right do I go?");
        int c = scan.nextInt();
        lock.turnRight(c);
        System.out.println("How much to the left do I go?");
        int v = scan.nextInt();
        lock.turnLeft(v);
        System.out.println("How much to the right do I go?");
        int b = scan.nextInt();
        lock.turnRight(b);
        lock.open();
    }
}
