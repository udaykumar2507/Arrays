package ArraysHard.MajorityElement;

import java.util.ArrayList;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={11,13,13,11,11,13};
        ArrayList<Integer>list=new ArrayList<>();
        int cn1=0;
        int cn2=0;
        int El1=Integer.MIN_VALUE;
        int El2=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (cn1==0 && arr[i]!=El2){
                cn1=1;
                El1=arr[i];
            }
            else if (cn2==0 && arr[i]!=El1){
                cn2=1;
                El2=arr[i];
            }
            else if(El1==arr[i]){cn1++;}
            else if (El2==arr[i]){cn2++;}
            else{ cn1--;cn2--;}
        }
        cn1=0;cn2=0;
        int min=(int)(arr.length/3)+1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==El1){cn1++;}
            if (arr[i]==El2){cn2++;}
        }
        if (cn1>=min){
            list.add(El1);
        }if(cn2>=min){
            list.add(El2);
        }
        System.out.println(list);
    }
    
}
