import java.io.*;
import java.util.*;

public class knightsTour {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int r = sc.nextInt();
        int c = sc.nextInt();
        printKnightsTour(arr,r,c,0);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        displayBoard(chess);
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}