import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class S8Most{
    public static void main(String[] args) {
        String[] array = {};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah data array = ");
        int n = input.nextInt();
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < n; i++){
            data.add(input.nextLine());
        }
        input.close();
        MostApp(array);
    }
    static void MostApp(String[] arr){
        Map<String, Integer> mostapp = new HashMap<>();
        for(String i : arr){
            if(mostapp.containsKey(i)){
                mostapp.put(i, mostapp.get(i) + 1);
            }
            else{
                mostapp.put(i, 1);
            }
            for(Map.Entry<String, Integer> entry: mostapp.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
            }
        }
    }
}