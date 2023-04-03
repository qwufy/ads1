public class Problem1 {
    public static void main(String[] args){
        int[] arr =  {10, 1, 32, 3, 45};
        int min = findMin(arr, arr.length);
        System.out.println(min);
    }

    public static int findMin(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }
        else{
            int minNum = findMin(arr, n-1);
            return Math.min(minNum, arr[n-1]);
        }
    }
}

