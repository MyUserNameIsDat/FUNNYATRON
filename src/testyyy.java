import java.io.*;
import java.util.Scanner;



public class testyyy{
    public static void setProbability(String probability) {
    try {
        //input the file content to the StringBuffer "input"
        BufferedReader file = new BufferedReader(new FileReader("lib/whitelist.txt"));
        StringBuffer inputBuffer = new StringBuffer();
        String line;

        while ((line = file.readLine()) != null) {
            inputBuffer.append(line);
            inputBuffer.append('\n');
        }
        file.close();
        String inputStr = inputBuffer.toString();

            
            inputStr = inputStr.replace("probability " +getProbability(), "probability "+probability); 
           
            
        
   
        FileOutputStream fileOut = new FileOutputStream("lib/whitelist.txt");
        fileOut.write(inputStr.getBytes());
        fileOut.close();

    } catch (Exception e) {
        System.out.println("Problem reading file.");
    }
}
static int getProbability(){
    int output=0;
    try {
   Scanner sc = new Scanner(isFunny.file);
   while (sc.hasNextLine()) {
     String data = sc.nextLine();
     String[] isFunny = data.split(" ", 3);
     if (isFunny[0].equalsIgnoreCase("Probability")) {
          
         output=Integer.parseInt(isFunny[1]);
         
     }
   } sc.close();
  
 } catch (FileNotFoundException e) {
   System.out.println("An error occurred.");
   e.printStackTrace();
   }
  return output;
  }
}