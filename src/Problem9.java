import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = binolmialCoef(n, k);
        System.out.println(result);
    }

    public static int binolmialCoef(int n, int k){
        if (k == 0 || k == n){
            return 1;
        }
        else{
            return binolmialCoef(n-1,k-1) + binolmialCoef(n-1,k);
        }
    }
}
