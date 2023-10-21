package ArraysHard.Three_sum;
import java.util.*;

public class Brute {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        Set<List<Integer>> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer>list= Arrays.asList(arr[i],arr[j],arr[k]);
                        list.sort(null);
                        set.add(list);
                    }
                }
            }
        }
        System.out.println(set);
    }
    
}
