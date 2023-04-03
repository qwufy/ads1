import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = powerOf(a, n);
        System.out.println(result);
    }

    public static int powerOf(int a, int n){
        if (n==0){
            return 1;
        }
        else {
            return a * powerOf(a, n-1);
        }
    }
}
