import java.util.*;
public class Movezero {
    public static void main(String[] args){
        int[] arr={0,3,2,0,1,2,0,0};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
