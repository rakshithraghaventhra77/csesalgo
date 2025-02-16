import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int l [] = new int[n];
        for(int i = 0 ;i< n ; i++){
            l[i] = in.nextInt();
        }
        long c  = 0;
        for(int i = 1 ; i < n ; i++){
            if(l[i] < l[i-1]){
                
                c += (l[i - 1] - l[i]);
                l[i] = l[i-1];
                
            }
        }
        System.out.println(c);

    }
}
