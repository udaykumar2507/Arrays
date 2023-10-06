
package NextPermutation;
import java.util.*;
public class optimal{
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(new Integer[]{2,1,5,4,3,0,0});
        int n=l.size();
        int ind=-1;
        for (int i=n-2;i>=0;i--){
            if (l.get(i)<l.get(i+1)){
                ind=i;
                break;
            }
        }
        if (ind==-1){
            Collections.reverse(l);
            for (int num:l){
                System.out.println(num+" ");
            }
        }
        for (int i=n-1;i>ind;i--){
            if(l.get(i)>l.get(ind)){
                int temp=l.get(i);
                l.set(i,l.get(ind));
                l.set(ind,temp);
                break;
            }
        }
        List<Integer> sublist=l.subList(ind+1,n);
        Collections.reverse(sublist);
          for (int num:l){
                System.out.println(num+" ");
            }

    }
}
