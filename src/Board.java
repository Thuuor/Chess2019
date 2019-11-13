
public class Board {

	public static final int SIZE = 8;	
	private Piece[][] board;
	
	public Board() {
		board = new Piece[SIZE][SIZE];
		board[0][0] = new Piece(TypeOfPiece.TOWER,Color.WHITE);
		board[0][7] = new Piece(TypeOfPiece.TOWER,Color.WHITE);
		board[7][0] = new Piece(TypeOfPiece.TOWER,Color.BLACK);
		board[7][7] = new Piece(TypeOfPiece.TOWER,Color.BLACK);
		
		board[0][1] = new Piece(TypeOfPiece.KNIGHT,Color.WHITE);
		board[0][6] = new Piece(TypeOfPiece.KNIGHT,Color.WHITE);
		board[7][1] = new Piece(TypeOfPiece.KNIGHT,Color.BLACK);
		board[7][6] = new Piece(TypeOfPiece.KNIGHT,Color.BLACK);
		
		board[0][2] = new Piece(TypeOfPiece.BISHOP,Color.WHITE);
		board[0][5] = new Piece(TypeOfPiece.BISHOP,Color.WHITE);
		board[7][2] = new Piece(TypeOfPiece.BISHOP,Color.BLACK);
		board[7][5] = new Piece(TypeOfPiece.BISHOP,Color.BLACK);
		
		board[0][3] = new Piece(TypeOfPiece.QUEEN,Color.WHITE);
		board[0][4] = new Piece(TypeOfPiece.KING,Color.WHITE);
		board[7][3] = new Piece(TypeOfPiece.QUEEN,Color.BLACK);
		board[7][4] = new Piece(TypeOfPiece.KING,Color.BLACK);
		
		for (int col = 0; col < board.length;col++) {
			board[1][col] = new Piece(TypeOfPiece.PAWN,Color.WHITE);
			board[6][col] = new Piece(TypeOfPiece.PAWN,Color.BLACK);
		}
		
		for (int row = 2;row < board.length - 2; row++) {
			for (int col = 0;col < board[0].length;col++) {
				board[row][col] = null;
			}
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		char c = 'A';

		for (int row = board.length - 1;row >= 0; row--) {
			s += "\n";
			s += row+1 + " ";
			for (int col = 0;col < board.length;col++) {
				 if (board[row][col] == null) {
					 s += ". ";
				 } else {
					 s += board[row][col].getLetter() + " ";
				 }
			}
		}
		s += "\n";
		s += " ";
		for (int i = 0;i < board.length;i++) {
			s += " " + c;
			 c++;
		}
		return s;
	}
}
