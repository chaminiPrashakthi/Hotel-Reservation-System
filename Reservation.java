
import java.util.*;

public class Reservation {

    public static void reservation(){
        ArrayList <String> al1 = new ArrayList<>();
        ArrayList <Double> al2 = new ArrayList<>();
        HashMap <Integer, Integer> hm= new HashMap<Integer, Integer>();
        Scanner sc= new Scanner(System.in);
        
        //al1.add(" ");
        al1.add("Room Id 1");
        al1.add("Room Id 2");
        al1.add("Room Id 3");
        al1.add("Room Id 4");
        
//        al2.add();
         al2.add(1000.50);
         al2.add(2000.50);
         al2.add(3000.50);
         al2.add(4000.50);
         
         System.out.println("Available rooms");
         System.out.println("-------------------------");
         
         for(int i=0;i<al1.size();i++){
             System.out.printf(al1.get(i)+" ");
             for(int j=0;j<al2.size();j++){
                 System.out.println("Rs."+al2.get(j));
                 break;
             }
         }
         System.out.println();
         System.out.println("Enter your choice of Order...");
         System.out.println("==========================================");
         
         while(true){
             int choice = sc.nextInt();
             System.out.println("Enter the number of rooms ?");
             int quantity = sc.nextInt();
             if(choice<al1.size()){
                 hm.put(choice, quantity);
             }else{
                 System.out.println("This room type is not available in the reservation.");
                 System.out.println("Sorry !!!!");
             }
             System.out.println("Want any other rooms ???");
             System.out.println("Press Y for that");
             String c= sc.next();
             char ch= c.charAt(0);
             if(ch=='y'||ch=='Y'){
		System.out.println("Enter your choice");
              }else{
                 double totalbill=0;
                 System.out.println("Preparing bil...........");
                 System.out.println("No more resefvation .......");
                 System.out.println("................");
                 System.out.println("................");
                 System.out.println();
                 System.out.println();
                 System.out.println("Ordering List");
                 int count=1;
                 for(Integer key:hm.keySet()){
                     System.out.println(count+ "."+al1.get(key)+": Rs."+al2.get(key)+"x"+hm.get(key));
                     totalbill+= al2.get(key)*hm.get(key);
                 }
                 System.out.println("-----------------------------");
                 System.out.println("Total bill");
                 System.out.println("Rs. "+totalbill);
                 System.out.println("Thankyou !!!");
                 
             }
             
         }
         
         
         
         
        
    }
    public static void main(String[] args) {
        reservation();
    }
    
}
