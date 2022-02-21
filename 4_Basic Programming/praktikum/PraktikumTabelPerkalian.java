import java.util.Scanner;

class TabelPerkalian{
    public static void main(String[] args) {
        int bilangan, hasil;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan batas akhir tabel perkalian = ");
        bilangan = input.nextInt();
        hasil = bilangan;
        input.close();

        for(int i = 0; i<=bilangan; i++){
            System.out.print(i + " ");
            for(int j = 1; j<=bilangan; j++){
                hasil = hasil*bilangan;
                System.out.println(hasil);
            }
        }
    }
}