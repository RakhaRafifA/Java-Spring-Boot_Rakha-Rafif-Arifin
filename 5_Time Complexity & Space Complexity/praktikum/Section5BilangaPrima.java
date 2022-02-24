class BilanganPrima{
public static void main(String[] args) {
    System.out.println(primeNumber(1500450271));
    System.out.println(primeNumber(1000000007));
    System.out.println(primeNumber(13));
    System.out.println(primeNumber(17));
    System.out.println(primeNumber(20));
    System.out.println(primeNumber(35));
}
             
static boolean primeNumber(Integer number) {
    if(number%2 != 0 && number%5 != 0){
        return true;
    }
    return false;
}          
}