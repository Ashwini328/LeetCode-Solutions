class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] grid=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]='.';
            }
        }
        nQueen(0,n,grid,res);
        return res;
    }
    public static void nQueen(int row,int n,char[][] grid,List<List<String>> res){
        if(row==n){
            List<String> list=new ArrayList<>();
            for(int i=0;i<n;i++)
                list.add(new String(grid[i]));
            res.add(list);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(row,i,grid,n)){
                grid[row][i]='Q';
                nQueen(row+1,n,grid,res);
                grid[row][i]='.';
            }
        }
    }
    public static boolean isSafe(int row,int col,char[][] grid,int n){
        for(int i=row-1;i>=0;i--)
            if(grid[i][col]=='Q')
                return false;
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
            if(grid[i][j]=='Q')
                return false;
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++)
            if(grid[i][j]=='Q')
                return false;
        return true;
    }
}