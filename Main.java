import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner myObj = new Scanner(System.in);
        List <String> anapi = new ArrayList <String>();

        person <String> my = new person <String>();
        my.setName("Anapi Vallega");
        my.setWord("Hello!");
        my.setColor("Black");

        anapi.add(my.getWord() + " My name is " + my.getName() + " my favorite color is " + my.getColor());


        person <String> my1 = new person <String>();
        my1.setName("Analou Vallega");
        my1.setWord("Hello!");
        my1.setColor("Red");

        anapi.add(my1.getWord() + " My name is " + my1.getName() + " my favorite color is " + my1.getColor());



        person <String> my2 = new person <String>();
        my2.setName("Josepito Vallega");
        my2.setWord("Hello!");
        my2.setColor("Blue");

        anapi.add(my2.getWord() + " My name is " + my2.getName() + " my favorite color is " + my2.getColor());




        person <String> my3 = new person <String>();
        my3.setName("Aine Joy Vallega");
        my3.setWord("Hello!");
        my3.setColor("Purple");

        anapi.add(my3.getWord() + " My name is " + my3.getName() + " my favorite color is " + my3.getColor());

        
        System.out.print("Enter an index :");
        int num = myObj.nextInt ();
        try{
            if (num < 0){
               myObj.close();
               throw new personException(" Error please input valid index ");
            }
            if (num > 4){
                myObj.close();
                throw new personException(" Error your given number is out of bound ");
            }
            System.out.println(" Index number:" + num);
            System.out.println(anapi.get(num));

        } catch(personException e) {
            System.out.print(e.getMessage());
        }
        myObj.close();

    }
}