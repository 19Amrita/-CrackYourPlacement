class Solution {
    public void gameOfLife(int[][] board) {
        int rows=board.length;
        int col=board[0].length;
        int [][]temp=new int[rows][col];
        for(int r=0; r<rows; r++)
        {
            for(int c=0; c<col; c++)
            {
                int liveneig=nei(board,r-1,c-1) + nei(board,r-1,c) + nei(board,r-1,c+1) + nei(board,r,c+1) + nei(board,r+1,c+1) + nei(board,r+1,c) + nei(board,r+1,c-1) + nei(board,r,c-1);
                if(board[r][c]==1)
                {
                    temp[r][c]=(liveneig<2 || liveneig>3)?0:1;
                }
                else
                {
                    temp[r][c]=(liveneig==3)?1:0;
                }
            }
        }
        for(int r=0; r<rows; r++)
        {
            board[r]=temp[r].clone();
        }
    }
    public int nei(int [][]board,int r,int c)
    {
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]==0){
            return 0;
        }
        return 1;
    }
}