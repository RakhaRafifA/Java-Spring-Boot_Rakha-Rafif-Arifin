class Pair{
    public static void main(String[] args){
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int target1 = 6;
        int arr2[] = {2, 5, 9, 11};
        int target2 = 11;
        SumPair(arr1, target1);
        SumPair(arr2, target2);

    }
    static int SumPair(int[] pair, int target){
        int a = 0;
        for (int i = 0; i<pair.length; i++){
            for (int j = i + 1; j<pair.length; j++){
                if((pair[i] + pair[j]) == target){
                    System.out.println("[" + pair[i] + "," + pair[j] + "]");
                }
            }
        }
        return 0;
    }
}