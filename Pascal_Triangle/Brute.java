package ArraysHard.Pascal_Triangle;

import java.util.ArrayList;

public class Brute {
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        printpascal(list, n);   
    }
    public static void printpascal(ArrayList<ArrayList<Integer>>list,int n) {
        for (int i=0;i<n;i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for (int j=0;j<=i;j++){
                temp.add(ncr(i,j));
            }
            list.add(temp);
        }
           System.out.println(list);
    }
    public static int  ncr(int row,int col){
        int res=1;
        for (int i=0;i<col;i++){
            res=res*(row-i);
            res=res/(i+1);
        }
        return res;
    }
}
