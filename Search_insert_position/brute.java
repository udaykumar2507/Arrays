package Search_insert_position;

public class brute {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int target=11;
        int val=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                val=i;
            }
        }
        if (val==Integer.MIN_VALUE){
            for (int i=0;i<arr.length;i++){
                if (target<arr[i]){
                    val=i;
                    break;
                }
                else{
                    val=arr.length;
                }
            }
        }
        System.out.println(val);
    }
    
}
