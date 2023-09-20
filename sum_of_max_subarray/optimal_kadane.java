package ArrayMedium.sum_of_max_subarray;

public class optimal_kadane {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max, sum);
            if (sum<0){
                sum=0;
            }
        }
        System.out.println(max);
        
    }
    
}
