package Search_insert_position;

public class Better {
    public static void main(String[] args) {
        //Binary Search approach (if the element not found (start) lies at the (end of the arr)+1  and (end) lies in the end)
        int []arr={1,3,5,7,9,10};
        int target=10;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                System.out.println(mid);
            }
            if (target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(start);
    }
    
}
