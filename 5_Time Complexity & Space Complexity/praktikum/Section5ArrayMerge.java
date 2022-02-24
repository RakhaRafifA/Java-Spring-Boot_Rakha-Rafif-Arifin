import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ArrayMerge{
    public static void main(String[] args) {
      String[] arr1={"kazuya", "jin", "lee"};
      String[] arr2={"kazuya", "feng"};
      String[] arr3={"lee", "jin"};
      String[] arr4={"kazuya", "panda"};
      Array(arr1, arr2);
      System.out.println(" ");
      Array(arr3, arr4);
}
    public static void Array(String[] arr1, String[] arr2){
        Set finalarray = new HashSet<Array>();
        finalarray.addAll(Arrays.asList(arr1));
        finalarray.addAll(Arrays.asList(arr2));

        String[] finalarrayset = new String[finalarray.size()];
        finalarray.toArray(finalarrayset);

        Arrays.sort(finalarrayset);

        for (String str : finalarrayset){
            System.out.print(str + " ");
        }
    }
}