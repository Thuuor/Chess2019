
public class Game {

	private Board board;
	private Movement[] movements;
	private int numMovements;
	
	public Game() {
		numMovements = 0;
		board = new Board();
		movements = new Movement[10000];
		
		for (int i = 0; i < movements.length; i++) {
			movements[i] = null;
		}
	}
	
	public void movePiece(Movement m) {
		if (board.movePiece(m)) {
			movements[numMovements] = m;
			numMovements++;
		}
	}
	
	@Override
	public String toString() {
		String s = board.toString();
		for (int i = 0; i < numMovements; i++) {
			s += movements[i] + "\n";
		}
		return s;
	}
	
	public Piece getPieceAt(char col,int row) {
		return board.getPieceAt(col, row);
	}
}
