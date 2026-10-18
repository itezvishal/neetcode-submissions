class Solution {
    public boolean isValidSudoku(char[][] board) {
        return recursion(0,0,board);
    }

    public boolean recursion(int i, int j, char[][] board){
        if(i==9){
            return true;
        }

        if(j==9){
            return recursion(i+1,0,board);
        }

        if(board[i][j]=='.'){
            return recursion(i,j+1,board);
        }

        // for each row
        Set<Character> s=new HashSet<>();

        for(int col=0;col<9;col++){
            char value=board[i][col];

            if(value != ('.') && !s.add(value)){
                return false;
            }
        }


        s.clear();


        // for each col
        for(int row=0;row<9;row++){
            char value=board[row][j];

            if(value !='.' && !s.add(value)){
                return false;
            }
        }

        s.clear();



        // for 3*3 Matrix
        
        int sr=(i/3)*3;
        int sc=(j/3)*3;

        for(int row=sr;row<sr+3;row++){
            for(int col=sc;col<sc+3;col++){
                 char value = board[row][col];

                if (value !='.' && !s.add(value)) {
                    return false;
                }
            }
        }

        return recursion(i+1,0,board);
    } 

}
