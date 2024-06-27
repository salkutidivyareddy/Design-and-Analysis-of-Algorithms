/*4. Implement the following
a. Create the package sounds.
b. Create interface dolby( with abstract method playDolby), and class Podcast(
with method playPodcast) in the package.
c. compile the package.
d. Use the package(import the package) to play sounds as chosen by the user.
Note : the methods should include the text as “play XXXXsound”.*/
package sounds;
import java.util.*;
interface dolby
{
   void playDolby();
 }
public class Podcast implements dolby
{
  public void playPodcast()
   {
     System.out.println("bowbow...Podcast...");
    }
  public void playDolby()
  {
    System.out.println("tictic..Dolby.....");
   }
}

 
