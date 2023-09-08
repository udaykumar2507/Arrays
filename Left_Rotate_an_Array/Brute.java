package Arrays.Left_Rotate_an_Array;

public class Brute {
    public static void main(String[] args) {
        
    int arr[]={2,3,4,5,6,7};
    int temp=arr[0];
    for (int i=1;i<arr.length;i++){
        arr[i-1]=arr[i];
    }
    arr[arr.length-1]=temp;
    for (int num:arr){
        System.out.print(num+" ");
    }
}
}
