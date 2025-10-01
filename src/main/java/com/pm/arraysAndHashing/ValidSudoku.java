package com.pm.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    private boolean isValidSudoku(char[][] board) {
        Set[] rows = new Set[9];
        Set[] cols = new Set[9];
        Set[] boxes = new Set[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet();
            cols[i] = new HashSet();
            boxes[i] = new HashSet();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (rows[i].contains(board[i][j]) || cols[j].contains(board[i][j]) || boxes[(i/3)*3 + (j/3)].contains(board[i][j])) {
                    return false;
                }

                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);
                boxes[(i/3)*3+(j/3)].add(board[i][j]);
            }
        }
        return true;
    }

    public boolean solution() {
        return isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        });
    }
}
