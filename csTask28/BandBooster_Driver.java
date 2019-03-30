
/**
 * Write a description of class BandBooster_Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BandBooster_Driver
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the names of two band boosters, seperated by an enter.");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        BandBooster bb1 = new BandBooster(s1);
        BandBooster bb2 = new BandBooster(s2);
        System.out.println("Enter the number of boxes sold by "+s1+" in week 1");
        int z = scan.nextInt();
        bb1.updateSales(z);
        System.out.println("Enter the number of boxes sold by "+s1+" in week 2");
        int x = scan.nextInt();
        bb1.updateSales(x);
        System.out.println("Enter the number of boxes sold by "+s1+" in week 3");
        int c = scan.nextInt();
        bb1.updateSales(c);
        System.out.println("Enter the number of boxes sold by "+s2+" in week 1");
        int v = scan.nextInt();
        bb2.updateSales(v);
        System.out.println("Enter the number of boxes sold by "+s2+" in week 2");
        int b = scan.nextInt();
        bb2.updateSales(b);
        System.out.println("Enter the number of boxes sold by "+s2+" in week 3");
        int n = scan.nextInt();
        bb2.updateSales(n);
        String a = bb1.toString();
        String s = bb2.toString();
        System.out.println(a);
        System.out.println(s);
    }
}
