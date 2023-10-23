package ArraysHard.Merge_Overlapping_subarray;
import java.util.*;

public class Brute {
    public static void main(String[] args) {
        int arr[][]={{1,3},{8,10},{15,18},{2,6}};
        Arrays.sort(arr,new Comparator<int []>() {
            public int compare (int[]a,int []b){
                return a[0]-b[0];
            }   
        });
        List<List<Integer>>list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            if(!list.isEmpty() &&  end<=list.get(list.size()-1).get(1)){
                continue;
            }
            for (int j=i+1;j<arr.length;j++){
                if (end>arr[j][0]){
                    end=Math.max(arr[j][1],end);
                }else{
                    break;
                }
            }
            list.add(Arrays.asList(start,end));  
        }
        System.out.println(list);
    }
    
}
