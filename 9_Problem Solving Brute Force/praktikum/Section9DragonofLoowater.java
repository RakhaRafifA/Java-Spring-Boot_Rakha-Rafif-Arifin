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
        LooWater(dragon, knight);
    }
    static int LooWater(int[] arr1, int[] arr2){
        int naga = 0, ksatria = 0, temp = 0;
        for(int i = 0; i < arr1.length; i++){
            naga += arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            for(int j = arr2.length - 1 ; j > i; j--){
                temp = arr2[i] + arr2[j];
                if(temp >= naga){
                    ksatria = temp;
                    if(temp <= ksatria){
                        ksatria = temp;
                    }
                }
            }
        }
        if(naga <= ksatria){
            System.out.println(ksatria);
        }
        else{
            System.out.println("Knight Fall");
        }
        return ksatria;
    }
}