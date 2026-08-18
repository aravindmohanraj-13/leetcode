class Solution {
public:
    vector<vector<string>> ans;
    bool isSafe(int row, vector<string>& board, int col, int n) {
        int r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        while (c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            c--;
        }
        r = row;
        c = col;
        while (r < n && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r++;
            c--;
        }
        return true;
    }

    void solve(vector<string>& board, int n, int col) {
        if (col == n) {
            ans.push_back(board);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, board, col, n)) {
                board[row][col] = 'Q';
                solve(board, n, col + 1);
                board[row][col] = '.';
            }
        }
    }

    vector<vector<string>> solveNQueens(int n) {
        vector<string> board(n, string(n, '.'));
        solve(board, n, 0);
        return ans;
    }
};