import java.util.Scanner;

class S9Problem3{
    public static void main(String[] args) {
        int[] dragon = {0}, knight = {0};
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Size array dragon = ");
        a = input.nextInt();
        System.out.println("Masukan data pada array = ");
        for(int i = 0; i < a; i++){
            dragon[i] = input.nextInt();
        }
        System.out.println("Masukan Size array knight = ");
        a = input.nextInt();
        System.out.println("Masukan data pada knight = ");
        for(int i = 0; i < a; i++){
            knight[i] = input.nextInt();
        }
        input.close();
        System.out.println("Array Dragon = " + dragon);
        System.out.println("Array Knight = " + knight);
    }
}