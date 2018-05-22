public class Checker {

  public static final boolean BLACK = true;
  public static final boolean RED = false;
  public static final boolean EMPTY = false;
  
  private boolean color;
  private boolean isKing;
  
  public Checker(boolean color) {
    this.color = color;
    this.isKing = false;
  }
  
  public void kingMe() {
    isKing = true;
  }
  
  public boolean kingCheck() {
    return isKing;
  }
  
  @Override
  public String toString() {
    if (this.color == Checker.RED) 
      return this.isKing ? "R" : "r";
    else 
      return this.isKing ? "B" : "b";
  }
  
  public static void main(String[] args) {
    Checker myPiece = new Checker(Checker.RED);
    System.out.println(myPiece.toString());
    
    myPiece.kingMe();
    System.out.println(myPiece.toString());
  }
}