import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class S6Problem2{
    public static void main(String[] args) {
        String a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka yang ingin anda cari = ");
        a = input.nextLine();
        char[] angka = a.toCharArray();
        b = a.length();
        input.close();

        Muncul(a, b);
    }
    static void Muncul(int[] arr, int n) {
        HashMap<Integer, Integer> insert = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(insert.containsKey(arr[i])){
                insert.put(arr[i], 1 + insert.get(arr[i]));
            }
            else{
                insert.put(arr[i], 1);
            }
            for(Map.Entry entry : insert.entrySet()){
                if(Integer.parseInt(String.valueOf(entry.getValue())) == 1){
                    System.out.println(entry.getKey() + " ");
                }
            }
        }
    }
}