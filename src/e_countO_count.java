public class e_countO_count {
    public static void main(String[] args){
        int[] arr = {12,56,45,34,30};
        int e_count = 0;
        int o_count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                e_count += 1;
            }
            if(arr[i]%2!=0){
                o_count += 1;
            }
        }
        System.out.println(e_count);
        System.out.println(o_count);
    }
}
