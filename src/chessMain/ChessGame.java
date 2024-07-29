package chessMain;

import boardGame.*;
import chess.ChessMatch;

public class ChessGame{
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	
	}
}