import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int c=1;
        int max = 1;
        for(int i = 0 ; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                c++;
                max = Math.max(max , c);
            }
            else{
                c = 1;
            }
        }
        System.out.println(max);
    }
}
