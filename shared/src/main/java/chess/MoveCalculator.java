package chess;

import java.util.ArrayList;
import java.util.Collection;

public class MoveCalculator {
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
            Collection<ChessMove> moves = new ArrayList<>();
            ChessPiece.PieceType piece = board.getPiece(myPosition).getPieceType();

            switch (piece){

                case ROOK:
                    RookMoveCalculator rookMoveCalculator = new RookMoveCalculator();
                    moves.addAll(rookMoveCalculator.pieceMoves(board, myPosition));
                case BISHOP:
                    BishopMoveCalculator bishopMoveCalculator = new BishopMoveCalculator();
                    moves.addAll(bishopMoveCalculator.pieceMoves(board, myPosition));
                case KING:
                    KingMoveCalculator kingMoveCalculator = new KingMoveCalculator();
                    moves.addAll(kingMoveCalculator.pieceMoves(board, myPosition));


            }

            return moves;
    }
}
