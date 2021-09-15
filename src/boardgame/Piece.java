package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) { //um metodo concreto
		return possibleMoves()[position.getRow()][position.getCollum()]; // um metodo abstrato
	} // ou seja um metodo concreto "possibleMove" utilizando um metodo abstrato "possibleMoves" (Hook methods - metodos de gancho)
	
	public boolean isThereAnyPossibleMove() {
		boolean [][] mat = possibleMoves();
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
