package ArraysHard.MajorityElement.MajorityElement;
import java.util.*;


public class better {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,3,3,3,3,1};
        HashMap<Integer,Integer>mpp = new HashMap<>();
        ArrayList <Integer> list=new ArrayList<>();
        int min=(int)(arr.length/3);
        for (int i=0;i<arr.length;i++){
            int count=(mpp.getOrDefault(arr[i],0));
            mpp.put(arr[i],count+1);
            if (count==min){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
      
        }

    }
