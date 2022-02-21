import java.util.Scanner;

class Eksponensial{
    public static void main(String[] args) {
        int x, n, hasil;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan x = ");
        x = input.nextInt();
        System.out.println("Masukan n = ");
        n = input.nextInt();
        hasil = x;
        input.close();
        
        for(int i = 1; i<n; i++){
            hasil = hasil * x;
        }
        System.out.println("Hasil Eksponensial " + x + "^" + n + " adalah = " + hasil);
    }
}