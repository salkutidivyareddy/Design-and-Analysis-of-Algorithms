
import java.util.*;
class Television{
  
   int channel=1;
   int volume=0;
   boolean on=false;
   void turnOn(){
    on=true;
    System.out.println("Tv is on ");
   }
   void turnOff()
   {
     on=false;
     System.out.println("Tv is Offed");
   }
  void  setChannel(int c){
    channel=c;
    System.out.println(channel);
    }
    void setVolume(int v)
    {
       volume=v;
        System.out.println(volume);
    }
    void channelUp()
    {
       if(channel<39)
         {
         channel=channel+1;
         System.out.println(channel);
         }
       else{
         channel=0;
         System.out.println(channel);
         }
     }
    void volumeUp(){
        if(volume<6)
          volume=volume+1;
         else
           volume=6;
         System.out.println(volume);
       }
     void volumeDown(){
        if(volume>0)
          volume=volume-1;
         else
           volume=0;
         System.out.println(volume);
       }
      void channelDown(){
        if(channel>0)
          channel=channel-1;
         else
           channel=0;
         System.out.println(channel);
      
       }
    void getStatus(){
       System.out.println(on);
       System.out.println(channel);
       System.out.println(volume);
      }
 }
 class Tv{
     public static void main(String args[])
     {
        Television t1=new Television();
       
       System.out.println(" Enter one option:1.Tv on 2.Tv off 3.Setting channel 4.Setting Volume 5.Volume Increase 6.Volume Decrease 7.Channel Increase 8.Channel decrease 9.status 10.exit");
       Scanner sc=new Scanner(System.in);
       int x;
       do{
         x=sc.nextInt();
        switch(x){
        case 1:
          t1.turnOn();
           break;
        case 2:
           t1.turnOff();
           break;
         case 3:
           System.out.println("Enter Channel Number:");
           int c=sc.nextInt();
           t1.setChannel(c);
           break;
         case 4:
            System.out.println("Enter Volume Number:");
           int v=sc.nextInt();
           t1.setVolume(v);
           break;
         case 5:
           t1.volumeUp();
           break;
         case 6:
           t1.volumeDown();
           break;
         case 7:
           t1.channelUp();
           break;
         case 8:
           t1.channelDown();
           break;
          case 9:
            t1.getStatus();
            break;
          
         
     }}while(x!=10);
     }
  }
  
 
 
 
 
 
 
 
 
   
     
   
