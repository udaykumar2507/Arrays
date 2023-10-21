package ArraysHard.FourSum;
import java.util.*;
public class Optimal {
    public static void main(String[] args) {
        List<List<Integer>>list=new ArrayList<>();
        int arr[]={1,0,-1,0,-2,2};
        int target=0;
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (i>0 && arr[i-1]==arr[i]){continue;}
            for (int j=i+1;j<arr.length;j++){
                if (j>i+1 && arr[j-1]==arr[j] ){continue;}
                int k=j+1;
                int l=arr.length-1;
                while(k<l){
                    long sum=arr[i];
                    sum+=arr[j];
                    sum+=arr[k];
                    sum+=arr[l];
                    if (sum==target){
                        List<Integer>list1=new ArrayList<>();
                        list1.add(arr[i]);
                        list1.add(arr[j]);
                        list1.add(arr[k]);
                        list1.add(arr[l]);
                        list.add(list1);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]){k++;}
                        while(k<l && arr[l]==arr[l+1]){l--;}
                    }
                    else if (sum<target){
                        k++;
                    }else{
                        l--;
                    }

                }
            }
        }
        System.out.println(list);
    }
    
    
}
