package ArraysHard.Pascal_Triangle;

public class Optimal {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            printNthRow(i);
            System.out.println();
        }
    }

    public static void printNthRow(int row) {
        int ans = 1;

        for (int i = 0; i <= row; i++) { 
            System.out.print(ans + " "); 
            ans = ans * (row - i) / (i + 1); 
        }
    }
}