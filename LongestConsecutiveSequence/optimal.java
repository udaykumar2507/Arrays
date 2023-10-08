package LongestConsecutiveSequence;

import java.util.HashSet;

public class optimal {
    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1,1,1,1,1,5,6,7,8,9};
        HashSet<Integer>s=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        int longest=0;
        for (int j:s){
            if (!s.contains(j-1)){
                int count=1;
                while(s.contains(j+1)){
                    count++;
                    j++;
                }
                longest=Math.max(count, longest);
            }
        }
        System.out.println(longest);
    }
    
}
