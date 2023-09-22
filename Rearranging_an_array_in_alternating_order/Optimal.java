package Rearranging_an_array_in_alternating_order;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={-3,3,4,5,-4,-6,-5,8};
        int n=arr.length;
        int arr1[]=new int[n];
        int pos=0,neg=1;
        for(int i=0;i<n;i++){
            if (arr[i]<0){
                arr1[neg]=arr[i];
                neg+=2;
            }
            else{
                arr1[pos]=arr[i];
                pos+=2;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}
