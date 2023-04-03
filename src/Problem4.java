public class Problem4 {
    public static void main(String[] args) {
        int n =5;
        int nfactorial = factorial(n);
        System.out.println(nfactorial);
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
