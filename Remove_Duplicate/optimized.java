package ArraysEasy.Remove_Duplicate;

public class optimized {
    public static void main(String[] args) {
    int arr[]={1,1,1,1,2,2,3,3,4,7};
    int i=0;
    for (int j=1;j<arr.length;j++){
        if (arr[i]!=arr[j]){
            arr[i+1]=arr[j];
            i++; 
        }
    }
    for (int num:arr){
        System.out.print(num+" ");
    }
    int count=i+1;
    System.out.print("count of unique "+ count);
    
}
}