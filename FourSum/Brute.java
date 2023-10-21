package ArraysHard.FourSum;
import java.util.*;
public class Brute {

    public static void main(String[] args) {
        int tar=0;
        Set<List<Integer>>set=new HashSet<>();
        int arr[]={1,0,-1,0,-2,2};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    for (int l=k+1;l<arr.length;l++){
                        long sum=arr[i]+arr[j]+arr[k]+arr[l];
                        if (sum==tar){
                            List<Integer>list=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            list.sort(null);
                            set.add(list);
                        }
                    
                    }
                }
            }

        }
        System.out.println(set);
    }
    
}
