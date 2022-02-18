import java.util.*;

class Algoritma2{
    public static void main(String[] args) {

        Scanner baris = new Scanner(System.in);
        System.out.println("Masukan jumlah baris = ");
        int N = baris.nextInt();
        System.out.println("Anda memasukan jumlah baris sebanyak = " + N);
        baris.close();
        int i = 2;
        if(N%i == 0){
            System.out.println("Lampu Menyala");
        }
        else{
            System.out.println("Lampu Mati");

        }
    }
}