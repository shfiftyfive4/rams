public class CheckerBoard {

  public static final int BOARD_DIM = 8;
  private Checker[][] board;
  
  public CheckerBoard(boolean[][] initial) {
    board = new Checker[BOARD_DIM][BOARD_DIM];
    for (int i = 0; i < board.length; ++i) {
      for (int j = 0; j < board.length; ++j) {
        if (initial[i][j] != Checker.EMPTY)
            board[i][j] = new Checker(initial[i][j]);
      }
    }
  }
  
  public boolean kingCheck(int row, int column) {
    return board[row][column].kingCheck();
  }
  
  public void kingMe(int row, int column) {
    if (board[row - 1][column - 1] != null)
      board[row][column].kingMe();
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < board.length; ++i) 
        sb.append("-");
      sb.append("\n");
    for (int i = 0; i < board.length; ++i) {
      for (int j = 0; i < board.length; ++j) {
        if (board[i][j] != null)
          sb.append("|" + board[i][j].toString());
        else
          sb.append("| ");
      }    
      sb.append("|\n");
      for (int j = 0; j < board.length * 2; ++j) 
        sb.append("-");
      sb.append("\n");
    }
    
    return sb.toString();
  }
}
  