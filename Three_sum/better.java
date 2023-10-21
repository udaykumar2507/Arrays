package ArraysHard.Three_sum;
import java.util.*;

public class better {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        Set<List<Integer>>set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            Set<Integer>set1=new HashSet<>();
            for (int j=i+1;j<arr.length;j++){
                int third=-1*(arr[i]+arr[j]);
                if (set1.contains(third)){
                    List<Integer>list=Arrays.asList(arr[i],arr[j],third);
                    list.sort(null);
                    set.add(list);
                }else{
                    set1.add(arr[j]);
                }
            }
        }
        System.out.println(set);
    }
    
}
