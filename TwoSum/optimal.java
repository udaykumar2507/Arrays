package ArrayMedium.TwoSum;
import java.util.Arrays;
public class optimal {
    public static void main(String[] args) {
        int arr[]={2,4,5,3,87,6,4};
        int k=900;
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int flag=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if (sum==k){
                System.out.println("YES");
                flag=1;
                break;
            }
            else if (sum<k){
                left++;
            }else{
                right--;
            }
        }
        if (flag==0){
            System.out.print("NO");
        }


    }
    
}
