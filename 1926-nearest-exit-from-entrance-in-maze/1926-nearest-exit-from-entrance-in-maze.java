class Pair
{
    int row;
    int col;
    int steps;
    Pair(int _row , int _col , int _steps)
    {
        this.row = _row;
        this.col = _col;
        this.steps = _steps;
    }
}

class Solution 
{
    public int nearestExit(char[][] maze, int[] entrance) 
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(entrance[0] , entrance[1] , 0));
        int m = maze.length;
        int n = maze[0].length;
        int visited[][] = new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(maze[i][j] == '+')
                    visited[i][j] = 1;
                else
                    visited[i][j] = 0;
            }
        }
        
        int arow[] = {1,0,-1,0};
        int acol[] = {0,-1,0,1};
        int ans = -1;
        boolean flag = false;
        
        while(!q.isEmpty())
        {
            int row = q.peek().row;
            int col = q.peek().col;
            int steps = q.peek().steps;
            q.remove();
            visited[row][col] = 1;
            for(int i=0;i<4;i++)
            {
                int nrow = row + arow[i];
                int ncol = col + acol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol] != 1)
                {
                    visited[nrow][ncol] = 1;
                    q.add(new Pair(nrow,ncol,steps+1));
                    if(ncol==0 || nrow==0 || nrow==m-1 || ncol==n-1)  
                    {
                        flag = true;
                        ans = steps+1;
                        break;
                    }
                }
            }
            
            if(flag == true)
                break;
        }
        
        return ans;
        
    }
}