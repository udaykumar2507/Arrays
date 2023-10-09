package Count_subarrays_with_givensum;

public class brute {
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                if (sum==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
