
package hashmap;

import java.util.*;
import static java.lang.System.*;

public class Hashmap {

    public static void main(String[] args) {

        Hashmap n = new Hashmap();
        n.program();
    }
    HashMap<String, Integer> list = new HashMap<String, Integer>();
    public void program() {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        out.println("A. Add number");
        out.println("B. Remove number");
        out.println("C. Display");
        out.println("D. Clear number");
        out.println("E. Exit");
        out.println("...........................................................");
        out.println("Choose letter above :");
        out.println("");
        char A, B, C, D, E;

        String choice = sc.nextLine();
        while (true) {

            if (null == choice) {
            } else {
                switch (choice) {
                    case "A" -> {
                        addEntry();
                        
                    }
                    case "B" -> {
                    deleteEntry();
                       
                    }
                    case "C" -> {
                        showList();
                        
                    }
                    case "D" -> {
                        deleteList();
                        
                    }
                    case "E" -> {
                        System.out.println("The Program Is Terminated");
                        return;
                    }
                }
            }
        }

    }

 

    public void addEntry() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        System.out.println("Add Entry/Word: ");
        String article = sc.next();

        System.out.println("Number: ");
        int number = sc.nextInt();
        list.put(article, number);
        System.out.println("Added: " + list);
        program();
    }

    public void showList() {
        Iterator<String> it = list.keySet().iterator();
        for (String key : list.keySet()) {
            System.out.println(key + ": " + list.get(key));
            System.out.println(list);
            
        }
        program();
    }

    public void deleteEntry() {
        System.out.println("Number of item you want to remove:");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        index = index--;
        int value = list.get(index);
        list.remove(value);
        program();
    }

    public void deleteList() {
        list.clear();
        program();
    }

}
