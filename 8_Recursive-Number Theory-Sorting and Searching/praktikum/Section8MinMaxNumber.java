class S8Problem3{
    public static void main(String[] args) {
        int[] array1 = {5, 7, 4, -2, -1, -8};
        int[] array2 = {2, -5, -4, 22, 7, 7};
        MinMax(array1);
        MinMax(array2);
        
    }
    static int MinMax(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<arr[i+1]){
                System.out.println(arr[i]);
            }
        }
        return -1;
    }
}