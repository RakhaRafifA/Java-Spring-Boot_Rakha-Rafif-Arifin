class FastExponentation{

public static void main(String[] args) {
    System.out.println(pow(2, 3));  // 8
    System.out.println(pow(5, 3));  // 125
    System.out.println(pow(10, 2)); // 100
    System.out.println(pow(2, 5)); // 32
    System.out.println(pow(7, 3));  // 343
    System.out.println(pow(7, 2));  // 49
}
    
static Integer pow(Integer x, Integer n) {
    return (int) Math.pow(x, n);
}
}