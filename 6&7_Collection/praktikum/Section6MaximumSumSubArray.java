import java.util.Scanner;
import java.util.Arrays;

class S6Problem6{
    public static void main(String[] args) {
        int angka = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka yang ingin anda masukan ke dalam array = ");
        angka = input.nextInt();
        String temp = Integer.toString(angka);
        int[] number = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            number[i] = temp.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(number));
        System.out.println("Masukan K = ");
        int k = input.nextInt();
        int a = number.length;
        input.close();
        Maxsum(number, a, k);
    }
    static int Maxsum(int[] arr, int n, int k){
        if(n<k){
            System.out.println("Tidak dapat mencari, K lebih besar dari array");
            return -1;
        }
        int hasil = 0;
        for(int i = 0; i<k; i++){
            hasil = hasil + arr[i];
        }
        int temp = hasil;
        for(int i = k; i < n; i++){
            temp = temp + arr[i] - arr[i - k];
            hasil = Math.max(hasil, temp);
        }
        System.out.println("Hasil Maximum Sum Subarray = " + hasil);
        return hasil;
    }
}