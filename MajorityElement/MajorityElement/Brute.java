package ArraysHard.MajorityElement.MajorityElement;

import java.util.ArrayList;

public class Brute {
    public static void main(String[] args) {
        int arr[]={1,3,3,2,2,2,2,1,1,1};
        ArrayList <Integer>list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (list.size()==0||list.get(0)!=arr[i]){
                int cnt=0;
                for (int j=0;j<arr.length;j++){
                    if (arr[j]==arr[i]){
                        cnt++;
                    }
                }
                if (cnt>arr.length/3){
                    list.add(arr[i]);
                }
            }
            if (list.size()==2){
                break;
            }
        }
        System.out.println(list);


    }
    
}
