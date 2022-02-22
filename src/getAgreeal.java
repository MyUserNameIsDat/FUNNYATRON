import java.util.Scanner;
public class getAgreeal {
    static Scanner sc = new Scanner(System.in);
    static boolean ToS(){
        boolean ToS=true;
        boolean regex=false;
        while (!regex) { System.out.print("Do you agree to the terms of service (Y/N):");
        String Ans= sc.next();
        if (Ans.equalsIgnoreCase("Y")) {
            regex=true;
            System.out.println();
        } else if (Ans.equalsIgnoreCase("N")) {
            regex=true;
            ToS=false;
        } 
    }
    return ToS;
    }
    
}