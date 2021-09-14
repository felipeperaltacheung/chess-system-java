package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		
		while(true){
			UI.printBoard(chessMatch.getPieces()); //UI->user interface
			System.out.println();
			System.out.print("Source:");
			ChessPosition source = UI.readChessPosition(sc); // lendo a posicao de origem
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
}


//https://github.com/acenelio/chess-system-design
//https://github.com/acenelio/chess-system-java