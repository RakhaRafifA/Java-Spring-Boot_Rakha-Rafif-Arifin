import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class S6Problem2{
    public static void main(String[] args) {
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
        input.close();
        MunculSekali(number);
    }
    static void MunculSekali(int[] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (mp.containsKey(arr[i])){
                 mp.put(arr[i], 1 + mp.get(arr[i]));
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry entry : mp.entrySet()){
            if (Integer.parseInt(String.valueOf(entry.getValue())) == 1){
                System.out.print(entry.getKey() + " ");
            }
        }     
    }
}