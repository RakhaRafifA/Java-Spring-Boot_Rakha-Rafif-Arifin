import java.util.Scanner;

class S9Problem4{
    public static void main(String[] args) {
        int[] array1 = {1, 1, 3, 5, 5, 6, 7};
        int[] array2 = {12, 15, 15, 19, 24, 31, 53, 59, 60};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan X untuk array 1 = ");
        int x = input.nextInt();
        System.out.println("Masukan X untuk array 2 = ");
        int y = input.nextInt();
        input.close();
        BSAlgorithm(array1, x);
        BSAlgorithm(array2, y);
    }
    static int BSAlgorithm(int[] arr, int n){
        int kiri = 0;
        int kanan = arr.length - 1;
        int tengah = (kiri + kanan)/2;
        while(kiri <= kanan){
            if(arr[tengah] < n){
                kiri = tengah + 1;
            }
            else if(arr[tengah] == n){
                System.out.println("Index = " + tengah);
                break;
            }
            else{
                kanan = tengah - 1;
            }
            tengah = (kiri + kanan)/2;
        }
        if(kiri>kanan){
            System.out.println("index tidak ditemukan = -1 ");
        }
        return tengah;
    }
}