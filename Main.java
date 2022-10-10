import java.util.*;

public class Main{
    public static void main(String[]args) {

        ArrayList<Person> person = new ArrayList<Person>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many person you will input:");
        int count = input.nextInt();

        try {

            if (count > 5) {
                boolean y;
                while (y = true) {
                    System.out.println("-----------------------------------");
                    System.out.println("Rerun its out of valid number:");
                    System.out.println("-----------------------------------");
                    System.out.println("wanna try again?");
                    String yes = input.next();
                    if (yes == "yes") {
                        y = true;
                        return;
                    } else {
                        y = false;
                        break;
                    }
                }

            } else {

                String choice;

                boolean t;

                while (t = true) {

                    System.out.println("A.Input:"); 
                    System.out.println("B.Display");
                    System.out.println("C.Exit");

                    System.out.println("Enter your choice:");

                    choice = input.next();

                    if (choice == "A") {
                        System.out.println("Name:");
                        String name = input.next();
                        System.out.println("Age:");
                        int age = input.nextInt();
                        person.add(new Person(name, age));
                    }

                    else if (choice == "B") {

                        System.out.println(person);

                    } else if (choice == "C") {
                        System.out.println("Thank you Goodbye!");
                     
                     
                                t = false;
                                break;
    
                        

                    } else if (choice != "A" || choice !="B" || choice !="C") {
                       
                        System.out.println("Be exact to the choices above when choosing an input!");
                        System.out.println("");
              
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
