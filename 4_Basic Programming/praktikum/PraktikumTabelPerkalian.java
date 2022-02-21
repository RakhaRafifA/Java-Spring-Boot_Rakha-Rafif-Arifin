import java.util.Scanner;

class TabelPerkalian{
    public static void main(String[] args) {
        int bilangan, hasil;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan batas akhir tabel perkalian = ");
        bilangan = input.nextInt();
        input.close();

        for(int i = 1; i<=bilangan; i++){
            for(int j =1; j<=bilangan; j++){
                hasil = i*j;
                System.out.println(" ");
                System.out.print(hasil + " ");
            }
        }
    }
}