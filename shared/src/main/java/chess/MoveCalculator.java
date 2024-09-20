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
                    break;
                case BISHOP:
                    BishopMoveCalculator bishopMoveCalculator = new BishopMoveCalculator();
                    moves.addAll(bishopMoveCalculator.pieceMoves(board, myPosition));
                    break;
                case KING:
                    KingMoveCalculator kingMoveCalculator = new KingMoveCalculator();
                    moves.addAll(kingMoveCalculator.pieceMoves(board, myPosition));
                    break;
                case KNIGHT:
                    KnightMoveCalculator knightMoveCalculator = new KnightMoveCalculator();
                    moves.addAll(knightMoveCalculator.pieceMoves(board, myPosition));
                    break;
                case QUEEN:
                    QueenMoveCalculator queenMoveCalculator = new QueenMoveCalculator();
                    moves.addAll(queenMoveCalculator.pieceMoves(board, myPosition));
                    break;
                case PAWN:
                    PawnMoveCalculator pawnMoveCalculator = new PawnMoveCalculator();
                    moves.addAll(pawnMoveCalculator.pieceMoves(board, myPosition));
                    break;
            }

            return moves;
    }
}
