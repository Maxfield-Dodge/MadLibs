import java.util.Scanner;
/**
 * @Maxfield-Dodge
 * @9/16/22
 * @Creates a madlib based on user input
 */
public class Madlib
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //gathers information
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter the month in the form of XX: ");
        int month = input.nextInt();
        input.nextLine();
        System.out.println("Enter the day of the month in the form of XX: ");
        int day = input.nextInt();
        input.nextLine();
        System.out.println("Enter the year in the form of XX: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Enter an adjective: ");
        String adj1 = input.nextLine();
        System.out.println("Enter a verb: ");
        String verb1 = input.nextLine();
        System.out.println("Enter an adjective: ");
        String adj2 = input.nextLine();
        System.out.println("Enter a noun: ");
        String noun1 = input.nextLine();
        System.out.println("Enter a verb: ");
        String verb2 = input.nextLine();
        System.out.println("Enter an adjective: ");
        String adj3 = input.nextLine();
        System.out.println("Enter a noun: ");
        String noun2 = input.nextLine();
        System.out.println("Enter an adjective: ");
        String adj4 = input.nextLine();
        System.out.println("Enter an adjective: ");
        String adj5 = input.nextLine();
        System.out.println("Enter a noun: ");
        String noun3 = input.nextLine();
        System.out.println("Enter a noun: ");
        String noun4 = input.nextLine();
        
        //prints result
        System.out.println ("Our school cafeteria has really " + adj1 + "food. Just");
        System.out.println ("thinking about it make my stomach " + verb1 + ". The");

    }
}
