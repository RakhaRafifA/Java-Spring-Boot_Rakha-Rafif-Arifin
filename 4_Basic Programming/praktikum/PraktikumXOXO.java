import java.util.Scanner;

class XOXO{
    public static void main(String[] args) {
        String kata;
        int x = 0, o = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan huruf X dan O = ");
        kata = input.nextLine();
        System.out.println("Anda memasukan kata = " + kata);
        kata = kata.toLowerCase();

        kata.close();
        
        
    }
}