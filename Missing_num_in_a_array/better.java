package Arrays.Missing_num_in_a_array;

public class better {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length+2;
        int [] hash=new int[n];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]=1;
        }
        for(int i=1;i<n;i++){
           if( hash[i]==0){
            System.out.println(i);
           }
        }
    }
    
}
