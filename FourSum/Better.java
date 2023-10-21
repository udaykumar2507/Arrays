package ArraysHard.FourSum;
import java.util.*;

public class Better {
    public static void main(String[] args) {
        Set<List<Integer>>set=new HashSet<>();
        int target=0;
        int arr[]={1,0,-1,0,-2,2};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                Set<Integer>set1=new HashSet<>();
                for (int k=j+1;k<arr.length;k++){
                    int sum=arr[i]+arr[j];
                    sum+=arr[k];
                    int remaining=target-sum;
                    if (set1.contains(remaining)){
                        List<Integer>list1=Arrays.asList(arr[i],arr[j],arr[k],(int)remaining);
                        list1.sort(null);
                        set.add(list1);
                    }else{
                        set1.add(arr[k]);
                    }
                 ///USE LONG FOR LARGE INTEGER
                }
            }
        }
        System.out.println(set);
    }
    
}
