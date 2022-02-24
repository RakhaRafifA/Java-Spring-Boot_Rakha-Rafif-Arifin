class AngkaMunculSekali{
    public static void main(String[] args) {
        int arr1[] = {7, 6, 5, 2, 3, 7, 5, 2};
        int arr2[] = {1, 1, 2, 2};
        SortingAngka(arr1); 
    }
    static int SortingAngka(int arr[]){
        int hasil = 0;
        for(int i = 0; i<arr.length; i++){
            hasil = hasil ^ arr[i];
        }
        System.out.print(hasil);
        return hasil;
    }
}