import java.util.Scanner;

class FaktorBilangan{
    public static void main(String[] args) {
        int bilangan;

        Scanner bil = new Scanner(System.in);
        System.out.println("Masukan Bilangan yang akan di cari = ");
        bilangan = bil.nextInt();
        System.out.println("Bilangan yang anda cari = " + bilangan);
        bil.close();

        for (int i = 1; i<=bilangan; i++){
            if(bilangan%i == 0){
                System.out.println(i);
            }
        }
    }
}