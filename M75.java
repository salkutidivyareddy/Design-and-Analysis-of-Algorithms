/*5. Passengers can reserve their tickets in train. It has two First class A/C coaches
(B1, B2), two sleeper coaches(s1, s2) with capacity 70 each.
Prompt the user to enter the required berths and class(A/c or sleeper), allocate
berths randomly and display the Confirmed berths after booking.
Under following conditions throw an exception as “You may be an Agent” and
deny the request.
1. If the number of required berths are above 6.
2. If he/she is booking tickets by selecting different classes (A/c or sleeper).*/
import java.util.*;
class M75
{
   public static void main(String args[])
   {
     int B1[]= new int[70];
     int B2[]=new int[70];
     int s1[]=new int[70];
     int s2[]=new int[70];
     int i=0;
     System.out.println("Enter number of Tickets");
      Scanner sc=new Scanner(System.in);
     try{
     int t=sc.nextInt();
     if(t>6)
       throw new Exception("You may be an Agent deneid the request. ");
     
       
     System.out.println("Enter Class");
    // String b=sc.next();
     String c=sc.next();
     for(int k=0;k<70;k++)
       {
         B1[k]=0;
         B2[k]=0;
         s1[k]=0;
         s2[k]=0;
         }
       while(i<t){
         Random r=new Random();
         int id=r.nextInt(70);
         if(c.equals("A/c") && B1[i]!=1){
             i++;
             System.out.println("B1-"+id+"allocated");
             B1[id]=1;
           }
           if(c.equals("Sleeper") && s1[id]!=1)
             {
               i++;
             System.out.println("S1- "+id+" "+" allocated");
             s1[id]=1;
            }
     }
    }
     catch(Exception a)
     {
       System.out.println("Exception:"+ a.getMessage());
     }
}
}
   
     
     
/*
public class TrainTicketReservation {
    private static final List<String> firstClassCoaches = Arrays.asList("B1", "B2");
    private static final List<String> sleeperCoaches = Arrays.asList("S1", "S2");
    private static final int MAX_BERTHS = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Train Ticket Reservation System!");

        System.out.print("Enter the number of required berths: ");
        int numBerths = scanner.nextInt();

        System.out.print("Enter the class (A/C or sleeper): ");
        String ticketClass = scanner.next();

        try {
            allocateBerths(numBerths, ticketClass);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Booking denied. You may be an Agent.");
        }

        scanner.close();
    }

    private static void allocateBerths(int numBerths, String ticketClass) throws Exception {
        if (numBerths > MAX_BERTHS) {
            throw new Exception("Number of required berths exceeds the maximum limit of 6.");
        }

        if (ticketClass.equalsIgnoreCase("A/C") && numBerths > firstClassCoaches.size()) {
            throw new Exception("Number of required berths exceeds the available A/C coaches.");
        }

        if (ticketClass.equalsIgnoreCase("sleeper") && numBerths > sleeperCoaches.size() * 70) {
            throw new Exception("Number of required berths exceeds the available sleeper coaches.");
        }

        List<String> allocatedBerths = new ArrayList<>();

        if (ticketClass.equalsIgnoreCase("A/C")) {
            for (int i = 0; i < numBerths; i++) {
                String coach = firstClassCoaches.get(i % firstClassCoaches.size());
                allocatedBerths.add(coach + "-" + (i / firstClassCoaches.size() + 1));
            }
        } else if (ticketClass.equalsIgnoreCase("sleeper")) {
            for (int i = 0; i < numBerths; i++) {
                String coach = sleeperCoaches.get(i % sleeperCoaches.size());
                allocatedBerths.add(coach + "-" + (i / sleeperCoaches.size
   */       
         
   
