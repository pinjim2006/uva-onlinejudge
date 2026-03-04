import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;
        outer: while(true){
            String s = sc.nextLine();
            switch (s) {
                case "#":
                    break outer;
                case "HELLO":
                    System.out.println("Case " + caseNum + ": ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("Case " + caseNum + ": SPANISH");
                    break;
                case "HALLO":
                    System.out.println("Case " + caseNum + ": GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("Case " + caseNum + ": FRENCH");
                    break;
                case "CIAO":
                    System.out.println("Case " + caseNum + ": ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("Case " + caseNum + ": RUSSIAN");
                    break;
                default:
                    System.out.println("Case " + caseNum + ": UNKNOWN");
                    break;
            }
            caseNum++;
        }
        
        
        sc.close();
    }
}