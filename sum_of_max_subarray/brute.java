package ArrayMedium.sum_of_max_subarray;

public class brute {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int sum=0;
                for (int k=i;k<j;k++){
                    sum+=arr[k];
                }
                max=Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
    
}
