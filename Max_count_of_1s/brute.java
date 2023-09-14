package Arrays.Max_count_of_1s;
public class brute {
    public static void main(String[] args) {
        int arr[]={1,1,0,0,1,1,1,0,1,1,1};
        int count=0;
        int max1=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1){
                count+=1;
                max1=Math.max(count,max1);
            }
            else{
                count=0;
            }
        }
        System.out.println(count);


       
        }
    }

