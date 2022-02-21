import java.util.Scanner;

class Arterisk{
    public static void main(String[] args) {
        int baris;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah baris = ");
        baris = input.nextInt();
        input.close();
        
        for(int i = 0; i<baris; i++){
            System.out.println(" ");
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            for(int k = baris - 1; k>1; k--){
                System.out.print(" ");
            }
        }
    }
}