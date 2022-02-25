import java.util.Scanner;

class Prima{
    public static void main(String[] args) {
        int bilangan;
        
        Scanner prima = new Scanner(System.in);
        System.out.println("Masukan bilangan yang ingin anda cari dari 1 - 13 = ");
        bilangan = prima.nextInt();
        System.out.println("Bilangan yang anda cari = " + bilangan);
        prima.close();

        if(bilangan<=4){
            System.out.println("Bilangan Prima");
        }
        else if(bilangan >= 4 && bilangan%2 == 0){
            System.out.println("Bukan Bilangan Prima");
        }
        else if(bilangan >= 4 || bilangan<=17 || bilangan%2 != 0){
            System.out.println("Bilangan Prima");
        }
        else if(bilangan>17){
            System.out.println("Bukan Bilangan Prima");
        }
    }
}