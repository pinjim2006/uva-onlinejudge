import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            boolean flag = true;

            int[] arr = new int[n];
            arr[0] = sc.nextInt();
            if(arr[0] < 1)
                flag = false;
            
            for(int i = 1; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] <= arr[i-1]){
                    flag = false;
                }
            }
            outer: for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    if(set.contains(arr[i] + arr[j])){
                        flag = false;
                        break outer;
                    }else{
                        set.add(arr[i] + arr[j]);
                    }
                }
            }
            if(flag){
                System.out.println("Case #" + caseNum + ": It is a B2-Sequence.\n");
            }else{
                System.out.println("Case #" + caseNum + ": It is not a B2-Sequence.\n");
            }
            caseNum++;
        }
        
        
        sc.close();
    }
}