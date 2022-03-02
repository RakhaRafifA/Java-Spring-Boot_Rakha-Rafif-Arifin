import java.util.Scanner;

class S9Problem1{
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai A = ");
        a = input.nextInt();
        System.out.println("Masukan nilai B = ");
        b = input.nextInt();
        System.out.println("Masukan nilai C = ");
        c = input.nextInt();
        input.close();
        SimpleE(a, b, c);
    }
    public static int SimpleE(int A, int B, int C){
        int x, y, z;
        for(int i = 0; i < A; i++){
            x = i;
            y = i;
            z = i;
            if(x + y + z == A){
                System.out.println(x + " " + y + " " + z);
            }
            else if(x * y * z == B){
                System.out.println(x + " " + y + " " + z);
            }
            else if((x*x) + (y*y) + (z*z) == C){
                System.out.println(x + " " + y + " " + z);
            }
            else{
                System.out.println(" no result");
            }
        }
        return A;
    }
}