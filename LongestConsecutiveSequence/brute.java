package LongestConsecutiveSequence;

public class brute {
    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1,1,5};
        int longest=1;
        for (int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=1;
            for(int j=0;j<arr.length;j++){
                if(linearsearch(arr, x+1)==true){
                    count++;
                    x++;
                    longest=Math.max(count,longest);
                }
            }
        }
        System.out.println(longest);
    }
    public static boolean linearsearch(int []arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
    
}
