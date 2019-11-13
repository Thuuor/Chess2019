
public class MainChess {

	public static void main(String[] args) {
		
		
		Board b1 = new Board();
		System.out.println(b1);
		
		Movement m1 = new Movement(b1.getPieceAt('D', 2),'D',2,'D',3);
		
		b1.movePiece(m1);
		System.out.println(b1);
		
		System.out.println("-----------------");
		
		Game game = new Game();
		game.movePiece(new Movement(game.getPieceAt('D', 2), 
				'D', 2,'D', 3));
		game.movePiece(new Movement(game.getPieceAt('E', 7), 
				'E', 7, 'E', 5));
		System.out.println(game);
	}

}
