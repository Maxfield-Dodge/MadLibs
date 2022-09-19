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
        System.out.println();
        System.out.println(name);
        System.out.println(month + "/" + day + "/" + year);
        System.out.println();
        System.out.println ("Our school cafeteria has really " + adj1 + " food. Just");
        System.out.println ("thinking about it makes my stomach " + verb1 + ". The");
        System.out.println("spaghetti is " + adj2 + " and tastes like " + noun1 + ". One");
        System.out.println("day, I swear one of my meatballs started to " + verb2 + "! The");
        System.out.println("turkey tacos are totally " + adj3 + " and look kind of like old");
        System.out.println(noun2 + ". My friend Dana actually likes the meatloaf, even");
        System.out.println("though it's " + adj4 + " and " + adj5 + ". I call it 'mystery");
        System.out.println("meatloaf' and think it's really made out of " + noun3 + ". My");
        System.out.println("dad said he'd make my lunches, but the first day, he made me");
        System.out.println("a sandwich out of " + noun4 + " and peanut butter! I think I'd");
        System.out.println("rather take my chances with the cafeteria!");
    }
}
