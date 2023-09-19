package ArraysEasy.Remove_Duplicate;
import java.util.HashSet;
import java.util.Set;
public class Brute {
    public static void main(String[] args) {
        Set<Integer>hashSet=new HashSet<>();
        int arr[]={1,2,2,3,3,3,4,4};
        for (int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        for(int num:hashSet){
            System.out.print(num+" ");//To insert and set it takes nlogn
                                      //To print the element take n therefore total complexity=o(nlogn+n) 
        }
        
    }
    
}
