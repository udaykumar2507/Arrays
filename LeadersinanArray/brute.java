package LeadersinanArray;

import java.util.*;

public class brute {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        ArrayList<Integer>l=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            boolean pass=true;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[i]){
                    pass=false;
                    break;
                }
            }
            if(pass==true){
                l.add(arr[i]);
            }
        }
        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
    
}
