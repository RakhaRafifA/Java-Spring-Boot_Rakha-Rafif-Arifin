import java.util.Scanner;

class S10FibTopDown{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan barisan ke berapa yang anda cari = ");
        int x = input.nextInt();
        int[] fibo = new int[x + 1];
        input.close();
        System.out.println(TopDown(x, fibo));
    }
    static int TopDown(int n, int[] arr){
        if(n <= 1){
            return n;
        }
        if(arr[n] != 0 ){
            return arr[n];
        }
        arr[n] = TopDown(n - 1, arr) + TopDown(n - 2, arr);
        return arr[n];
    }
}