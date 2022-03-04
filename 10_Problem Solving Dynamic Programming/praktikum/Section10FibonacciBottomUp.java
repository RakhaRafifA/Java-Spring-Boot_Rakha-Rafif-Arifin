import java.util.Scanner;

class S10Problem2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan barisan ke berapa yang anda cari = ");
        int x = input.nextInt();
        input.close();
        System.out.println(BottomUp(x));
    }
    static int BottomUp(int n){
        int a = 0;
        int b = 1;
        int temp = 0;
        if(n <= 1){
            return n;
        }
        for(int i = 2; i <= n; i++){
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}