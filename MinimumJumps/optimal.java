package MinimumJumps;
public class optimal{
    public static void main(String[] args) {
        
    
    int arr[]={3,4,5,2,3,1,4,2};
    int farthest=0;
    int jump=0;
    int current=0;
    for(int i=0;i<arr.length-1;i++){
        farthest=Math.max(arr[i]+i,farthest);
        if (i==current){
            current =farthest;
            jump++;
        }
    }
    System.out.println(jump);;

}
}
