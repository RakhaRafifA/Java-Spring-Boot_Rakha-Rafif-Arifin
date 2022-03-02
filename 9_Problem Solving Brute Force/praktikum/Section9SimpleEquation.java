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
    public static int[] SimpleE(int A, int B, int C){
        int x = 0, y = 0, z = 0, max = 0;
        if(A<max){
            max = A;
        }
        else if(B<max){
            max = B;
        }
        else{
            max = C;
        }
        for(int i = 0; i < max; i++){
            x = i;
            for(int j = 0; j < max; j++){
                y = j;
                for(int k = 0; k < max; k++){
                    z = k;
                    if(x + y + z == A && x * y * z == B && (x*x) + (y*y) + (z*z) == C){
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
        int[] result = {x, y, z};
        return result;
    }
}