import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class S6Problem5{
    public static void main(String[] args){
        int angka = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka yang ingin anda cari = ");
        angka = input.nextInt();
        String temp = Integer.toString(angka);
        int[] number = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            number[i] = temp.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(number));
        int a = number.length;
        input.close();
        removeduplicate(number, a);

    }
    static void removeduplicate(int[] arr, int n){
        Set<Integer> dups = new HashSet<>();
        for(int i = 0; i < n; i++){
            dups.add(arr[i]);
        }
        System.out.println(dups);
        System.out.println(dups.size());
    }
}