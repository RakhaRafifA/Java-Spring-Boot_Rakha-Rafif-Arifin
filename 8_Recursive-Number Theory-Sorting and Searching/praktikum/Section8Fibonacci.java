import java.util.Scanner;

class S8Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai X = ");
        int x = input.nextInt();
        System.out.println(fib(x));
        input.close();
    }
    static int fib(int n){
        if(n <= 1){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}