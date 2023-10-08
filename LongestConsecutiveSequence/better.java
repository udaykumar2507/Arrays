package LongestConsecutiveSequence;
import java.util.*;
public class better {
    public static void main(String[] args) {
        int arr[]={102,4,101,3,2,1,1,103,104,105,106};
        Arrays.sort(arr);
        int longest=0;int count=0;int smaller_ele=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]-1==smaller_ele){
                count++;
                smaller_ele=arr[i];
            }
            else if (arr[i]-1!=smaller_ele){
                count=1;
                smaller_ele=arr[i];
            }
            longest=Math.max(count, longest);

        }
        System.out.println(longest);

    }
    
}
