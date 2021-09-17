package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int collum) {
		this.row = row;
		this.column = collum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setValues(int row, int column) { //atualizar os valores de uma posicao
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() { //imprimir uma posicao na tela
		return row + ", " + column;
	}
	
}
