package Arrays.Missing_num_in_a_array;

public class optimized1 {
    public static void main(String[] args) {
    int []arr={0,1,3};
    int n=arr.length+1;
    int sum=(n*(n+1))/2;
    int sum2=0;
    for(int i=0;i<arr.length;i++){
        sum2+=arr[i];
    }
    System.out.println(sum-sum2);
    }
    
    
}
