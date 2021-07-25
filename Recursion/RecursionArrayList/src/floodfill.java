
import java.util.Scanner;

public class floodfill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][] = new int[n][m];
        
        for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<a[0].length;j++)
        {
            a[i][j] = sc.nextInt();
        }
        }
        boolean visited[][] = new boolean[n][m];
        floodfill(a,0,0,"",visited);
     }
    
     public static void floodfill(int[][] maze, int r, int c, String psf ,boolean visited[][]) {
    
         if(r<0 || c<0 || r==maze.length || c==maze[0].length || maze[r][c]==1 || visited[r][c]==true)
         { 
         return;
         }
         if(r==maze.length-1 && c==maze[0].length-1)
         {
             System.out.println(psf);
             return;
         }
         
         visited[r][c]=true;
         floodfill(maze ,r-1 ,c ,psf + "t" , visited);
         floodfill(maze,r ,c-1 ,psf + "l" , visited);
         floodfill(maze ,r+1 ,c ,psf + "d" ,visited);
         floodfill(maze,r ,c+1 ,psf + "r" ,visited);
         visited[r][c]=false;         
    }
}
