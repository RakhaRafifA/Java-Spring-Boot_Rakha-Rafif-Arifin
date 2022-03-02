import java.util.Scanner;

class S9Problem2{
    public static void main(String[] args) {
        int uang;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka anda = ");
        uang = input.nextInt();
        input.close();
        MoneyChange(uang);
    }
    public static int MoneyChange(int hasil){
        while(hasil > 0){
            if(hasil >= 10000){
                hasil -= 10000;
                System.out.print("10000 ");
            }
            else if(hasil >= 5000){
                hasil -= 5000;
                System.out.print("5000 ");
            }
            else if(hasil >= 2000){
                hasil -= 2000;
                System.out.print("2000 ");
            }
            else if(hasil >= 1000){
                hasil -= 1000;
                System.out.print("1000 ");
            }
            else if(hasil >= 500){
                hasil -= 500;
                System.out.print("500 ");
            }
            else if(hasil >= 200){
                hasil -= 200;
                System.out.print("200 ");
            }
            else if(hasil >= 100){
                hasil -= 100;
                System.out.print("100 ");
            }
            else if(hasil >= 50){
                hasil -= 50;
                System.out.print("50 ");
            }
            else if(hasil >= 20){
                hasil -= 20;
                System.out.print("20 ");
            }
            else if(hasil >= 10){
                hasil -= 10;
                System.out.print("10 ");
            }
            else if(hasil >= 1){
                hasil -= 1;
                System.out.print("1 ");
            }
        }
        return hasil;
    }
}