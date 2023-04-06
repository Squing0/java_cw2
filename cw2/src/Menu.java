import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an animal:");
            System.out.println("1. Bunny");
            System.out.println("2. Hamster");
            System.out.println("3. Cat");
            System.out.println("4. Fish");
            System.out.println("5. Dog");
            System.out.println("6. Parrot");

            System.out.print("Animal: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            Animal animal;
            
            if (choice == 0) {
            	break;
            }

            switch (choice) {
                case 1:
                    animal = new Bunny();
                    break;
                case 2:
                    animal = new Hamster();
                    break;
                case 3:
                    animal = new Cat();
                    break;
                case 4:
                    animal = new Fish();
                    break;
                case 5:
                    animal = new Dog();
                    break;
                case 6:
                    animal = new Parrot();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;
            }

            System.out.print("Enter a name for your " + animal.getSpecies() + ": ");
            String name = scanner.nextLine();
            animal.setName(name);

            Start_up start_up = new Start_up(name, animal.getSpecies());
            animal.setStart_up(start_up);

            while (true) {
                System.out.println("Choose an action:");
                System.out.println("1. Sleep");
                System.out.println("2. Eat");
                System.out.println("3. Communicate");
                System.out.println("4. Play");
                System.out.println("5. Display stats");
                System.out.println("0. Back to animal selection");

                choice = scanner.nextInt();
                scanner.nextLine();
                
                if (choice == 0) {
                	break;
                }

                switch (choice) {
                    case 1:
                        animal.sleep();
                        break;
                    case 2:
                        animal.eat();
                        break;
                    case 3:
                        animal.communicate();
                        break;
                    case 4:
                        animal.play();
                        break;
                    case 5:
                        animal.displayStats();
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                        continue;
                }

                if (animal.getHunger() >= 100) {
                    System.out.println(animal.getName() + " has starved to death!");
                    System.out.println("Do you want to continue?\n If so then please enter either 1 or 2");
                    int decision = scanner.nextInt();
                    if(decision == 1) {
                    	break;
                    }
                    else if (decision == 2){ // Made it so that user have the option for whether they want to continue or not.
                    	System.exit(0);
                    }
                } else if (animal.getHunger() >= 80) {
                    System.out.println(animal.getName() + " is very hungry.");
                } else if (animal.getHunger() >= 50) {
                    System.out.println(animal.getName() + " is hungry.");
                }

                if (animal.getEnergy() <= 0) {
                    System.out.println(animal.getName() + " has died from exhaustion!");
                    break;
                } else if (animal.getEnergy() <= 20) {
                    System.out.println(animal.getName() + " is very tired.");
                } else if (animal.getEnergy() <= 50) {
                    System.out.println(animal.getName() + " is tired.");
                }

                if (animal.getHappiness() >= 100) {
                    System.out.println(animal.getName() + " is extremely happy!");
                } else if (animal.getHappiness() >= 80) {
                    System.out.println(animal.getName() + " is very happy.");
                } else if (animal.getHappiness() >= 50) {
                    System.out.println(animal.getName() + " is happy.");
                }

                System.out.println();
            }
        }
    }
}
