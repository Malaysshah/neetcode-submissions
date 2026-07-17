class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            boolean row[]=new boolean[9];
            boolean col[]=new boolean[9];
            for(int j=0;j<9;j++)
            {
                if(valid(board[i][j]))
                {
                    if(row[board[i][j]-'1'])
                    {
                        return false;
                    }
                    row[board[i][j]-'1']=true;
                }
                if(valid(board[j][i]))
                {
                    if(col[board[j][i]-'1'])
                    {
                        return false;
                    }
                    col[board[j][i]-'1']=true;
                }
            }
        }

        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                boolean cross[]=new boolean[9];
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
                        if(valid(board[k][l]))
                        {
                            if(cross[board[k][l]-'1'])
                            {
                                return false;
                            }
                            cross[board[k][l]-'1']=true;
                        }
                    }
                }
            }
        }

        return true;
    }

    public boolean valid(char c)
    {
        return c>='1' && c<='9';
    }
}
