/**
 * A simple driver class that creates a Dog and makes it speak.
 * 
 * @author LLC
 * @version 02/22/2015
 */

public class DogTest
{
    public static void main(String[] args)
    {
        Yorkshire yorkshire1 = new Yorkshire("Marcin");
        System.out.println(yorkshire1.getName() + " says " + yorkshire1.speak());
        
        Labrador labrador1 = new Labrador("Jagannatha", "brown");
        System.out.println(labrador1.getName() + " says " + labrador1.speak());
    }
}