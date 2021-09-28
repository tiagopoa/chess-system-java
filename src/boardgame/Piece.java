package boardgame;

public class Piece {

	protected Position position;
	public Board board;
	
	public Piece() {
		
	}
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}	
	
	protected Board getBoard() {
		return board;
	}

	public Piece[][] possibleMoves(){
		
	}
	
	public boolean possibleMove(Position position) {
		return false;
	}
	
	public boolean isThereAnyPossibleMove() {
		return false;
	}
	
}
