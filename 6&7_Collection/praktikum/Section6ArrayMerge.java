import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class S6Problem1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama untuk array1= ");
        String m = input.nextLine();
        String n = input.nextLine();
        String o = input.nextLine();
        String[] arr1 = {m, n, o};
        System.out.println("Masukan Nama untuk array2= ");
        String p = input.nextLine();
        String q = input.nextLine();
        String r = input.nextLine();
        String[] arr2 = {p, q, r};
        System.out.println("Array yang anda masukan = ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Array setelah digabung = ");
        Arrayss(arr1, arr2);
        input.close();
    }
    static void Arrayss(String[] array1, String[] array2){
        Set <String> finalarray = new HashSet<>();
        finalarray.addAll(Arrays.asList(array1));
        finalarray.addAll(Arrays.asList(array2));

        String[] gabungan = new String[finalarray.size()];
        finalarray.toArray(gabungan);

        System.out.println(Arrays.toString(gabungan));
    }
}