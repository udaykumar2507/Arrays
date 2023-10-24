package ArraysHard.RepeatingandMissingNum;
public class Better {
    public static void main(String[] args) {
        int mis=-1;
        int rep=-1;
        int arr[]={1,3,4,4,6,2};
        int arr1[]=new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
        for (int i=1;i<arr1.length;i++){
            if (arr1[i]==2){
                rep=i;
            }
            if (arr1[i]==0){
                mis=i;
            }
        }
        System.out.println("Repeating  num is "+rep);
        System.out.println("Misssing num is "+mis);

        
    }
    
}
