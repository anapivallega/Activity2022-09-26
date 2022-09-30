import java.util.*;
class Arraynum{
    private int num;

    
    Arraynum(int num){
        this.num = num;

        
    }
    public int getNum(){
        return num;
    }

    public String toString(){
        return num+" ";
    }
     
}
class ARRAYLIST{
    public static void main(String[] args){
        
        List<Arraynum> alt = new ArrayList<Arraynum>();
        Scanner s = new Scanner(System.in);
        int option;
        do{
            System.out.println(" \n  ");
            System.out.println("   ARRAYLIST");
            System.out.print("\n   [1] Add Numbers \n   [2] Delete Numbers \n   [3] Display Numbers \n   [4] Clear \n   [5] Exit \n\n   Your Choice: ");
            option = s.nextInt();
            
            switch(option){
                case 1:
                    System.out.print("   Enter num: ");
                    int number = s.nextInt();
                    
                    if ((number >= 0) && (number <= 100)) 
                    {
                    System.out.print(" ");
                    
                    alt.add(new Arraynum(number));
                    }
                    else if (number <= 0) 
                    {
                        System.out.println("   Its Negative try input a Positive Number.");
                    }
                    else 
                    {
                        break;
                    }
                    
                break;
                
                case 3:
                    System.out.println("\n ");
                    System.out.println("   Display Number ");
                    Iterator<Arraynum> i = alt.iterator();
                    while(i.hasNext()){
                        Arraynum e =i.next();
                        System.out.println("   "+e);
                    }
                break;
                case 2:
                    boolean found = false;
                    System.out.println("\n ");
                    System.out.println("   "+alt);
                    System.out.print("   Choose number to delete: ");
                    int num = s.nextInt();
                    i = alt.iterator();
                    while(i.hasNext()){
                        Arraynum e = i.next();
                        if(e.getNum() == num) {
                            i.remove();
                            found = true;
                        }
                    }
                    
                    if(!found){
                        System.out.println("   Number Not Found");
                    }else{
                        System.out.println("   Number is deleted Sucessfully!");
                    }
                break;
                case 4:
                    System.out.println("\n ");
                    System.out.println("   All Numbers are Successfully Clear!!! ");
                    alt.clear();
                break;
                case 5:
                    
                    System.out.println("   GOODBYE!!! ");
                    System.exit(0);
                break;
                
                default:
                System.err.println("   Invalid option selected");
                System.exit(0);
            }
            
            
        }while(option!=0);
            
    }
}