class S8Problem3{
    public static void main(String[] args) {
        int[] array1 = {5, 7, 4, -2, -1, 8};
        int[] array2 = {2, -5, -4, 22, 7, 7};
        MinMax(array1);
        MinMax(array2);
        
    }
    static int MinMax(int[] arr){
        int min = arr[0], max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("min = " + min + "max = " + max);
        return -1;
    }
}