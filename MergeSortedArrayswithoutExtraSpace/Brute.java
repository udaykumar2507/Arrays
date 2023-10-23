package ArraysHard.MergeSortedArrayswithoutExtraSpace;

public class Brute {
    public static void main(String[] args) {
        int []arr1={1,3,5,7};
        int arr2[]={0,2,6,8,9};
        int n=arr1.length;int m=arr2.length;
        int arr3[]=new int[n+m];
        int left=0;
        int right=0;
        int index=0;
        while(left<n && right<m){
            if (arr1[left]<=arr2[right]){
                arr3[index]=arr1[left];
                index++;left++;
            }
            else{
                arr3[index]=arr2[right];
                index++;right++;
            }
        }
            while(left<n){
                arr3[index]=arr1[left];
                index++;
                left++;
            }
            while(right<m){
                arr3[index]=arr2[right];
                right++;
                index++;
            }
        for (int i=0;i<n+m;i++){
            if (i<n){
                arr1[i]=arr3[i];
            }
            else{
                arr2[i-n]=arr3[i];
            }
        }
        for  (int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
