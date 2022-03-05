import java.util.Scanner;

class S8MaxBuy{
    public static void main(String[] args) {
        int[] array1 = {25000, 25000, 10000, 14000};
        int[] array2 = {15000, 10000, 12000, 5000, 3000};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan aang anda untuk array 1 = ");
        int uang1 = input.nextInt();
        System.out.println("Masukan aang anda untuk array 2 = ");
        int uang2 = input.nextInt();
        input.close();
        System.out.println(barang(array1, uang1));
        System.out.println(barang(array2, uang2));
    }
    static int barang(int[] arr, int x){
        int index = 0;
        for(int i = 0; i < x; i++){
            if(x>=arr[i]){
                x -= arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(index);
        return x;
    }
}