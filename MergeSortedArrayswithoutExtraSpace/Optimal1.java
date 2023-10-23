package ArraysHard.MergeSortedArrayswithoutExtraSpace;
import java.util.*;
public class Optimal1 {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,6,8,9};
        int n=arr1.length;
        int m=arr2.length;
        int left=n-1;
        int right=0;
        while(arr1[left]>=arr2[right]){
            int temp=arr1[left];
            arr1[left]=arr2[right];
            arr2[right]=temp;
            left--;
            right++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    
}
