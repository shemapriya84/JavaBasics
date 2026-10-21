import java.util.*;
public class Duplicate {
    public static int removeDuplicates(int[] arr){
        int k=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[k-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] arr = { 1,1,2,2,2,3,4,4,5,5};
        removeDuplicates(arr);
        System.out.print(Arrays.toString(arr));
    }
}
