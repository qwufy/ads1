import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean result = isDigits(s);
        System.out.println(result ? "Yes" : "No");
    }

    public static boolean isDigits(String s){
        if(s.length() == 0){
            return true;
        }
        else {
            char firstchar = s.charAt(0);
            if(Character.isDigit(firstchar)){
                return isDigits(s.substring(1));
            }
            else {
                return false;
            }
        }
    }
}
