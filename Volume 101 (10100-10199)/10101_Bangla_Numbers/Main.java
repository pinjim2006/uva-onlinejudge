import java.util.*;

public class Main {

    static String zeroCheck(long n){
        if(n == 0) return "0";
        return converter(n).trim();
    }

    static String converter(long n){
        StringBuilder sb = new StringBuilder();
        if(n >=10000000){
            sb.append(converter(n/10000000));
            sb.append(" kuti");
            n %= 10000000;
        }
        if(n >= 100000){
            sb.append(" ");
            sb.append(n / 100000);
            sb.append(" lakh");
            n %= 100000;
        }
        if(n >= 1000){
            sb.append(" ");
            sb.append(n / 1000);
            sb.append(" hajar");
            n %= 1000;
        }
        if(n >= 100){
            sb.append(" ");
            sb.append(n / 100);
            sb.append(" shata");
            n %= 100;
        }
        if(n > 0){
            sb.append(" ");
            sb.append(n);
            n = 0;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input;
        int caseNum = 1;
        while(sc.hasNextLong()) {
            input = sc.nextLong();
            System.out.printf("%4d. %s\n", caseNum, zeroCheck(input));
            caseNum++;
        }
        sc.close();
    }
}