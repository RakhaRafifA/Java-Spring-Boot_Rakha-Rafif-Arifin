import java.util.Scanner;

class S8Problem1{
    public static void main(String[] args) {
        int[] prima = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        System.out.println("Masukan index array yang ingin anda cari = ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        primeX(prima, a);
    }
    static int primeX(int[] array, int a){
        for(int i = 0; i < array.length; i++){
            if(a == array[i]){
                return i + 1;
            }
        }
        return -1;
    }
}