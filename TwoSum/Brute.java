package ArrayMedium.TwoSum;

public class Brute {
    public static void main(String[] args) {
        int arr[]={2,5,6,3,12,1};
        int k=25;
        int flag=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==k){
                    flag=1;
                    System.out.print(i+" "+j);
                    break;
                }
            }
        }
        if (flag==0){
            System.out.println(-1);
        }
       

    }
    
}
