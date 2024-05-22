package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku36 {
//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//
//Each row must contain the digits 1-9 without repetition.
//Each column must contain the digits 1-9 without repetition.
//Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//Note:
//
//A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//Only the filled cells need to be validated according to the mentioned rules.

  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      Set<Character> rowSet = new HashSet<>(9);
      Set<Character> colSet = new HashSet<>(9);
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.') {
          boolean notContainsRow = rowSet.add(board[i][j]);
          if (!notContainsRow) {
            return false;
          }
        }
        if (board[j][i] != '.') {
          boolean notContainsCol = colSet.add(board[j][i]);
          if (!notContainsCol) {
            return false;
          }
        }
      }
    }
    for (int i = 0; i < 9; i +=3) {
      for (int j = 0; j < 9; j+=3) {
        Set<Character> subBoardSet = new HashSet<>(9);
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            if (board[j+k][i+l] != '.') {
              boolean notContainsCol = subBoardSet.add(board[j+k][i+l]);
              if (!notContainsCol) {
                return false;
              }
            }
          }
        }
      }
    }
    return true;
  }
}
