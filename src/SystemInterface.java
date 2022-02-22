import java.util.Scanner;
public class SystemInterface {
    static Scanner sc = new Scanner(System.in);
    static String getJoke() {
        
        System.out.print("enter text to determine if its funny: ");
        String output=sc.nextLine();
        if (!output.contains("!setProbability")) {
            output=output.replace(' ', '-');
        }
return output;

}
    static String result (String input){
        String output;
        
        
            if (!isFunny.whitelist(input).equals("failed")) {
               output=isFunny.whitelist(input);

            }else {
                if (isFunny.Funny()) {
                    App.funny=true;
                    int gudNumber = (int)(Math.random() * 41+30); // 30-100
                    output="YEs!!!! Very Funny!!!! joke is "+gudNumber+"/100";

                } else {
                    App.funny=false;
                    int badNumber = (int)(Math.random() * -31); // 0-30
                output = "Bad!!!! Not Funny!!!! >:( your joke is "+badNumber+"/100";

                }
                
            }
          
        return output;
    }
}
    
  
    
