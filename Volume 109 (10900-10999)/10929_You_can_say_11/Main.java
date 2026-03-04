import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        while(!(input.length() == 1 && input.charAt(0) == '0')){
            int n1 = 0, n2 = 0;
            for(int i = 0; i < input.length(); i++) {
                if(i % 2 == 0){
                    n1 += input.charAt(i) - '0';
                } else {
                    n2 += input.charAt(i) - '0';
                }
            }

            System.out.println(input + " is " + ((Math.abs(n1 - n2) % 11 == 0) ? "" : "not ") +"a multiple of 11.");
            input = s.nextLine();
        }
        s.close();
    }
}