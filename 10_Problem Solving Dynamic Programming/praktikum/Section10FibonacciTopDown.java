import java.util.Scanner;

class S10FibTopDown{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan barisan ke berapa yang anda cari = ");
        int x = input.nextInt();
        int[] fibo = new int[x + 1];
        input.close();
        TopDown(fibo, x);
    }
    static int[] TopDown(int[] fib, int n){
        int result = 0;
        if(n == 0 || n == 1){
            return n;
        }
        if(arr[n] != 0){
            return fib[n];
        }
        fib[n] = fib[n-1] + fib[n-2];
        System.out.println(fib[n]);
        return fib[n];
    }
}