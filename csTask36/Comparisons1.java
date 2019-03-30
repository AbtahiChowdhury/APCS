
/**
 * Write a description of class Comparisons1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comparisons1
{
    public static void main (String[] args)
    {
        Monster monster1 = new Monster("Fatalis", 9, "Fire");
        Monster monster2 = new Monster("Tamamitsune", 8, "Thunder");
        Monster monster3 = new Monster("Amatsumagatsuchi", 10, "Fire");
        
        System.out.println(monster1.compareTo(monster2));
        System.out.println(monster1.compareTo(monster3));
        System.out.println(monster2.compareTo(monster3));
        System.out.println("The scariest monster is: " + Compare3.largest(monster1, monster2, monster3));
    }
}
