public class Minesweeper{

     public static void main(String[] args){
     
     int m= Integer.parseInt(args[0]);
     int n= Integer.parseInt(args[1]);
     int k= Integer.parseInt(args[2]);
     int x=0;
     int y=0;
     int j = 0;
     
     String[][] board = new String[m][n];
     int[][] board2 = new int[m][n];
     
     while (j<k){
         x = (int)(Math.random()*m);
         y = (int)(Math.random()*n);
         if (board[x][y]=="*"){continue;}
         else {
             board[x][y]="*";
             j +=1;
         }
         
         }
     
     for (int i=0;i<m;i++){
         for(int t=0;t<n;t++){
             if (board[i][t]!="*"){
                  if (i<m-1 && t<n-1 && board[i+1][t+1]=="*"){
                      board2[i][t]+=1;
                  }
                  if (i<m-1 && t>0 && board[i+1][t-1]=="*"){
                      board2[i][t]+=1;
                  }
                  if (i>0 && t>0 && board[i-1][t-1]=="*"){
                      board2[i][t]+=1;
                  }
                  if (i>0 && t<n-1 && board[i-1][t+1]=="*"){
                      board2[i][t]+=1;
                  }
                  if (i<m-1 && board[i+1][t]=="*"){
                      board2[i][t]+=1;
                  }
                  if (i>0 && board[i-1][t]=="*"){
                      board2[i][t]+=1;
                  }
                  if (t<n-1 && board[i][t+1]=="*"){
                      board2[i][t]+=1;
                  }
                  if (t>0 && board[i][t-1]=="*"){
                      board2[i][t]+=1;
                  }
                  System.out.print(board2[i][t] + "  ");
             }
             else{
                 System.out.print(board[i][t] + "  ");
             }
            
         }
        System.out.println();
     }
     
     
     }
}