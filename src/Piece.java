
public class Piece {

	private TypeOfPiece type;
	private Color color;
	
	public Piece(TypeOfPiece type,Color color) {
		this.type = type;
		this.color = color;
	}
	
	@Override
	public String toString() {
		String s;
		
		if (color == Color.WHITE) {
			s = "WHITE ";
		} else {
			s = "BLACK ";
		}
		
		switch (type) {
		case PAWN:
			s += "PAWN";
			break;
		case TOWER:
			s += "TOWER";
			break;
		case KNIGHT:
			s += "KNIGHT";
			break;	
		case BISHOP:
			s += "BISHOP";
			break;	
		case QUEEN:
			s += "QUEEN";
			break;	
		case KING:
			s += "KING";
			break;	
		default:
			break;
		}
		
		return s;
		
	}
	
	public String getLetter() {
		String s = "";

		switch (type) {
		case PAWN:
			s = "p";
			break;
		case TOWER:
			s = "t";
			break;
		case KNIGHT:
			s = "k";
			break;	
		case BISHOP:
			s = "b";
			break;	
		case QUEEN:
			s = "q";
			break;	
		case KING:
			s = "x";
			break;	
		default:
			break;
		}
		
		if (color == Color.BLACK) {
			s = s.toUpperCase();
		}
		
		return s;
	}
	
	
}
