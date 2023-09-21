package BestTimetoBuyastock;

public class brute {
    public static void main(String[] args) {
        int arr[]={7,1,0,3,6,4,19};
        int min1=arr[0];
        int profit=0;
        for (int i=1;i<arr.length;i++){
            int cost=arr[i]-min1;
            profit=Math.max(cost,profit);
            min1=Math.min(min1,arr[i]);
            
        }
        System.out.println(min1);
    }
    
}

    

