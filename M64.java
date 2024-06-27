/*4. Implement the following
a. Create the package sounds.
b. Create interface dolby( with abstract method playDolby), and class Podcast(
with method playPodcast) in the package.
c. compile the package.
d. Use the package(import the package) to play sounds as chosen by the user.
Note : the methods should include the text as “play XXXXsound”.*/
import sounds.Podcast;
import java.util.*;
class M64
{
  public static void main(String args[])
  {
     System.out.println("Enter\n1.Dolby\n2.Podcast");
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     Podcast o=new Podcast();
     if(x==1)
       o.playDolby();
     else
      o.playPodcast();
   }
}
