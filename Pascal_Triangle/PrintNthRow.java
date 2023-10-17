package ArraysHard.Pascal_Triangle;
public class PrintNthRow{
    public static void main(String[] args) {
        int row=5;
        NthRow(row);
        
    }
    public static void NthRow(int row){
        int ans=1;
        System.out.print(1+" ");
        for (int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
             System.out.print(ans+" ");
        }

    }
}