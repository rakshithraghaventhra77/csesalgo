import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        for(int i = 0 ; i < n - 1; i++){
            sum += in.nextInt();
        }
        long cal = ((long)n*(n+1))/2;
        long res = cal -sum;
        System.out.println(res);
        in.close();
    }
}
