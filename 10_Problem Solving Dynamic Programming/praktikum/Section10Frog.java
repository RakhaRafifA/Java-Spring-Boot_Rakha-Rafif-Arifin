import java.util.Scanner;

class S10Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah data pada array = ");
        int n = input.nextInt();
        int[] h = new int[n+1];
        int[] j = new int[n+1];
        System.out.println("Masukan nilai array = ");
        for(int i = 1; i <= n; i++){
            h[i] = input.nextInt();
        }
        j[1] = 0; j[2] = Math.abs(h[2] - h[1]);
        for(int i = 3; i <= n; i++){
            int a = j[i-1] + Math.abs(h[i] - h[i-1]);
            int b = j[i-2] + Math.abs(h[i] - h[i-2]);
            j[i] = Math.min(a, b);
        }
        System.out.println("Nilai minimalnya yaitu = " + (j[n]));  
        input.close();
    }
}
