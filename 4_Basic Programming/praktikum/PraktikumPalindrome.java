import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        String kata, balik = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan kata yang akan dicari = ");
        kata = input.nextLine();
        int length = kata.length();
        input.close();
        kata.toLowerCase();

        for(int i = length -1; i >= 0; i--){
            balik = balik + kata.charAt(i);
        }
        if(kata.equals(balik)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Bukan Palindrome");
        }
    }
}