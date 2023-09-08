package Arrays.Left_Rotate_an_Array;
public class optimized {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int k=3;
        reverse(arr,0,arr.length-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,k-1);
        for (int num:arr){
            System.out.print(num+" ");
        }

        
        
    }
    public static void reverse(int []arr,int start,int end){
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    
}
