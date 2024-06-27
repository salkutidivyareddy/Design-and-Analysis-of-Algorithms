/*
4. Create an Interface Fare with methods getFare(), getAmenities() to get the
amount paid for Travelling and Amenities provided in journey. Calculate the fare
paid and Amenities provided in Bus, Train and Flight implementing interface Fare.

Note :The Fare per Kilometer is different for Road and Rail and airways and even
the fare changes as per type of Bus (A/c, Non A/c, sleeper, semi sleeper etc.,)
Train( General, Sleeper, A/c), Flight (Economy/Business class) . Make necessary
assumptions on distance travelled etc.,.*/

import java.lang.*;
imort java.util.*;
 interface Fare
 {
    void getFare(int x);
    void getAminities();
 }
 class Bus
 {
   
    public void getFare(int x)
    {
       System.out.println("A/c  ="+ x*50);
       System.out.println("Non A/c ="+ x*10);
       System.out.println("Sleeper ="+ x*25);
       System.out.println("Semi Sleeper ="+ x*20);
     }
     public void getAminities()
     {
        System.out.println("Wifi ,convenience, comfort, reliability and security");
     }
     
 }
 
 class Train
 {
   
    public void getFare(int x)
    {
       System.out.println("A/c  ="+ x*50);
       System.out.println("Non A/c ="+ x*10);
       System.out.println("Sleeper ="+ x*25);
       System.out.println("Semi Sleeper ="+ x*20);
     }
     public void getAminities()
     {
        System.out.println("Wifi ,convenience, comfort, reliability and security");
     }
     
 }
       
