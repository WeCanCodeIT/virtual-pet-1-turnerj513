import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        VirtualPet pet = new VirtualPet("Jimmer");
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Pet Game!");
        System.out.println("Your pet, " + pet.getName() + ", is ready to play.\n");

        while (true) {
            System.out.println("Pet's status:");
            displayPetStatus(pet);

            System.out.println("What would you like to do next?");
            System.out.println("1. Feed the pet");
            System.out.println("2. Give water to the pet");
            System.out.println("3. Play with the pet");
            System.out.println("4. Quit");

            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.water();
                    break;
                case 3:
                    pet.play();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    input.close(); 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            pet.tick();
        }
    }

    private static void displayPetStatus(VirtualPet pet) {
        System.out.println("Name: " + pet.getName());
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Thirst: " + pet.getThirst());
        System.out.println("Boredom: " + pet.getBoredom());
        System.out.println();
    }
}