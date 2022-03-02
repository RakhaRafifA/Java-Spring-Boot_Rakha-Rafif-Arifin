import java.util.Arrays;
import java.util.Scanner;

class S9Problem3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Size array dragon = ");
        int a = input.nextInt();
        int[] dragon = new int [a];
        System.out.println("Masukan data pada array dragon = ");
        for(int i = 0; i < a; i++){
            dragon[i] = input.nextInt();
        }
        System.out.println("Masukan Size array knight = ");
        int b = input.nextInt();
        int[] knight = new int [b];
        System.out.println("Masukan data pada knight = ");
        for(int i = 0; i < b; i++){
            knight[i] = input.nextInt();
        }
        input.close();
        System.out.println("Array Dragon = " + Arrays.toString(dragon));
        System.out.println("Array Knight = " + Arrays.toString(knight));
    }
}