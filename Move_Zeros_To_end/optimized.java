package Arrays.Move_Zeros_To_end;


public class optimized {
    public static void main(String[] args) {
        int []arr={1,2,3,0,4,0,5,6};
        int j=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                j=i;
                break;
            }
        }
        for (int k=j+1;k<arr.length;k++){
            if (arr[k]!=0){
                swap(arr,k,j);
                j++;
            }
        }
        for (int num:arr){
            System.out.print(num+" ");
        }

        
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;

    }
    
}
