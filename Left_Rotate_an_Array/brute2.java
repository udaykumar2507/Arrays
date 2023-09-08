package Arrays.Left_Rotate_an_Array;
import java.util.ArrayList;

public class brute2 {
    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7,8};
        int n=arr.length;
        int k=3;
        ArrayList<Integer>mylist=new ArrayList<>(); 
        for (int i=0;i<k;i++){
            mylist.add(arr[i]);
        }
        for (int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=n-k;i<arr.length;i++){
            arr[i]=mylist.get(j);
            j++;
        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
    
}
