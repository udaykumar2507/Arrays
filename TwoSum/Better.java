package ArrayMedium.TwoSum;

import java.util.HashMap;

public class Better {
    public static void main(String[] args) {
        int arr[]={2,3,4,9,56,3,2,1};
         int k=57;
         int flag=0;
         int[] ans = new int[2];
         HashMap<Integer,Integer>mp= new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int num=arr[i];
            int num1=k-num;
            if (mp.containsKey(num1)){
                ans[0]=mp.get(num1);
                ans[1]=i;
                 flag=1;
             }
            else{
                mp.put(arr[i],i);
            }
        }
        if (flag==1){
            for (int num:ans){
                System.out.println(num+" ");
            }
        }else{
            System.out.println(-1);
        }
        
   
    }
}
    