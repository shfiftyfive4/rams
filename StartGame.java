public class StartGame {

  private static final char LETTER_COORDS[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
  private static final boolean[][] initial = new boolean[BOARD_DIM][];
  initial[0][] = {Checker.EMPTY, Checker.BLACK, Checker.EMPTY, Checker.BLACK, Checker.EMPTY, Checker.BLACK, Checker.EMPTY, Checker.BLACK};
  initial[1][] = {Checker.BLACK, Checker.EMPTY, Checker.BLACK, Checker.EMPTY, Checker.BLACK, Checker.EMPTY, Checker.BLACK, Checker.EMPTY};
  initial[2][] = initial[0][];
  initial[3][] = Checker.EMPTY;
  initial[4][] = Checker.EMPTY;
  initial[5][] = {Checker.RED, Checker.EMPTY, Checker.RED, Checker.EMPTY, Checker.RED, Checker.EMPTY, Checker.RED, Checker.EMPTY};
  initial[6][] = {Checker.EMPTY, Checker.RED, Checker.EMPTY, Checker.RED, Checker.EMPTY, Checker.RED, Checker.EMPTY, Checker.RED};
  initial[7][] = initial[5][];
  
  private static CheckerBoard board;

  public StartGame(boolean opponent) {
    board = new CheckerBoard(initial);
    System.out.print(board.toString());
  }
  
  public static void main(String[] args) {
    board = new CheckerBoard(initial);
    System.out.print(board.toString());
  }
}
  