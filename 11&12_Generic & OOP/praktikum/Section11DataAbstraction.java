/* import java.util.Scanner;

class Section11DataAbstarction{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        calculator c = new calculator();
        c.GetTitle();
        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");
        System.out.print("Masukan Pilihan anda : ");
        int pilihan = input.nextInt();
        if(pilihan == 1){
            c.GetTitle();
            System.out.print("Masukan value 1: ");
            int a = input.nextInt();
            System.out.print("Masukan value 2: ");
            int b = input.nextInt();
            c.GetTitle();
            System.out.println("1. Add Value");
            System.out.println("2. Sub Value");
            System.out.println("3. Multiply Value");
            System.out.println("4. Divide Value");
            c.GetTitle();
            System.out.print("Pilihan anda : ");
            int pilih = input.nextInt();
            if(pilih == 1){
                System.out.println("Pilihan anda : " + pilih);
                c.add(a, b);
            }
            else if(pilih == 2){
                System.out.println("Pilihan anda : " + pilih);
                c.sub(a, b);
            }
            else if(pilih == 3){
                System.out.println("Pilihan anda : " + pilih);
                c.multiply(a, b);
            }
            else if(pilih == 4){
                System.out.println("Pilihan anda : " + pilih);
                c.divide(a, b);
            }
            else{
                System.out.println("Tidak ada pilihan " + pilih);
            }
        }
        else if(pilihan == 99){
            System.out.println("+++++++++++++++++ Exit +++++++++++++++++");
        }
        else{
            System.out.println("Tidak ada pilihan " + pilihan);
        }
        input.close();
    }
}

abstract class Data{
    public int add(int a, int b){
        System.out.println("Hasil : " + (a + b));
        return a + b;
    }
    public int sub(int a, int b){
        System.out.println("Hasil : " + (a - b));
        return a - b;
    }
    public int multiply(int a, int b){
        System.out.println("Hasil : " + (a * b));
        return a * b;
    }
    public double divide(double a, double b){
        System.out.println("Hasil : " + (a / b));
        return a / b;
    }
}

class calculator extends Data{
    private String title = "";

    public String GetTitle(){
        System.out.println("+++++++++++++++++ CALCULATOR +++++++++++++++++");
        return title;
    }
}

*/ 