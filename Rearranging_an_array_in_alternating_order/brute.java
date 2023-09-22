package Rearranging_an_array_in_alternating_order;
import java.util.ArrayList;
public class brute {
    public static void main(String[] args) {
        int arr[]={-1,4,5,4,-3,2,-9,-8};
        int n=arr.length;
        ArrayList<Integer>posList=new ArrayList<>();
        ArrayList<Integer>NegList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if (arr[i]>0){
                posList.add(arr[i]);
            }
            else{
                NegList.add(arr[i]);
            }
        }
        for(int i=0;i<n/2;i++){
            arr[i*2]=posList.get(i);
            arr[i*2+1]=NegList.get(i);
        }
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
    
}
