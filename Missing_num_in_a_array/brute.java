package Arrays.Missing_num_in_a_array;

public class brute {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        for (int i=1;i<arr.length+1;i++){
            int flag=0;
            for(int j=0;j<arr.length;j++){
                if (arr[j]==i){
                    flag=1;
                    break;
                }
            }
             if (flag==0){
                System.out.println(i);

            }
        }
    }
    
}
