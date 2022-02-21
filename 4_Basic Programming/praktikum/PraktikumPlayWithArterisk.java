import java.util.Scanner;

class Arterisk{
    public static void main(String[] args) {
        int baris;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah baris = ");
        baris = input.nextInt();
        input.close();
        
        for(int i = 1; i<baris; i++){
            for(int j = 1; j<baris; j++)
                System.out.println(" ");
            for(int k = 1; k<i; k++)
                System.out.println("*");
        }
    }
}