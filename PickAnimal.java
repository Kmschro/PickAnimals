import java.util.Scanner;
public class PickAnimal {

	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 1 to see a dog image, 2 to see a cat image, 3 to see a fish image:");
        int animal = inp.nextInt();

        if (animal == 1 )
        {
            System.out.println("DOG ASCII ART HERE");
            System.out.println("           __\n      (___()\'`;\n      /,    /`\n      \\\\\"--\\\\");
        }
        else if (animal == 2)
        {
            System.out.println("CAT ASCII ART HERE");
            System.out.println("   |\\__/,|   (`\\\n   |o o  |__ _)\n _.( T   )  `  /\n((_ `^--\' /_<  \\\n`` `-\'(((/  (((/");
        }
        else 
        {
            while(animal != 1 || animal != 2) {
                System.out.println("Error, invalid input, enter 1 for a dog image, or 2 for a cat image ");
                animal = inp.nextInt();
                if (animal == 1 ) {
                    System.out.println("DOG ASCII ART HERE");
                    System.out.println("           __\n      (___()\'`;\n      /,    /`\n      \\\\\"--\\\\");
                    break;
                }
                else if (animal == 2) {
                    System.out.println("CAT ASCII ART HERE");
                    System.out.println("   |\\__/,|   (`\\\n   |o o  |__ _)\n _.( T   )  `  /\n((_ `^--\' /_<  \\\n`` `-\'(((/  (((/");
                    break;
                }
            }
        }
    }
}