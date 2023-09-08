package Arrays.Move_Zeros_To_end;
import java.util.ArrayList;

public class brute {
    public static void main(String[] args) {
        int[] arr={1,0,5,0,4,0,7,8};
        ArrayList<Integer>mylist=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                mylist.add(arr[i]);
            }
        }
        for (int i=0;i<mylist.size();i++){
            arr[i]=mylist.get(i);
        }
        for (int i=mylist.size();i<arr.length;i++){
            arr[i]=0;
        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
    
}
