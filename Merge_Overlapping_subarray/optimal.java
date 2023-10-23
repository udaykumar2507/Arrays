package ArraysHard.Merge_Overlapping_subarray;
import java.util.*;
public class optimal {
    public static void main(String[] args) {
        int arr[][]={{1,3},{8,10},{15,18},{2,6}};
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int []a,int []b){
                return a[0]-b[0];
            }
        });
        List<List<Integer>>list=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        if (list.isEmpty()||arr[i][0]>list.get(list.size()-1).get(1)){
            list.add(Arrays.asList(arr[i][0],arr[i][1]));
        }else{
            list.get(list.size()-1).set(1,Math.max(list.get(list.size()-1).get(1),arr[i][1]));
        }
       }
       System.out.println(list);
    }
    
}
