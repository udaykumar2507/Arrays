package ArraysHard.RepeatingandMissingNum;

public class Brute {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,1};
        int mis=-1;int rep=-1;
        for (int i=1;i<=arr.length;i++){
            int c=0;
            for (int  j=0;j<arr.length;j++){
                if (i==arr[j]){
                    c++;
                }
            }
            if(c==0){
                mis=i;
            }if (c==2){
                rep=i;
            }
            if (rep != -1 && mis != -1){
                break;
            }

        }
        System.out.println("Repeating  num is "+rep);
        System.out.println("Misssing num is "+mis);

       
    }
    
}
