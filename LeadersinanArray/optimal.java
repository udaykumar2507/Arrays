package LeadersinanArray;
import java.util.*;
public class optimal {
    public static void main(String[] args) {
    int arr[]={10,22,12,3,0,6};
    ArrayList<Integer>l=new ArrayList<>();
    int max=Integer.MIN_VALUE;
    for(int i=arr.length-1;i>=0;i--){
        if (arr[i]>max && arr[i]>max){
            max=arr[i];
            l.add(arr[i]); 
        }      
    }
    for(int i=0;i<l.size();i++){
        System.out.println(l.get(i));
    }
    }
    
}
