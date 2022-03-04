import java.util.Scanner;
import java.util.TreeMap;
import java.util.Scanner;

class S10Problem4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka yang anda ingin ubah = ");
        int angka = input.nextInt();
        input.close();
        System.out.println(Roman(angka));
    }
    private final static TreeMap<Integer,String> map = new TreeMap<>();
    static{
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }
    public final static String Roman(int number){
        int a = map.floorKey(number);
        if(number == a){
            return map.get(number);
        }
        return map.get(a) + Roman(number - a);
    }
}