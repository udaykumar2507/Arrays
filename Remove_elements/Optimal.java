package Remove_elements;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={2,5,2,3,2,1,2};
        int val=2;
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=val){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Index is "+index);
    }
}
