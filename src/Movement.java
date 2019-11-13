
public class Movement {

	public Piece piece;
	public char originColumn;
	public int originRow;
	public char destColumn;
	public int destRow;
	
	public Movement(Piece piece,char originColumn,int originRow,char destColumn,int destRow) {
		this.piece = piece;
		this.originColumn = originColumn;
		this.originRow = originRow;
		this.destColumn = destColumn;
		this.destRow = destRow;
	}
	
	@Override
	public String toString() {
		return piece + " from " + originColumn + originRow + " to " + destColumn + destRow;
	}
}
