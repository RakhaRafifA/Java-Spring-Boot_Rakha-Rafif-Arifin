import java.util.*;

class Aloritma1{
    public static void prima(String[] args) {

        Scanner bil = new Scanner(System.in);
        System.out.println("Masukan bilangan 1 - 9 = ");
        int a = bil.nextInt();
        System.out.println("Bilangan anda = " + a);

        bil.close();

        if(a%2 == 0){
            System.out.println("Bukan Bilangan Prima");
        }
        else{
            System.out.println("Bilangan Prima");
        }
    }
}