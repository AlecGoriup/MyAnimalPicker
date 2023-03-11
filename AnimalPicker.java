import java.util.Scanner;

public class AnimalPicker
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String animal;

        System.out.println("What animal would you like to see: dog or cat");
        animal = scan.nextLine();


        while (!animal.equals("dog") || !animal.equals("cat"))
        {
            if (animal.equals("dog"))
            {
                System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
                break;
            }

            else if (animal.equals("cat"))
            {
                System.out.println("      |\\      _,,,---,,_\nZZZzz /,`.-\'`\'    -.  ;-;;,_\n     |,4-  ) )-,_. ,\\ (  `\'-\'\n    \'---\'\'(_/--\'  `-\'\\_)");
                break;
            }

            else 
            {
                System.out.println("Please enter 'dog' or 'cat'");
                animal = scan.nextLine();
            }

        }

        

        
    }
}