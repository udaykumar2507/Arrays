package ArraysHard.Pascal_Triangle;
public class Elementingivenpos{
    public static void main(String[] args) {
        int row=5;
        int col=3;
        ncr(row-1,col-1);
        
       

    }
    public static void  ncr(int row,int col){
        int res=1;
        for (int i=0;i<col;i++){
            res=res*(row-i);
            res=res/(i+1);
        }
        System.out.println(res);

    }

    }