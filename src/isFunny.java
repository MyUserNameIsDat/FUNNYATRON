import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class isFunny {
  static  File file = new File("lib/whitelist.txt");
    static boolean Funny()  {
        int funnyOrNot=0;
        funnyOrNot = (int)(Math.random() * testyyy.getProbability());  // 0 to 100  
         return (funnyOrNot==(testyyy.getProbability()-1));
        }
    static String whitelist(String input) {
        String output="failed";
        if (input.contains("!setProbability")) {
          String[] inputArr=input.split(" ");
          testyyy.setProbability(inputArr[1]);
          output="changed sucessfuly!!! i mean... what the heck does that mean?? this is ai there is no probability";
        } else {
        try {
         
          Scanner sc = new Scanner(file);
          while (sc.hasNextLine()) {
            String data = sc.nextLine();
            String[] isFunny = data.split(" ", 3);
          
            if (isFunny[1].equalsIgnoreCase(input)) {
                 
                App.funny=(isFunny[0].equals("funny"));
                output=isFunny[2];
            }
          }  sc.close();
         
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
       
        } 
      }
      return output;

     }

    }
    