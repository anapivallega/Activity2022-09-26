
import java.util.*;


public class HASHSET {

    static Scanner input = new Scanner(System.in);

    static HashSet<Integer> set = new HashSet<Integer>();

    public static void main(String[] args) throws InterruptedException{

        select();

    }




    public static void select() throws InterruptedException {

        while (true) {

            System.out.println("""

                    SELECT FROM THE FOLLOWING CHOICES:

                    A. Add number

                    B. Remove number

                    C. Display number

                    D. Clear number

                    E. Exit

                    """);

            String choice = input.nextLine();

            Thread.sleep(1000);

            switch (choice) {

                case "A": case "a":

                    System.out.println("Add a number to the set: ");

                    add(input.nextInt());

                    Thread.sleep(1000);

                    break;

                case "B": case "b":

                    System.out.println("Input number you want to remove from the set: ");

                    remove(input.nextInt());

                    Thread.sleep(1000);

                    break;

                case "C": case "c":

                    display();

                    Thread.sleep(1000);

                    break;

                case "D": case "d":

                    clear();

                    Thread.sleep(1000);

                    break;

                case "E": case "e":

                    System.exit(0);

                    break;

                

                

                

            }

        }

    }




  

    public static void add(int num) throws InterruptedException{

        if(set.contains(num)){

            System.out.println("Number already exist");

            Thread.sleep(1000);

        } else{

            set.add(num);

            Thread.sleep(1000);

            System.out.println("You added " + num + ".");

        }

        

        

    }




    public static void remove(int num) throws InterruptedException {

        set.remove(num);

        Thread.sleep(1000);

        System.out.println("You removed " + num + ".");

    }




    public static void display()throws InterruptedException {

        System.out.println(set);

    }




    public static void clear() throws InterruptedException{

        set.clear();

        Thread.sleep(1000);

        System.out.println("CLEARED");

    }

}
